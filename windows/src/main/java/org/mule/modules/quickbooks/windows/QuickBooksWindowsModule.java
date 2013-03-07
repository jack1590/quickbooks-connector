/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.modules.quickbooks.windows;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;

import org.apache.commons.lang.StringUtils;
import org.mule.api.MuleMessage;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Module;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.param.OutboundHeaders;
import org.mule.api.config.MuleProperties;
import org.mule.api.store.ObjectDoesNotExistException;
import org.mule.api.store.ObjectStore;
import org.mule.api.store.ObjectStoreException;
import org.mule.modules.quickbooks.api.ObjectStoreHelper;
import org.mule.modules.quickbooks.api.exception.QuickBooksRuntimeException;
import org.mule.modules.quickbooks.api.oauth.DefaultQuickBooksOAuthClient;
import org.mule.modules.quickbooks.api.oauth.OAuthCredentials;
import org.mule.modules.quickbooks.api.oauth.QuickBooksOAuthClient;
import org.mule.modules.quickbooks.api.openid.DefaultOpenIDClient;
import org.mule.modules.quickbooks.api.openid.OpenIDCredentials;
import org.mule.modules.quickbooks.windows.api.DefaultQuickBooksWindowsClient;
import org.mule.modules.quickbooks.windows.api.QuickBooksWindowsClient;
import org.mule.modules.quickbooks.windows.schema.IdType;
import org.mule.modules.quickbooks.windows.schema.ObjectRef;
import org.mule.modules.quickbooks.windows.schema.SyncActivityRequest;
import org.mule.modules.quickbooks.windows.schema.SyncActivityResponse;
import org.mule.modules.quickbooks.windows.schema.SyncActivityResponses;
import org.mule.modules.quickbooks.windows.schema.SyncStatusRequest;
import org.mule.modules.quickbooks.windows.schema.SyncStatusResponse;
import org.mule.modules.quickbooks.windows.schema.SyncStatusResponses;
import org.mule.modules.quickbooks.windows.schema.UserInformation;
import org.mule.modules.utils.mom.JaxbMapObjectMappers;
import org.openid4java.message.MessageException;

import com.zauberlabs.commons.mom.MapObjectMapper;



/**
 * QuickBooks software provides an interface that allows you to use forms such as checks, deposit slips and invoices,
 * making the accounting process more comfortable for the average business owner or manager. By using the built-in
 * functions that pertain to your business, you are able to perform your company accounting by simply recording your
 * vendor activities, customer activities, banking transactions, payroll checks and taxes. QuickBooks handles the
 * accounting portion of each transaction behind the scenes.
 *
 * Read more: QuickBooks Accounting Tutorial | eHow.com http://www.ehow.com/way_5462311_quickbooks-accounting-tutorial.html#ixzz1csaydwxl
 * @author MuleSoft, inc.
 */
@Module(name = "quickbooks-windows", schemaVersion= "4.0", friendlyName = "Quickbooks Windows")
public class QuickBooksWindowsModule
{   
    /**
     * API Key
     */
    @Configurable
    private String consumerKey;

    /**
     * API Secret
     */
    @Configurable
    private String consumerSecret;

    /**
     * Object store reference
     */
    @Configurable
    @Optional
    @Default(MuleProperties.DEFAULT_USER_OBJECT_STORE_NAME)
    private ObjectStore objectStore;

    /**
     * Object store helper
     */
    private ObjectStoreHelper objectStoreHelper;

    /**
     * Quick-Books client. By default uses DefaultQuickBooksWindowsClient class.
     */
    @Configurable
    @Optional
    private QuickBooksWindowsClient client;
    
    private final MapObjectMapper mom = JaxbMapObjectMappers.defaultWithPackage("org.mule.modules.quickbooks.windows.schema").build();

    /**
     * The base uri of the quickbooks endpoint,
     * used to fetch the company uri. 
     * 
     * Quickbooks connector will first use this uri and the realmId to
     * get a second uri, called company uri, 
     * which is the actual quickbooks endpoint for the connector 
     *  
     */
    @Optional
    @Default("https://services.intuit.com/sb")
    @Configurable
    private String baseUri;

    /**
     * Prefix used for storing credentials in ObjectStore. It will be concatenated to the access token identifier.
     * <p>E.g. prefix: "qb_", user identifier (realmId): "12345", key for object store "qb_12345"</p>
     */
    @Configurable
    @Optional
    private String accessTokenIdentifierPrefix;

    /**
     * Specifies if the OpenID response will be verified. By default it is true.
     */
    @Configurable
    @Optional
    @Default("true")
    private boolean verifyOpenIdResponse;

    /**
     * Intuit OAuthClient
     */
    private QuickBooksOAuthClient oAuthClient;

    /**
     * Intuit OpenID client
     */
    private DefaultOpenIDClient openIDClient;    
    
    /**
     * Creates.
     * 
     * For details of the supported objects and its fields: 
     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
     * 0500_QuickBooks_Windows/0500_Supported_Objects">Supported Objects and Operations</a>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:create}
     *
     * @param accessTokenId identifier for QuickBooks credentials.
     * @param type WindowsEntityType of the object.
     * @param entityObject represents the object to be created.
     * @param draft Boolean draft
     *      <p>Saving an IDS object in a draft state prevents it from being synchronized with Quickbooks. Your app 
     *      might want to save an object in a draft state if the user has not finished entering data, or for some other 
     *      reason the user does not want to commit the object for synchronization. You may save an object in draft state 
     *      during a create or update operation by specifying the draft="true" attribute. By default, the Draft attribute 
     *      is false, which means that the saved object will be synchronized with Quickbooks.</p>
     * @param fullResponse Boolean fullResponse. If this flag is true, it will return the created object, otherwise, it
     *                     will return an {@link ObjectRef}.
     * @return The created Object or an {@link ObjectRef} if the fullResponse flag was null of false.
     * 
     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
     *         and a message provided by quickbooks about the error.
     */
    @Processor
    public Object create(String accessTokenId,
                         WindowsEntityType type,
                         @Optional @Default("#[payload]") Object entityObject,
                         @Optional @Default("false") Boolean draft,
                         @Optional @Default("false") Boolean fullResponse)
    {
        return client.create(getAccessTokenInformation(accessTokenId), type,
                             entityObject, generateANewRequestId(), draft, fullResponse);
    }
    
    /**
     * Retrieve objects by ID.
     * 
     * For details of the supported objects:
     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
     * 0500_QuickBooks_Windows/0500_Supported_Objects">Supported Objects and Operations</a>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:get-object}
     * 
     * @param accessTokenId identifier for QuickBooks credentials.
     * @param type WindowsEntityType of the object.
     * @param idType Id {@link IdType} which is assigned by Data Services when the object is created.
     * @return The object.
     * 
     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
     *         and a message provided by quickbooks about the error.
     */
    @Processor
    public Object getObject(String accessTokenId,
                            WindowsEntityType type,
                            @Optional @Default("#[payload]") Object idType)
    {
        return client.getObject(getAccessTokenInformation(accessTokenId), type, (IdType) idType);
    }
    
    /**
     * Updates.
     * 
     * <p>Specify all the parameters for the object, not just the new or changed elements.
     * If you omit an element, it is removed from the object by the update operation.</p>
     * 
     * For details of the supported objects and its fields: 
     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
     * 0500_QuickBooks_Windows/0500_Supported_Objects">Supported Objects and Operations</a>
     * 
     * <p>When updating transaction objects (such as Estimate or Invoice), note the following:</p>
     * <p>* To retain existing line items, specify them in the request XML body and do not change their order. </p>
     * <p>* To remove a line item, omit it. </p>
     * <p>* To add a new line item, insert a new one in the list.</p>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:update}
     *
     * @param accessTokenId identifier for QuickBooks credentials.
     * @param type WindowsEntityType of the object.
     * @param entityObject represents the object to be updated.
     * @param draft Boolean draft 
     *      <p>Saving an IDS object in a draft state prevents it from being synchronized with Quickbooks. Your app 
     *      might want to save an object in a draft state if the user has not finished entering data, or for some other 
     *      reason the user does not want to commit the object for synchronization. You may save an object in draft state 
     *      during a create or update operation by specifying the draft="true" attribute. By default, the Draft attribute 
     *      is false, which means that the saved object will be synchronized with Quickbooks.</p>
     * @param fullResponse Boolean fullResponse. If this flag is true, it will return the created object, otherwise, it
     *                     will return an {@link ObjectRef}.
     * @return The updated Object or an {@link ObjectRef} if the fullResponse flag was null of false.
     * 
     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
     *         and a message provided by quickbooks about the error.
     */
    @Processor
    public Object update(String accessTokenId,
                         WindowsEntityType type,
                         @Optional @Default("#[payload]") Object entityObject,
                         @Optional @Default("false") Boolean draft,
                         @Optional @Default("false") Boolean fullResponse)
    {
        return client.update(getAccessTokenInformation(accessTokenId), type, entityObject, 
                generateANewRequestId(), draft, fullResponse);
    }
    
    /**
     * Deletes an object.
     * <p>Most objects cannot be deleted by calling Data Services.</p>
     * <p>If the obj map do not have the MetaData field or the SyncToken, internally, will retrieve the
     * object at first, to delete it. So be careful, because it will need two request instead of one, which 
     * could make it slower.</p>
     * <p>For details of the supported objects and its fields: 
     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
     * 0500_QuickBooks_Windows/0500_Supported_Objects">Supported Objects and Operations</a></p>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:delete}
     *
     * @param accessTokenId identifier for QuickBooks credentials.
     * @param type WindowsEntityType of the object.
     * @param entityObject represents the object to be deleted.
     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
     *         and a message provided by quickbooks about the error.
     */
    @Processor
    public void delete(String accessTokenId,
                       WindowsEntityType type,
                       @Optional @Default("#[payload]") Object entityObject)
    {
        client.delete(getAccessTokenInformation(accessTokenId), type, entityObject, generateANewRequestId());
    }

    /**
     * Lazily retrieves Objects
     *
     * For details on how to generate a query see: 
     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/0500_QuickBooks_Windows/
     * 0100_Calling_Data_Services/0015_Retrieving_Objects">Retrieve Especification</a>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:find-objects}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:find-objects-bill}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:find-objects-all-accounts}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:find-objects-list-of-id}
     *
     * @param accessTokenId identifier for QuickBooks credentials.
     * @param type WindowsEntityType of the object.
     * @param query Map that represents every filter and sort for the objects retrieved. Each type of object to be 
     *              retrieved, has a TheObjectQuery class that has the attributes for which it can be filtered 
     *              <p>(To know which attributes are accepted in every ObjectQuery, you could follow the link in 
     *              the documentation of the WindowsEntityType that you require, or you can follow the link changing 
     *              the word OBJECT for the object that you required, for example Account: 
     *              <p>https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
     *              0500_QuickBooks_Windows/0600_Object_Reference/OBJECT</p>).</p>
     *              <p>Do not complete the fields chunkSize and startPage, because are need it for the "lazily retrieve".</p>
     *              If query is null, it will retrieve all the objects of that WindowsEntityType.
     * @return Iterable of the objects to be retrieved.
     * 
     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
     *         and a message provided by quickbooks about the error.
     */
    @SuppressWarnings("rawtypes")
    @Processor
    public Iterable findObjects(String accessTokenId,
                                WindowsEntityType type,
                                @Placement(group = "Query") @Optional Map<String, Object> query)
    {
        if (query == null)
        {
            query = new HashMap<String, Object>();
        }
        
        return client.findObjects(getAccessTokenInformation(accessTokenId), type, unmap(type.getQueryType(), query));
    }
    
    /**
     * Generate a new GUID for the requestId
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:generate-a-new-request-id}
     * 
     * @return a GUID for the requestId
     */
    @Processor
    public String generateANewRequestId()
    {
        return client.generateARequestId();
    }
    
    /**
     * Retrieve the Status
     * 
     * <p>Retrieves information about the sync status of Quickbooks entities. You can also query 
     * specific entity types for either synchronized or unsynchronized objects with filters. You can get information 
     * on recent synchronizations using the syncActivity operation.</p>
     * <p>Note: Sync status information will be maintained for all operations in the cloud up to 30 days old. 
     * Of those operations older than 30 days, only the last operation's synch status will be maintained.</p>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:status}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:status2}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:status3}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:status4}
     * 
     * @param accessTokenId identifier for QuickBooks credentials.
     * @param syncStatusRequest It has the specifications of the syncStatuses to be retrieved. (like a filter)
     * @return list of {@link SyncStatusResponse}
     */
    @Processor
    public List<SyncStatusResponse> status(String accessTokenId,
                         @Optional @Default("#[payload]") SyncStatusRequest syncStatusRequest)
    {
        if (syncStatusRequest == null) {
            syncStatusRequest = new SyncStatusRequest();
        }
        return ((SyncStatusResponses) client.retrieveWithoutUsingQueryObjects(getAccessTokenInformation(accessTokenId),
            syncStatusRequest, "status")).getSyncStatusResponse();
    }
    
    /**
     * Retrieve the SyncActivities
     * 
     * <p>The SyncActivity object contains information about Quickbooks for Windows synchronizations. To get the sync 
     * status of another type of object, for example, a customer, use the status operation.  To filter a query based 
     * on whether or not an object  is synchronized, use a filter.</p>
     * <p>Note: Sync status information will be maintained for all operations in the cloud up to 30 days old. Of those 
     * operations older than 30 days, only the last operation's synch status will be maintained.</p>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:sync-activity}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:sync-activity2}
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:sync-activity3}
     * 
     * @param accessTokenId identifier for QuickBooks credentials.
     * @param syncActivityRequest Map that represents a {@link SyncActivityRequest} object. It has the specifications
     *                            of the SyncActivities to be retrieved. (like a filter)
     * @return list of {@link SyncActivityResponse}
     */
    @Processor
    public List<SyncActivityResponse> syncActivity(String accessTokenId,
                         @Placement(group = "Sync Activity Request") @Optional Map<String, Object> syncActivityRequest)
    {
        if (syncActivityRequest == null)
        {
            syncActivityRequest = new HashMap<String, Object>();
        }
        
        return ((SyncActivityResponses) client.retrieveWithoutUsingQueryObjects(getAccessTokenInformation(accessTokenId), 
            unmap(SyncActivityRequest.class, syncActivityRequest), "syncActivity")).getSyncActivityResponse();
    }
    
    /**
     * Returns current user information such as first name, last name, and email address.
     *
     * For details see: 
     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/
     * 0025_Intuit_Anywhere/0060_Reference/Current_User_API">CurrentUserAPI</a>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:get-current-user}
     *
     * @param accessTokenId identifier for QuickBooks credentials.
     * @return current user information
     */
    @Processor
    public UserInformation getCurrentUser(String accessTokenId)
    {
        return client.getCurrentUserInformation(getAccessTokenInformation(accessTokenId));
    }
    
    /**
     * Returns company metadata information.
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:get-company-metadata}
     *
     * @param accessTokenId identifier for QuickBooks credentials.
     * @return company metadata
     * 
     */
    @Processor
    public Object getCompanyMetadata(String accessTokenId)
    {
        return client.get(getAccessTokenInformation(accessTokenId), 
                WindowsEntityType.COMPANY_METADATA);
    }
    
    /**
     * Authorize an user using OAuth1.0a
     *
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:auth-user}
     *
     * @param requestTokenUrl requestTokenUrl
     * @param accessTokenUrl accessTokenUrl
     * @param authorizationUrl authorizationUrl
     * @param callbackUrl callbackUrl for OAuth service
     * @param requestTokenId Optional value for identifying the requestToken. If it is not passed the client will use a UUID
     * @param headers Outbound headers
     * @return Authorize Url
     * @throws ObjectStoreException from the Object Store instance
     * @throws oauth.signpost.exception.OAuthCommunicationException requesting to OAuth provider
     * @throws oauth.signpost.exception.OAuthExpectationFailedException requesting to OAuth provider
     * @throws oauth.signpost.exception.OAuthNotAuthorizedException requesting to OAuth provider
     * @throws oauth.signpost.exception.OAuthMessageSignerException requesting to OAuth provider
     */
    @Processor
    public String authUser(String requestTokenUrl, String accessTokenUrl, String authorizationUrl, String callbackUrl,
                           @Optional String requestTokenId, @OutboundHeaders Map<String, Object> headers)
            throws OAuthMessageSignerException, OAuthNotAuthorizedException,
            OAuthExpectationFailedException, OAuthCommunicationException, ObjectStoreException
    {
        String authUrl = getoAuthClient().authorize(requestTokenUrl, accessTokenUrl, authorizationUrl,
                callbackUrl, requestTokenId);

        headers.put("Location", authUrl);
        headers.put("http.status", "302");
        return authUrl;
    }

    /**
     * Extract accessToken
     *
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:get-access-token}
     *
     * @param apiUrl API URL
     * @param verifier OAuth verifier. It comes within the callback.
     * The default value is "#[header:inbound:oauth_verifier]"
     * @param requestTokenId id used for identifying the authorized request token. It comes within the callback.
     * By default the query string parameter is userId
     * @param userIdentifier id used for store the accessToken in the Object Store.
     *      By default the value is the realmId
     * @return credentials user credentials
     * @throws ObjectStoreException from the object store instance
     * @throws OAuthCommunicationException requesting to OAuth provider
     * @throws OAuthExpectationFailedException requesting to OAuth provider
     * @throws OAuthNotAuthorizedException requesting to OAuth provider
     * @throws OAuthMessageSignerException requesting to OAuth provider
     */
    @Processor
    public OAuthCredentials getAccessToken(@Optional String apiUrl,
                                           @Optional @Default("#[message.inboundProperties.oauth_verifier]") String verifier,
                                           @Optional @Default("#[message.inboundProperties.userId]") String requestTokenId,
                                           @Optional @Default("#[message.inboundProperties.realmId]") String userIdentifier)
            throws OAuthMessageSignerException, OAuthNotAuthorizedException,
            OAuthExpectationFailedException, OAuthCommunicationException, ObjectStoreException
    {
        OAuthCredentials credentials = getoAuthClient().getAccessToken(verifier, requestTokenId);
        credentials.setUserId(userIdentifier);
        credentials.setRealmId(userIdentifier);

        if (StringUtils.isNotBlank(apiUrl)) {
            credentials.setBaseUri(apiUrl);
        }
        else {
            credentials.setBaseUri(baseUri);
        }

        //Use the prefix if it is defined in the config
        if (StringUtils.isNotEmpty(getAccessTokenIdentifierPrefix())) {
            userIdentifier = getAccessTokenIdentifierPrefix() + userIdentifier;
        }

        getObjectStoreHelper().store(userIdentifier, credentials, true);

        return credentials;
    }

    /**
     * Initializes OpenID process
     *
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:open-id-initialize}
     *
     * @param providerUrl OpenID provider url
     * @param callbackUrl OpenID callbackUrl. It has to point to an endpoint callback to process the response
     * @param headers openId response headers
     *
     * @return url to redirect the user
     * @throws ObjectStoreException if the operation cannot store the OpenIDManagers
     *
     */
    @Processor
    public String openIdInitialize(@Optional @Default("https://openid.intuit.com/OpenId/Provider") String providerUrl,
                                   String callbackUrl,
                                   @OutboundHeaders Map<String, Object> headers) throws ObjectStoreException {
        String url = getOpenIDClient().initialize(providerUrl, callbackUrl, getVerifyOpenIdResponse());

        headers.put("Location", url);
        headers.put("http.status", "302");
        return url;
    }

    /**
     * Verify response from Intuit
     *
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:verify-open-id}
     *
     * @param muleMessage injected MuleMessage
     * @param receivingUrl url from OpenID provider.
     *                     <p>If it is not provided the processor will extract it from the
     *                     Mule message</p>
     * @param responseParameters response parameters from Intuit. It process a map<string, string> with all the OpenID
     *                           attributes sent from Intuit.
     *
     * @return OpenID credentials for the authenticated user
     * @throws MessageException from OpenID manager
     * @throws ObjectStoreException if the operation cannot retrieve OpenID managers from ObjectStore
     *
     */
    @Processor
    @Inject
    public OpenIDCredentials verifyOpenId(MuleMessage muleMessage, @Optional String receivingUrl,
            @Optional @Default("#[header:INBOUND:http.query.params]") Map<String, String> responseParameters)
            throws MessageException, ObjectStoreException {

        //Build receivingUrl
        if (StringUtils.isEmpty(receivingUrl)) {
            receivingUrl = String.format("%s%s%s", muleMessage.getInboundProperty("http.context.uri"), "?",
                    muleMessage.getInboundProperty("http.query.string"));
        }

        return getOpenIDClient().verifyOpenIDFromIntuit(
                receivingUrl, responseParameters, getVerifyOpenIdResponse());
    }

    /**
     * Invalidates the OAuth access token in the request, thereby disconnecting the user from QuickBooks for this app.
     *
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:disconnect}
     *
     *
     * @param accessTokenId credentials identifier for the user information to be requested
     *
     * @return true if the user was disconnect from QBW
     *
     */
    @Processor
    public boolean disconnect(String accessTokenId)
    {
        return client.disconnect(getAccessTokenInformation(accessTokenId));
    }

    /**
     * Generates a new OAuth access token and invalidates the OAuth access token used in the request,
     * thereby extending the life span by six months. Because accessing QuickBooks data requires a valid access token,
     * when the OAuth access token is renewed, your app can continue to access the user's QuickBooks company data.
     *
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:reconnect}
     *
     *
     * @param accessTokenId credentials identifier for the user information to be requested
     * @throws ObjectStoreException if the credentials store failed
     *
     */
    @Processor
    public void reconnect(String accessTokenId) throws ObjectStoreException {
        OAuthCredentials creds = client.reconnect(getAccessTokenInformation(accessTokenId));

        //Stores new credentials
        getObjectStoreHelper().store(creds.getUserId(), creds, true);
    }
    
    /**
     * This method retrieves the accessTokenInformation from the object store instance
     * @return OAuthCredentials AuthToken and AuthTokenSecret
     */
    private OAuthCredentials getAccessTokenInformation(String accessTokenIdentifier) {

        //Check if there is a prefix in the config
        if(StringUtils.isNotEmpty(getAccessTokenIdentifierPrefix())) {
            accessTokenIdentifier = getAccessTokenIdentifierPrefix() + accessTokenIdentifier;
        }

        try {
            return (OAuthCredentials) objectStoreHelper.retrieve(accessTokenIdentifier);
        } catch (ObjectDoesNotExistException e) {
            throw new QuickBooksRuntimeException(String.format("The user token could not be retrieved from the " +
                    "Object Store using the key %s. It seems the user is not authenticated, " +
                    "please start OAuth dance again", accessTokenIdentifier));
        } catch (ObjectStoreException e) {
            throw new QuickBooksRuntimeException("The user token could not be retrieved: " + e.getMessage());
        }
    }

    /**
     * Create OAuthCredentials object
     * @param accessToken user accessToken
     * @param accessTokenSecret user accessTokenSecret
     * @return credentials
     */
    private OAuthCredentials createCredentials(String accessToken, String accessTokenSecret) {
        return new OAuthCredentials(accessToken, accessTokenSecret);
    }    
    
    /**
     * post construct
     */
    @PostConstruct
    public void init()
    {
        if (client == null )
        {
            //Sets blank API key
            client = new DefaultQuickBooksWindowsClient(baseUri, consumerKey, consumerSecret, "");
            setObjectStoreHelper(new ObjectStoreHelper(objectStore));
            setoAuthClient(new DefaultQuickBooksOAuthClient(getConsumerKey(), getConsumerSecret(),
                    getObjectStoreHelper()));
            setOpenIDClient(new DefaultOpenIDClient(getObjectStoreHelper()));
        }
    }
    
    public void setBaseUri(String baseUri)
    {
        this.baseUri = baseUri;
    }
    
    public String getBaseUri()
    {
        return baseUri;
    }

    @SuppressWarnings("unchecked")
    private <A> A  unmap(Class<A> class1, Map<String, Object> id)
    {
        return (A) mom.unmap(id, class1);
    }

    public QuickBooksWindowsClient getClient() {
        return client;
    }

    public void setClient(QuickBooksWindowsClient client) {
        this.client = client;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }


    public ObjectStore getObjectStore() {
        return objectStore;
    }

    public void setObjectStore(ObjectStore objectStore) {
        this.objectStore = objectStore;
    }

    public ObjectStoreHelper getObjectStoreHelper() {
        return objectStoreHelper;
    }

    public void setObjectStoreHelper(ObjectStoreHelper objectStoreHelper) {
        this.objectStoreHelper = objectStoreHelper;
    }

    public String getAccessTokenIdentifierPrefix() {
        return accessTokenIdentifierPrefix;
    }

    public void setAccessTokenIdentifierPrefix(String accessTokenIdentifierPrefix) {
        this.accessTokenIdentifierPrefix = accessTokenIdentifierPrefix;
    }

    public boolean getVerifyOpenIdResponse() {
        return verifyOpenIdResponse;
    }

    public void setVerifyOpenIdResponse(boolean verifyOpenIdResponse) {
        this.verifyOpenIdResponse = verifyOpenIdResponse;
    }

    public QuickBooksOAuthClient getoAuthClient() {
        return oAuthClient;
    }

    public void setoAuthClient(QuickBooksOAuthClient oAuthClient) {
        this.oAuthClient = oAuthClient;
    }

    public DefaultOpenIDClient getOpenIDClient() {
        return openIDClient;
    }

    public void setOpenIDClient(DefaultOpenIDClient openIDClient) {
        this.openIDClient = openIDClient;
    }
}

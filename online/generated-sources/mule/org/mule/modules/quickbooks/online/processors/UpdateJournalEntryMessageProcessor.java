
package org.mule.modules.quickbooks.online.processors;

import java.util.List;
import javax.annotation.Generated;
import com.intuit.ipp.data.JournalEntry;
import org.mule.api.MessagingException;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.processor.MessageProcessor;
import org.mule.config.i18n.CoreMessages;
import org.mule.modules.quickbooks.online.QuickBooksOnlineModule;
import org.mule.modules.quickbooks.online.adapters.QuickBooksOnlineModuleProcessAdapter;
import org.mule.modules.quickbooks.online.process.ProcessAdapter;
import org.mule.modules.quickbooks.online.process.ProcessCallback;
import org.mule.modules.quickbooks.online.process.ProcessTemplate;


/**
 * UpdateJournalEntryMessageProcessor invokes the {@link org.mule.modules.quickbooks.online.QuickBooksOnlineModule#updateJournalEntry(java.lang.String, com.intuit.ipp.data.JournalEntry)} method in {@link QuickBooksOnlineModule }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T02:54:07-05:00", comments = "Build 3.4.3.1620.30ea288")
public class UpdateJournalEntryMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object accessTokenId;
    protected String _accessTokenIdType;
    protected Object journalEntry;
    protected JournalEntry _journalEntryType;

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    public void start()
        throws MuleException
    {
    }

    public void stop()
        throws MuleException
    {
    }

    public void dispose() {
    }

    /**
     * Set the Mule context
     * 
     * @param context Mule context to set
     */
    public void setMuleContext(MuleContext context) {
        super.setMuleContext(context);
    }

    /**
     * Sets flow construct
     * 
     * @param flowConstruct Flow construct to set
     */
    public void setFlowConstruct(FlowConstruct flowConstruct) {
        super.setFlowConstruct(flowConstruct);
    }

    /**
     * Sets journalEntry
     * 
     * @param value Value to set
     */
    public void setJournalEntry(Object value) {
        this.journalEntry = value;
    }

    /**
     * Sets accessTokenId
     * 
     * @param value Value to set
     */
    public void setAccessTokenId(Object value) {
        this.accessTokenId = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws MuleException
     */
    public MuleEvent process(final MuleEvent event)
        throws MuleException
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(QuickBooksOnlineModuleProcessAdapter.class, false, event);
            final String _transformedAccessTokenId = ((String) evaluateAndTransform(getMuleContext(), event, UpdateJournalEntryMessageProcessor.class.getDeclaredField("_accessTokenIdType").getGenericType(), null, accessTokenId));
            final JournalEntry _transformedJournalEntry = ((JournalEntry) evaluateAndTransform(getMuleContext(), event, UpdateJournalEntryMessageProcessor.class.getDeclaredField("_journalEntryType").getGenericType(), null, journalEntry));
            Object resultPayload;
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((QuickBooksOnlineModule) object).updateJournalEntry(_transformedAccessTokenId, _transformedJournalEntry);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("updateJournalEntry"), event, e);
        }
    }

}


package com.intuit.ipp.data.transformers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import com.intuit.ipp.data.AttachableRef;
import com.intuit.ipp.data.BillPayment;
import com.intuit.ipp.data.BillPaymentCheck;
import com.intuit.ipp.data.BillPaymentCreditCard;
import com.intuit.ipp.data.BillPaymentTypeEnum;
import com.intuit.ipp.data.CustomField;
import com.intuit.ipp.data.EntityStatusEnum;
import com.intuit.ipp.data.IntuitAnyType;
import com.intuit.ipp.data.Line;
import com.intuit.ipp.data.LinkedTxn;
import com.intuit.ipp.data.ModificationMetaData;
import com.intuit.ipp.data.ReferenceType;
import com.intuit.ipp.data.TxnTaxDetail;
import com.intuit.ipp.data.holders.BillPaymentExpressionHolder;
import com.intuit.ipp.data.holders.IntuitEntityExpressionHolder;
import com.intuit.ipp.data.holders.TransactionExpressionHolder;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.MessageTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.config.i18n.CoreMessages;
import org.mule.modules.quickbooks.online.processors.AbstractExpressionEvaluator;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T02:54:07-05:00", comments = "Build 3.4.3.1620.30ea288")
public class BillPaymentExpressionHolderTransformer
    extends AbstractExpressionEvaluator
    implements DiscoverableTransformer, MessageTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;
    private ImmutableEndpoint endpoint;
    private MuleContext muleContext;
    private String name;

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

    public boolean isSourceTypeSupported(Class<?> aClass) {
        return (aClass == BillPaymentExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == BillPaymentExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {BillPaymentExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(BillPaymentExpressionHolder.class)});
    }

    public boolean isAcceptNull() {
        return false;
    }

    public boolean isIgnoreBadInput() {
        return false;
    }

    public Object transform(Object src)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public Object transform(Object src, String encoding)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public void setReturnClass(Class<?> theClass) {
        throw new UnsupportedOperationException();
    }

    public Class<?> getReturnClass() {
        return BillPayment.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(BillPayment.class);
    }

    public void setEndpoint(ImmutableEndpoint ep) {
        endpoint = ep;
    }

    public ImmutableEndpoint getEndpoint() {
        return endpoint;
    }

    public void dispose() {
    }

    public void initialise()
        throws InitialisationException
    {
    }

    public void setMuleContext(MuleContext context) {
        muleContext = context;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Object transform(Object src, MuleEvent event)
        throws TransformerMessagingException
    {
        return transform(src, null, event);
    }

    public Object transform(Object src, String encoding, MuleEvent event)
        throws TransformerMessagingException
    {
        if (src == null) {
            return null;
        }
        BillPaymentExpressionHolder holder = ((BillPaymentExpressionHolder) src);
        BillPayment result = new BillPayment();
        try {
            final ReferenceType _transformedVendorRef = ((ReferenceType) evaluateAndTransform(this.muleContext, event, BillPaymentExpressionHolder.class.getDeclaredField("_vendorRefType").getGenericType(), null, holder.getVendorRef()));
            result.setVendorRef(_transformedVendorRef);
            final BillPaymentTypeEnum _transformedPayType = ((BillPaymentTypeEnum) evaluateAndTransform(this.muleContext, event, BillPaymentExpressionHolder.class.getDeclaredField("_payTypeType").getGenericType(), null, holder.getPayType()));
            result.setPayType(_transformedPayType);
            final BillPaymentCheck _transformedCheckPayment = ((BillPaymentCheck) evaluateAndTransform(this.muleContext, event, BillPaymentExpressionHolder.class.getDeclaredField("_checkPaymentType").getGenericType(), null, holder.getCheckPayment()));
            result.setCheckPayment(_transformedCheckPayment);
            final BillPaymentCreditCard _transformedCreditCardPayment = ((BillPaymentCreditCard) evaluateAndTransform(this.muleContext, event, BillPaymentExpressionHolder.class.getDeclaredField("_creditCardPaymentType").getGenericType(), null, holder.getCreditCardPayment()));
            result.setCreditCardPayment(_transformedCreditCardPayment);
            final BigDecimal _transformedTotalAmt = ((BigDecimal) evaluateAndTransform(this.muleContext, event, BillPaymentExpressionHolder.class.getDeclaredField("_totalAmtType").getGenericType(), null, holder.getTotalAmt()));
            result.setTotalAmt(_transformedTotalAmt);
            final IntuitAnyType _transformedBillPaymentEx = ((IntuitAnyType) evaluateAndTransform(this.muleContext, event, BillPaymentExpressionHolder.class.getDeclaredField("_billPaymentExType").getGenericType(), null, holder.getBillPaymentEx()));
            result.setBillPaymentEx(_transformedBillPaymentEx);
            final String _transformedDocNumber = ((String) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_docNumberType").getGenericType(), null, holder.getDocNumber()));
            result.setDocNumber(_transformedDocNumber);
            final Date _transformedTxnDate = ((Date) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_txnDateType").getGenericType(), null, holder.getTxnDate()));
            result.setTxnDate(_transformedTxnDate);
            final ReferenceType _transformedDepartmentRef = ((ReferenceType) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_departmentRefType").getGenericType(), null, holder.getDepartmentRef()));
            result.setDepartmentRef(_transformedDepartmentRef);
            final ReferenceType _transformedCurrencyRef = ((ReferenceType) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_currencyRefType").getGenericType(), null, holder.getCurrencyRef()));
            result.setCurrencyRef(_transformedCurrencyRef);
            final BigDecimal _transformedExchangeRate = ((BigDecimal) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_exchangeRateType").getGenericType(), null, holder.getExchangeRate()));
            result.setExchangeRate(_transformedExchangeRate);
            final String _transformedPrivateNote = ((String) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_privateNoteType").getGenericType(), null, holder.getPrivateNote()));
            result.setPrivateNote(_transformedPrivateNote);
            final String _transformedTxnStatus = ((String) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_txnStatusType").getGenericType(), null, holder.getTxnStatus()));
            result.setTxnStatus(_transformedTxnStatus);
            final List<LinkedTxn> _transformedLinkedTxn = ((List<LinkedTxn> ) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_linkedTxnType").getGenericType(), null, holder.getLinkedTxn()));
            result.setLinkedTxn(_transformedLinkedTxn);
            final List<Line> _transformedLine = ((List<Line> ) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_lineType").getGenericType(), null, holder.getLine()));
            result.setLine(_transformedLine);
            final TxnTaxDetail _transformedTxnTaxDetail = ((TxnTaxDetail) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_txnTaxDetailType").getGenericType(), null, holder.getTxnTaxDetail()));
            result.setTxnTaxDetail(_transformedTxnTaxDetail);
            final String _transformedTxnSource = ((String) evaluateAndTransform(this.muleContext, event, TransactionExpressionHolder.class.getDeclaredField("_txnSourceType").getGenericType(), null, holder.getTxnSource()));
            result.setTxnSource(_transformedTxnSource);
            final String _transformedId = ((String) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_idType").getGenericType(), null, holder.getId()));
            result.setId(_transformedId);
            final String _transformedSyncToken = ((String) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_syncTokenType").getGenericType(), null, holder.getSyncToken()));
            result.setSyncToken(_transformedSyncToken);
            final ModificationMetaData _transformedMetaData = ((ModificationMetaData) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_metaDataType").getGenericType(), null, holder.getMetaData()));
            result.setMetaData(_transformedMetaData);
            final List<CustomField> _transformedCustomField = ((List<CustomField> ) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_customFieldType").getGenericType(), null, holder.getCustomField()));
            result.setCustomField(_transformedCustomField);
            final List<AttachableRef> _transformedAttachableRef = ((List<AttachableRef> ) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_attachableRefType").getGenericType(), null, holder.getAttachableRef()));
            result.setAttachableRef(_transformedAttachableRef);
            final String _transformedDomain = ((String) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_domainType").getGenericType(), null, holder.getDomain()));
            result.setDomain(_transformedDomain);
            final EntityStatusEnum _transformedStatus = ((EntityStatusEnum) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_statusType").getGenericType(), null, holder.getStatus()));
            result.setStatus(_transformedStatus);
            final Boolean _transformedSparse = ((Boolean) evaluateAndTransform(this.muleContext, event, IntuitEntityExpressionHolder.class.getDeclaredField("_sparseType").getGenericType(), null, holder.getSparse()));
            result.setSparse(_transformedSparse);
        } catch (NoSuchFieldException e) {
            throw new TransformerMessagingException(CoreMessages.createStaticMessage("internal error"), event, this, e);
        } catch (TransformerException e) {
            throw new TransformerMessagingException(e.getI18nMessage(), event, this, e);
        }
        return result;
    }

    public MuleEvent process(MuleEvent event) {
        return null;
    }

    public String getMimeType() {
        return null;
    }

    public String getEncoding() {
        return null;
    }

    public MuleContext getMuleContext() {
        return muleContext;
    }

}

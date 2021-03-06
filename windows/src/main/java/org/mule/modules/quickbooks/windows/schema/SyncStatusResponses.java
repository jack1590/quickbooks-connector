/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 05:31:44 PM GMT-03:00 
//


package org.mule.modules.quickbooks.windows.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Product: QBW
 *         Description: unbound set of responses per request batch ng pk id sets
 *       
 * 
 * <p>Java class for SyncStatusResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncStatusResponses">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmComplexBase">
 *       &lt;sequence>
 *         &lt;element name="SyncStatusResponse" type="{http://www.intuit.com/sb/cdm/v2}SyncStatusResponse" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.intuit.com/sb/cdm/v2}CdmObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IncludeRelatedObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncStatusResponses", propOrder = {
    "syncStatusResponse",
    "cdmObject"
})
public class SyncStatusResponses
    extends CdmComplexBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SyncStatusResponse", required = true)
    protected List<SyncStatusResponse> syncStatusResponse;
    @XmlElementRef(name = "CdmObject", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class)
    protected List<JAXBElement<? extends CdmObject>> cdmObject;
    @XmlAttribute(name = "IncludeRelatedObjects")
    protected Boolean includeRelatedObjects;

    /**
     * Gets the value of the syncStatusResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syncStatusResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyncStatusResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncStatusResponse }
     * 
     * 
     */
    public List<SyncStatusResponse> getSyncStatusResponse() {
        if (syncStatusResponse == null) {
            syncStatusResponse = new ArrayList<SyncStatusResponse>();
        }
        return this.syncStatusResponse;
    }

    /**
     * Gets the value of the cdmObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdmObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdmObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BillPaymentCreditCard }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTaxCode }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemReceipt }{@code >}
     * {@link JAXBElement }{@code <}{@link Task }{@code >}
     * {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     * {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     * {@link JAXBElement }{@code <}{@link CashPurchase }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditCardRefund }{@code >}
     * {@link JAXBElement }{@code <}{@link Employee }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemGroupComponent }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link ShipMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     * {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link BOMComponent }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     * {@link JAXBElement }{@code <}{@link CurrencyInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanyMetaData }{@code >}
     * {@link JAXBElement }{@code <}{@link Bill }{@code >}
     * {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     * {@link JAXBElement }{@code <}{@link Discount }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     * {@link JAXBElement }{@code <}{@link UOM }{@code >}
     * {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     * {@link JAXBElement }{@code <}{@link Charge }{@code >}
     * {@link JAXBElement }{@code <}{@link CdmBase }{@code >}
     * {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     * {@link JAXBElement }{@code <}{@link Job }{@code >}
     * {@link JAXBElement }{@code <}{@link Account }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     * {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTerm }{@code >}
     * {@link JAXBElement }{@code <}{@link VendorCreditToApply }{@code >}
     * {@link JAXBElement }{@code <}{@link BuildAssembly }{@code >}
     * {@link JAXBElement }{@code <}{@link Check }{@code >}
     * {@link JAXBElement }{@code <}{@link Payment }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTaxGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerMsg }{@code >}
     * {@link JAXBElement }{@code <}{@link Class }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditCardCharge }{@code >}
     * {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     * {@link JAXBElement }{@code <}{@link TxnGeneric }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     * {@link JAXBElement }{@code <}{@link InventoryAdjustment }{@code >}
     * {@link JAXBElement }{@code <}{@link CdmObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditCardCredit }{@code >}
     * {@link JAXBElement }{@code <}{@link Item }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTax }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     * {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     * {@link JAXBElement }{@code <}{@link InventoryTransfer }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemConsolidated }{@code >}
     * {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * {@link JAXBElement }{@code <}{@link JobType }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTaxPaymentCheck }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends CdmObject>> getCdmObject() {
        if (cdmObject == null) {
            cdmObject = new ArrayList<JAXBElement<? extends CdmObject>>();
        }
        return this.cdmObject;
    }

    /**
     * Gets the value of the includeRelatedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getIncludeRelatedObjects() {
        if (includeRelatedObjects == null) {
            return false;
        } else {
            return includeRelatedObjects;
        }
    }

    /**
     * Sets the value of the includeRelatedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRelatedObjects(Boolean value) {
        this.includeRelatedObjects = value;
    }

    /**
     * Sets the value of the syncStatusResponse property.
     * 
     * @param syncStatusResponse
     *     allowed object is
     *     {@link SyncStatusResponse }
     *     
     */
    public void setSyncStatusResponse(List<SyncStatusResponse> syncStatusResponse) {
        this.syncStatusResponse = syncStatusResponse;
    }

    /**
     * Sets the value of the cdmObject property.
     * 
     * @param cdmObject
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BillPaymentCreditCard }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link CashPurchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardRefund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemGroupComponent }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShipMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link BOMComponent }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyMetaData }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Discount }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link UOM }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Charge }{@code >}
     *     {@link JAXBElement }{@code <}{@link CdmBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Job }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTerm }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCreditToApply }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildAssembly }{@code >}
     *     {@link JAXBElement }{@code <}{@link Check }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxGroup }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerMsg }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link TxnGeneric }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventoryAdjustment }{@code >}
     *     {@link JAXBElement }{@code <}{@link CdmObject }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTax }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventoryTransfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemConsolidated }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link JobType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxPaymentCheck }{@code >}
     *     
     */
    public void setCdmObject(List<JAXBElement<? extends CdmObject>> cdmObject) {
        this.cdmObject = cdmObject;
    }

}

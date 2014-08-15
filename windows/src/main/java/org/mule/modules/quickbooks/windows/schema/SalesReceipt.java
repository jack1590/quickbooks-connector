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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Product: QBO
 *         Description: SalesReceipt represents the sales receipt that is given to a customer. A sales receipt is similar to an invoice. However, for a sales receipt, payment is received as part of the sale of goods and services. The sales receipt specifies a deposit account where the customer deposits the payment. If the deposit account is not specified, the payment type is classified as Undeposited Account.
 *         Endpoint: qbo.intuit.com
 *         Business Rules: [li]A sales receipt must have at least one line that describes the item. [/li][li]A sales receipt must have a reference to a customer in the header. [/li][li]If an account is specified in the header, the account must be of the Accounts Receivable (AR) type.[/li] [li]If you submit a query with the filter IncludeDiscountLineDetails, the system retrieves either DiscountAmount or DiscountRatePercent with associated values. [/li] Note: The PONumber field in a sales receipt is removed after synchronization, as QBSDK do not support it.        
 *         Product: QBW
 *         Description: A sales receipt is a financial transaction that represents the sale of goods or services where payment in full is received at the time of purchase. Do not use a sales receipt if customers pay in part at the time of purchase; instead, use an invoice. See Invoice. The Invoice object offers more options than the SalesReceipt, and because a customer name is required for an invoice but not a sales receipt, use the Invoice object to keep track of payments owed on a purchase.
 *         Endpoint: services.intuit.com
 *         Business Rules: [li]A sales receipt must have at least one line that describes the item. [/li][li]A sales receipt must have a reference to a customer in the header. [/li][li]If an account is specified in the header, the account must be of the Accounts Receivable (AR) type.[/li] [li]If you submit a query with the filter IncludeDiscountLineDetails, the system retrieves either DiscountAmount or DiscountRatePercent with associated values. [/li] Note: The PONumber field in a sales receipt is removed after synchronization, as QBSDK do not support it.        
 *       
 * 
 * <p>Java class for SalesReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReceipt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.intuit.com/sb/cdm/v2}SalesReceiptHeader" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.intuit.com/sb/cdm/v2}SalesReceiptLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxLine" type="{http://www.intuit.com/sb/cdm/v2}TaxLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesReceipt", propOrder = {
    "header",
    "line",
    "taxLine"
})
public class SalesReceipt
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Header")
    protected SalesReceiptHeader header;
    @XmlElement(name = "Line")
    protected List<SalesReceiptLine> line;
    @XmlElement(name = "TaxLine")
    protected List<TaxLine> taxLine;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link SalesReceiptHeader }
     *     
     */
    public SalesReceiptHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesReceiptHeader }
     *     
     */
    public void setHeader(SalesReceiptHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesReceiptLine }
     * 
     * 
     */
    public List<SalesReceiptLine> getLine() {
        if (line == null) {
            line = new ArrayList<SalesReceiptLine>();
        }
        return this.line;
    }

    /**
     * Gets the value of the taxLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxLine }
     * 
     * 
     */
    public List<TaxLine> getTaxLine() {
        if (taxLine == null) {
            taxLine = new ArrayList<TaxLine>();
        }
        return this.taxLine;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param line
     *     allowed object is
     *     {@link SalesReceiptLine }
     *     
     */
    public void setLine(List<SalesReceiptLine> line) {
        this.line = line;
    }

    /**
     * Sets the value of the taxLine property.
     * 
     * @param taxLine
     *     allowed object is
     *     {@link TaxLine }
     *     
     */
    public void setTaxLine(List<TaxLine> taxLine) {
        this.taxLine = taxLine;
    }

}

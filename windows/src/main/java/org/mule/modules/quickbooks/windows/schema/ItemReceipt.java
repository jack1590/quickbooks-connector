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
 *         Product: QBW
 *         Description: ItemReceipt is an AP transaction representing a delivery of goods from 3rd party. The Bill is expected to be received at a later date. You can use the ItemReceipt object to manage your Account Receivable transactions with third party vendors. These transactions represent delivery of the goods by the third party vendors, for which you receive a bill at a later date.
 *         Endpoint: services.intuit.com
 *         Business Rules: None        
 *       
 * 
 * <p>Java class for ItemReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReceipt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.intuit.com/sb/cdm/v2}ItemReceiptHeader" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.intuit.com/sb/cdm/v2}ItemReceiptLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReceipt", propOrder = {
    "header",
    "line"
})
public class ItemReceipt
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Header")
    protected ItemReceiptHeader header;
    @XmlElement(name = "Line")
    protected List<ItemReceiptLine> line;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReceiptHeader }
     *     
     */
    public ItemReceiptHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReceiptHeader }
     *     
     */
    public void setHeader(ItemReceiptHeader value) {
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
     * {@link ItemReceiptLine }
     * 
     * 
     */
    public List<ItemReceiptLine> getLine() {
        if (line == null) {
            line = new ArrayList<ItemReceiptLine>();
        }
        return this.line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param line
     *     allowed object is
     *     {@link ItemReceiptLine }
     *     
     */
    public void setLine(List<ItemReceiptLine> line) {
        this.line = line;
    }

}

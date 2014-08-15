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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Product: QBW
 *         Description: Information that pertains to the entire Journal Entry. Allows for "traditional accounting", i.e. it creates a transaction in which the total amount in the Debit column equals the total amount in the Credit column, and each amount is assigned to an account on the chart of accounts.
 * 			
 * 
 * <p>Java class for JournalEntryHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderBase">
 *       &lt;sequence>
 *         &lt;element name="Adjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryHeader", propOrder = {
    "adjustment"
})
public class JournalEntryHeader
    extends HeaderBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Adjustment")
    protected Boolean adjustment;

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustment(Boolean value) {
        this.adjustment = value;
    }

}
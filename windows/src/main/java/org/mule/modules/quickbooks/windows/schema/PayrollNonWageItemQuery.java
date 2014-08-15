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
 * <p>Java class for PayrollNonWageItemQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayrollNonWageItemQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}ListQueryBase">
 *       &lt;sequence>
 *         &lt;element name="SortByColumn" type="{http://www.intuit.com/sb/cdm/v2}SortByColumnPayrollNonWageItemWithOrder" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayrollNonWageItemQuery", propOrder = {
    "sortByColumn",
    "name"
})
public class PayrollNonWageItemQuery
    extends ListQueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SortByColumn")
    protected SortByColumnPayrollNonWageItemWithOrder sortByColumn;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the sortByColumn property.
     * 
     * @return
     *     possible object is
     *     {@link SortByColumnPayrollNonWageItemWithOrder }
     *     
     */
    public SortByColumnPayrollNonWageItemWithOrder getSortByColumn() {
        return sortByColumn;
    }

    /**
     * Sets the value of the sortByColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortByColumnPayrollNonWageItemWithOrder }
     *     
     */
    public void setSortByColumn(SortByColumnPayrollNonWageItemWithOrder value) {
        this.sortByColumn = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}

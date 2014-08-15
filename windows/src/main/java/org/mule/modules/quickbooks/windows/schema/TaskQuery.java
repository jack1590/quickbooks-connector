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
 *                 Product: QBW
 *                 Description: ToDo in QuickBoooks Desktop 
 * 				Returns all Tasks, by default. Apply filters to obtain specific subset of Tasks
 *      
 * 
 * <p>Java class for TaskQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}ListQueryBase">
 *       &lt;sequence>
 *         &lt;element name="SortByColumn" type="{http://www.intuit.com/sb/cdm/v2}SortByColumnTaskWithOrder" minOccurs="0"/>
 *         &lt;element name="DoneStatusFilter" type="{http://www.intuit.com/sb/cdm/v2}DoneStatusFilterEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskQuery", propOrder = {
    "sortByColumn",
    "doneStatusFilter"
})
public class TaskQuery
    extends ListQueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SortByColumn")
    protected SortByColumnTaskWithOrder sortByColumn;
    @XmlElement(name = "DoneStatusFilter")
    protected DoneStatusFilterEnumType doneStatusFilter;

    /**
     * Gets the value of the sortByColumn property.
     * 
     * @return
     *     possible object is
     *     {@link SortByColumnTaskWithOrder }
     *     
     */
    public SortByColumnTaskWithOrder getSortByColumn() {
        return sortByColumn;
    }

    /**
     * Sets the value of the sortByColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortByColumnTaskWithOrder }
     *     
     */
    public void setSortByColumn(SortByColumnTaskWithOrder value) {
        this.sortByColumn = value;
    }

    /**
     * Gets the value of the doneStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link DoneStatusFilterEnumType }
     *     
     */
    public DoneStatusFilterEnumType getDoneStatusFilter() {
        return doneStatusFilter;
    }

    /**
     * Sets the value of the doneStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoneStatusFilterEnumType }
     *     
     */
    public void setDoneStatusFilter(DoneStatusFilterEnumType value) {
        this.doneStatusFilter = value;
    }

}

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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Product: QBW
 *         Description: allowed sort options for Task queries also specifying ascending/descending order as an attribute
 *       
 * 
 * <p>Java class for SortByColumnTaskWithOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortByColumnTaskWithOrder">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.intuit.com/sb/cdm/v2>SortBy">
 *       &lt;attribute name="sortOrder" type="{http://www.intuit.com/sb/cdm/v2}sortOrder" default="Descending" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortByColumnTaskWithOrder")
public class SortByColumnTaskWithOrder
    extends SortBy
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}

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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortByColumnItemReceipt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortByColumnItemReceipt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TransactionDate"/>
 *     &lt;enumeration value="OpenBalance"/>
 *     &lt;enumeration value="TotalAmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortByColumnItemReceipt")
@XmlEnum
public enum SortByColumnItemReceipt {

    @XmlEnumValue("TransactionDate")
    TRANSACTION_DATE("TransactionDate"),
    @XmlEnumValue("OpenBalance")
    OPEN_BALANCE("OpenBalance"),
    @XmlEnumValue("TotalAmount")
    TOTAL_AMOUNT("TotalAmount");
    private final String value;

    SortByColumnItemReceipt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortByColumnItemReceipt fromValue(String v) {
        for (SortByColumnItemReceipt c: SortByColumnItemReceipt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

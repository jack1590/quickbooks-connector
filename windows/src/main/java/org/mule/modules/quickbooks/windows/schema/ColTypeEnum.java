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
 * <p>Java class for ColTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ids_Amount"/>
 *     &lt;enumeration value="ids_Date"/>
 *     &lt;enumeration value="ids_IdType"/>
 *     &lt;enumeration value="ids_Number"/>
 *     &lt;enumeration value="ids_String"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ColTypeEnum")
@XmlEnum
public enum ColTypeEnum {

    @XmlEnumValue("ids_Amount")
    IDS_AMOUNT("ids_Amount"),
    @XmlEnumValue("ids_Date")
    IDS_DATE("ids_Date"),
    @XmlEnumValue("ids_IdType")
    IDS_ID_TYPE("ids_IdType"),
    @XmlEnumValue("ids_Number")
    IDS_NUMBER("ids_Number"),
    @XmlEnumValue("ids_String")
    IDS_STRING("ids_String");
    private final String value;

    ColTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColTypeEnum fromValue(String v) {
        for (ColTypeEnum c: ColTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

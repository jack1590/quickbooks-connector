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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Product: ALL
 * 			Description: Specifies the base Party that describes the party model. Unsupported type.
 * 			
 * 
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PartyGroup"/>
 *         &lt;element name="Role" type="{http://www.intuit.com/sb/cdm/v2}roleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://www.intuit.com/sb/cdm/v2}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "rest"
})
public class Party
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "Email", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "TypeOf", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "Role", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "Phone", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "Address", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "CustomField", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "WebSite", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "Name", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class),
        @XmlElementRef(name = "ExternalId", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CustomField" is used by two different parts of a schema. See: 
     * line 417 of file:/Users/damianpelaez/Documents/Connectors/quickbooks-connector/windows/src/main/resources/schema/windows/CustomerCdmTypes.xsd
     * line 96 of file:/Users/damianpelaez/Documents/Connectors/quickbooks-connector/windows/src/main/resources/schema/windows/IntuitCdmBaseTypes.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EmailAddress }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoleType }{@code >}
     * {@link JAXBElement }{@code <}{@link TelephoneNumber }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomField }{@code >}
     * {@link JAXBElement }{@code <}{@link PhysicalAddress }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link WebSiteAddress }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CustomField" is used by two different parts of a schema. See: 
     * line 417 of file:/Users/damianpelaez/Documents/Connectors/quickbooks-connector/windows/src/main/resources/schema/windows/CustomerCdmTypes.xsd
     * line 96 of file:/Users/damianpelaez/Documents/Connectors/quickbooks-connector/windows/src/main/resources/schema/windows/IntuitCdmBaseTypes.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * 
     * 
     * @param rest
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailAddress }{@code >}
     *     {@link JAXBElement }{@code <}{@link PartyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelephoneNumber }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomField }{@code >}
     *     {@link JAXBElement }{@code <}{@link PhysicalAddress }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link WebSiteAddress }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRest(List<JAXBElement<?>> rest) {
        this.rest = rest;
    }

}

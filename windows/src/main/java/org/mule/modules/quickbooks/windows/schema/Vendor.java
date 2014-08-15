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
 * 			Product: QBO
 * 			Description: The Vendor represents the buyer from whom you purchase any service or product for your organization.
 * 			Endpoint: qbo.intuit.com
 * 			Business Rules: [li]The vendor name must be unique.[/li][li]The name, first name, and last name of the vendor must not contain a colon (:).[/li][li]The name, first name, or last name field should not be blank.[/li][li]The e-mail, phone, and address fields are mandatory.[/li][li]The e-mail address of the vendor must contain @ and . (dot).[/li]			
 * 			Product: QBW
 * 			Description: You can use the Vendor object to store information about the people and companies you do business with. A vendor is an individual or an organization that provides goods and services to a customer. For example, banks and tax agencies.
 * 			Endpoint: services.intuit.com
 * 			Business Rules: [li]The vendor name must be unique.[/li][li]The name, first name, and last name of the vendor must not contain a colon (:).[/li][li]The name, first name, or last name field should not be blank.[/li][li]The e-mail, phone, and address fields are mandatory.[/li][li]The e-mail address of the vendor must contain @ and . (dot).[/li]			
 * 			
 * 
 * <p>Java class for Vendor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vendor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}RoleBase">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}VendorTypeReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesTermReferenceGroup" minOccurs="0"/>
 *         &lt;element name="OpenBalance" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="OpenBalanceDate" type="{http://www.intuit.com/sb/cdm/v2}IDSDate" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="AcctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor1099" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vendor", propOrder = {
    "active",
    "showAs",
    "vendorTypeId",
    "vendorTypeName",
    "salesTermId",
    "salesTermName",
    "openBalance",
    "openBalanceDate",
    "creditLimit",
    "acctNum",
    "vendor1099"
})
public class Vendor
    extends RoleBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "ShowAs")
    protected String showAs;
    @XmlElement(name = "VendorTypeId")
    protected IdType vendorTypeId;
    @XmlElement(name = "VendorTypeName")
    protected String vendorTypeName;
    @XmlElement(name = "SalesTermId")
    protected IdType salesTermId;
    @XmlElement(name = "SalesTermName")
    protected String salesTermName;
    @XmlElement(name = "OpenBalance")
    protected Money openBalance;
    @XmlElement(name = "OpenBalanceDate")
    protected String openBalanceDate;
    @XmlElement(name = "CreditLimit")
    protected Money creditLimit;
    @XmlElement(name = "AcctNum")
    protected String acctNum;
    @XmlElement(name = "Vendor1099")
    protected Boolean vendor1099;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the showAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAs() {
        return showAs;
    }

    /**
     * Sets the value of the showAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAs(String value) {
        this.showAs = value;
    }

    /**
     * Gets the value of the vendorTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getVendorTypeId() {
        return vendorTypeId;
    }

    /**
     * Sets the value of the vendorTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setVendorTypeId(IdType value) {
        this.vendorTypeId = value;
    }

    /**
     * Gets the value of the vendorTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorTypeName() {
        return vendorTypeName;
    }

    /**
     * Sets the value of the vendorTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorTypeName(String value) {
        this.vendorTypeName = value;
    }

    /**
     * Gets the value of the salesTermId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getSalesTermId() {
        return salesTermId;
    }

    /**
     * Sets the value of the salesTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setSalesTermId(IdType value) {
        this.salesTermId = value;
    }

    /**
     * Gets the value of the salesTermName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTermName() {
        return salesTermName;
    }

    /**
     * Sets the value of the salesTermName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTermName(String value) {
        this.salesTermName = value;
    }

    /**
     * Gets the value of the openBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOpenBalance() {
        return openBalance;
    }

    /**
     * Sets the value of the openBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOpenBalance(Money value) {
        this.openBalance = value;
    }

    /**
     * Gets the value of the openBalanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenBalanceDate() {
        return openBalanceDate;
    }

    /**
     * Sets the value of the openBalanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenBalanceDate(String value) {
        this.openBalanceDate = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditLimit(Money value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNum(String value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the vendor1099 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVendor1099() {
        return vendor1099;
    }

    /**
     * Sets the value of the vendor1099 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVendor1099(Boolean value) {
        this.vendor1099 = value;
    }

}

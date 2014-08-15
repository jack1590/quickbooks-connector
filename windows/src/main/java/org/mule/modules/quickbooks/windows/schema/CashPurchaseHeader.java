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
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Product: ALL
 *         Description: Financial Transaction information that pertains to the entire Cash Purchase transaction.
 *       
 * 
 * <p>Java class for CashPurchaseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashPurchaseHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}CashAccountReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}EntityReferenceGroup" minOccurs="0"/>
 *         &lt;element name="PayeeAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}TxnReferenceGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashPurchaseHeader", propOrder = {
    "cashAccountId",
    "cashAccountName",
    "entityId",
    "entityName",
    "entityType",
    "payeeAddr",
    "totalAmt",
    "txnId",
    "txnNum"
})
public class CashPurchaseHeader
    extends HeaderBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CashAccountId")
    protected IdType cashAccountId;
    @XmlElement(name = "CashAccountName")
    protected String cashAccountName;
    @XmlElement(name = "EntityId")
    protected IdType entityId;
    @XmlElement(name = "EntityName")
    protected String entityName;
    @XmlElement(name = "EntityType")
    protected EntityTypeEnum entityType;
    @XmlElement(name = "PayeeAddr")
    protected PhysicalAddress payeeAddr;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "TxnId")
    protected IdType txnId;
    @XmlElement(name = "TxnNum")
    protected String txnNum;

    /**
     * Gets the value of the cashAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getCashAccountId() {
        return cashAccountId;
    }

    /**
     * Sets the value of the cashAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setCashAccountId(IdType value) {
        this.cashAccountId = value;
    }

    /**
     * Gets the value of the cashAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAccountName() {
        return cashAccountName;
    }

    /**
     * Sets the value of the cashAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAccountName(String value) {
        this.cashAccountName = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setEntityId(IdType value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeEnum }
     *     
     */
    public EntityTypeEnum getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeEnum }
     *     
     */
    public void setEntityType(EntityTypeEnum value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the payeeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPayeeAddr() {
        return payeeAddr;
    }

    /**
     * Sets the value of the payeeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPayeeAddr(PhysicalAddress value) {
        this.payeeAddr = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the txnId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTxnId() {
        return txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTxnId(IdType value) {
        this.txnId = value;
    }

    /**
     * Gets the value of the txnNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnNum() {
        return txnNum;
    }

    /**
     * Sets the value of the txnNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnNum(String value) {
        this.txnNum = value;
    }

}

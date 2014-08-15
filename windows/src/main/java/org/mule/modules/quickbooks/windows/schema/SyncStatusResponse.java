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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.mule.modules.quickbooks.utils.QBDateAdapter;


/**
 * 
 *         Product: QBW
 *         Description: generic meta data response for any add mod
 *       
 * 
 * <p>Java class for SyncStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NgIdSet" type="{http://www.intuit.com/sb/cdm/v2}NgIdSet" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SyncStatusParam" type="{http://www.intuit.com/sb/cdm/v2}SyncStatusParam" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseLogTMS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncStatusResponse", propOrder = {
    "ngIdSet",
    "requestId",
    "syncStatusParam",
    "batchId",
    "stateCode",
    "stateDesc",
    "messageCode",
    "messageDesc",
    "responseLogTMS"
})
public class SyncStatusResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NgIdSet")
    protected NgIdSet ngIdSet;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "SyncStatusParam")
    protected SyncStatusParam syncStatusParam;
    @XmlElement(name = "BatchId")
    protected String batchId;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "StateDesc")
    protected String stateDesc;
    @XmlElement(name = "MessageCode")
    protected String messageCode;
    @XmlElement(name = "MessageDesc")
    protected String messageDesc;
    @XmlElement(name = "ResponseLogTMS", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date responseLogTMS;

    /**
     * Gets the value of the ngIdSet property.
     * 
     * @return
     *     possible object is
     *     {@link NgIdSet }
     *     
     */
    public NgIdSet getNgIdSet() {
        return ngIdSet;
    }

    /**
     * Sets the value of the ngIdSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link NgIdSet }
     *     
     */
    public void setNgIdSet(NgIdSet value) {
        this.ngIdSet = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the syncStatusParam property.
     * 
     * @return
     *     possible object is
     *     {@link SyncStatusParam }
     *     
     */
    public SyncStatusParam getSyncStatusParam() {
        return syncStatusParam;
    }

    /**
     * Sets the value of the syncStatusParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncStatusParam }
     *     
     */
    public void setSyncStatusParam(SyncStatusParam value) {
        this.syncStatusParam = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the stateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDesc() {
        return stateDesc;
    }

    /**
     * Sets the value of the stateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDesc(String value) {
        this.stateDesc = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the messageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDesc() {
        return messageDesc;
    }

    /**
     * Sets the value of the messageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDesc(String value) {
        this.messageDesc = value;
    }

    /**
     * Gets the value of the responseLogTMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getResponseLogTMS() {
        return responseLogTMS;
    }

    /**
     * Sets the value of the responseLogTMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseLogTMS(Date value) {
        this.responseLogTMS = value;
    }

}

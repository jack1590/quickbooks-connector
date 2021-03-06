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
 * <p>Java class for JobInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.intuit.com/sb/cdm/v2}JobStatusEnum" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.intuit.com/sb/cdm/v2}IDSDate" minOccurs="0"/>
 *         &lt;element name="ProjectedEndDate" type="{http://www.intuit.com/sb/cdm/v2}IDSDate" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.intuit.com/sb/cdm/v2}IDSDate" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}JobTypeReferenceGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInfo", propOrder = {
    "status",
    "startDate",
    "projectedEndDate",
    "endDate",
    "description",
    "jobTypeId",
    "jobTypeName"
})
public class JobInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status")
    protected JobStatusEnum status;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "ProjectedEndDate")
    protected String projectedEndDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "JobTypeId")
    protected IdType jobTypeId;
    @XmlElement(name = "JobTypeName")
    protected String jobTypeName;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatusEnum }
     *     
     */
    public JobStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatusEnum }
     *     
     */
    public void setStatus(JobStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the projectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectedEndDate() {
        return projectedEndDate;
    }

    /**
     * Sets the value of the projectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectedEndDate(String value) {
        this.projectedEndDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the jobTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getJobTypeId() {
        return jobTypeId;
    }

    /**
     * Sets the value of the jobTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setJobTypeId(IdType value) {
        this.jobTypeId = value;
    }

    /**
     * Gets the value of the jobTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTypeName() {
        return jobTypeName;
    }

    /**
     * Sets the value of the jobTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTypeName(String value) {
        this.jobTypeName = value;
    }

}

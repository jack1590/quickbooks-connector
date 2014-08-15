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
 * 			Product: QBW 
 * 			Description: Job types allow categorizing jobs so that similar jobs can be grouped and subtotaled on reports. Ultimately, they will help in determining which jobs are most profitable for the business.
 * 			
 * 
 * <p>Java class for JobType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}JobTypeParentReferenceGroup" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobType", propOrder = {
    "name",
    "jobTypeParentId",
    "jobTypeParentName",
    "active"
})
public class JobType
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "JobTypeParentId")
    protected IdType jobTypeParentId;
    @XmlElement(name = "JobTypeParentName")
    protected String jobTypeParentName;
    @XmlElement(name = "Active")
    protected Boolean active;

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

    /**
     * Gets the value of the jobTypeParentId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getJobTypeParentId() {
        return jobTypeParentId;
    }

    /**
     * Sets the value of the jobTypeParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setJobTypeParentId(IdType value) {
        this.jobTypeParentId = value;
    }

    /**
     * Gets the value of the jobTypeParentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTypeParentName() {
        return jobTypeParentName;
    }

    /**
     * Sets the value of the jobTypeParentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTypeParentName(String value) {
        this.jobTypeParentName = value;
    }

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

}

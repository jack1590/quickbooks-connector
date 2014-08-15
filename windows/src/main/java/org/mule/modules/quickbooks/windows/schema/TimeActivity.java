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
import java.math.BigInteger;
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
 *         Description: A record of time worked by a vendor or employee. A time activity records the time taken to complete a particular task. Professional service firms can track time for the following reasons: · To know the tasks of a person and the time spent on various projects, and to use this information for job costing. · To bill the clients using standard service item rates or custom billing rates. · To view and quickly access the unbilled time or expenses for a customer. · To view the number of unbilled hours in the project for each client in reports. · To use the stopwatch to record the time for a current activity. For example, when you answer a phone call from a client. · To preview the time records and paychecks of your employees when you pay your employees. · To pay non-employees (owners, partners, subcontractors, and vendors) for the number of hours they worked.
 *         Endpoint: services.intuit.com
 *         Business Rules: [li]If you modify the time activity records that are more than 5 years old, an error occurs. · The value of the NameOf element must be Employee or Vendor. [/li] [li]The value of the BillableStatus element must be Billable or HasBeenBillable. The default value is Billable. [/li][li] The default value of the Taxable element is set to True.[/li][li] Both the Hours and Minutes elements are either positive or negative.[/li]        
 *       
 * 
 * <p>Java class for TimeActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="TxnDate" type="{http://www.intuit.com/sb/cdm/v2}IDSDate" minOccurs="0"/>
 *         &lt;element name="NameOf" type="{http://www.intuit.com/sb/cdm/v2}TimeActivityTypeEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Employee" type="{http://www.intuit.com/sb/cdm/v2}EmployeeRef" minOccurs="0"/>
 *           &lt;element name="Vendor" type="{http://www.intuit.com/sb/cdm/v2}VendorRef" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}CustomerReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}JobReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ItemReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ClassReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PayrollItemReferenceGroup" minOccurs="0"/>
 *         &lt;element name="BillableStatus" type="{http://www.intuit.com/sb/cdm/v2}BillableStatusEnum" minOccurs="0"/>
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HourlyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Hours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Minutes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Seconds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BreakHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BreakMinutes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeActivity", propOrder = {
    "txnDate",
    "nameOf",
    "employee",
    "vendor",
    "customerId",
    "customerName",
    "jobId",
    "jobName",
    "itemId",
    "itemName",
    "itemType",
    "classId",
    "className",
    "payItemId",
    "payItemName",
    "billableStatus",
    "taxable",
    "hourlyRate",
    "hours",
    "minutes",
    "seconds",
    "breakHours",
    "breakMinutes",
    "startTime",
    "endTime",
    "description"
})
public class TimeActivity
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "NameOf")
    protected TimeActivityTypeEnum nameOf;
    @XmlElement(name = "Employee")
    protected EmployeeRef employee;
    @XmlElement(name = "Vendor")
    protected VendorRef vendor;
    @XmlElement(name = "CustomerId")
    protected IdType customerId;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "JobId")
    protected IdType jobId;
    @XmlElement(name = "JobName")
    protected String jobName;
    @XmlElement(name = "ItemId")
    protected IdType itemId;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "ItemType")
    protected ItemTypeEnum itemType;
    @XmlElement(name = "ClassId")
    protected IdType classId;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "PayItemId")
    protected IdType payItemId;
    @XmlElement(name = "PayItemName")
    protected String payItemName;
    @XmlElement(name = "BillableStatus")
    protected BillableStatusEnum billableStatus;
    @XmlElement(name = "Taxable")
    protected Boolean taxable;
    @XmlElement(name = "HourlyRate")
    protected BigDecimal hourlyRate;
    @XmlElement(name = "Hours")
    protected BigInteger hours;
    @XmlElement(name = "Minutes")
    protected BigInteger minutes;
    @XmlElement(name = "Seconds")
    protected BigInteger seconds;
    @XmlElement(name = "BreakHours")
    protected BigInteger breakHours;
    @XmlElement(name = "BreakMinutes")
    protected BigInteger breakMinutes;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date endTime;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the nameOf property.
     * 
     * @return
     *     possible object is
     *     {@link TimeActivityTypeEnum }
     *     
     */
    public TimeActivityTypeEnum getNameOf() {
        return nameOf;
    }

    /**
     * Sets the value of the nameOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeActivityTypeEnum }
     *     
     */
    public void setNameOf(TimeActivityTypeEnum value) {
        this.nameOf = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRef }
     *     
     */
    public EmployeeRef getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRef }
     *     
     */
    public void setEmployee(EmployeeRef value) {
        this.employee = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRef }
     *     
     */
    public VendorRef getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRef }
     *     
     */
    public void setVendor(VendorRef value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setCustomerId(IdType value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setJobId(IdType value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobName(String value) {
        this.jobName = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setItemId(IdType value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTypeEnum }
     *     
     */
    public ItemTypeEnum getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTypeEnum }
     *     
     */
    public void setItemType(ItemTypeEnum value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setClassId(IdType value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the payItemId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getPayItemId() {
        return payItemId;
    }

    /**
     * Sets the value of the payItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setPayItemId(IdType value) {
        this.payItemId = value;
    }

    /**
     * Gets the value of the payItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayItemName() {
        return payItemName;
    }

    /**
     * Sets the value of the payItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayItemName(String value) {
        this.payItemName = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillableStatusEnum }
     *     
     */
    public BillableStatusEnum getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableStatusEnum }
     *     
     */
    public void setBillableStatus(BillableStatusEnum value) {
        this.billableStatus = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the hourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Sets the value of the hourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHourlyRate(BigDecimal value) {
        this.hourlyRate = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHours(BigInteger value) {
        this.hours = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinutes(BigInteger value) {
        this.minutes = value;
    }

    /**
     * Gets the value of the seconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeconds(BigInteger value) {
        this.seconds = value;
    }

    /**
     * Gets the value of the breakHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBreakHours() {
        return breakHours;
    }

    /**
     * Sets the value of the breakHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBreakHours(BigInteger value) {
        this.breakHours = value;
    }

    /**
     * Gets the value of the breakMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBreakMinutes() {
        return breakMinutes;
    }

    /**
     * Sets the value of the breakMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBreakMinutes(BigInteger value) {
        this.breakMinutes = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Date value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Date value) {
        this.endTime = value;
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

}

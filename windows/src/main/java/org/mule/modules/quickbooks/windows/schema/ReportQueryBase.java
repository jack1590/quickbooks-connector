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
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportQueryBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportQueryBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}GlobalParameterGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}IteratorParameterGroup" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="DateMacro" type="{http://www.intuit.com/sb/cdm/v2}DateMacro" minOccurs="0"/>
 *           &lt;group ref="{http://www.intuit.com/sb/cdm/v2}TransactionDateFilter" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ReportBasis" type="{http://www.intuit.com/sb/cdm/v2}ReportBasisEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportQueryBase", propOrder = {
    "offeringId",
    "iteratorId",
    "startPage",
    "chunkSize",
    "dateMacro",
    "startTransactionDate",
    "endTransactionDate",
    "reportBasis"
})
@XmlSeeAlso({
    ReportCustomersWhoOweMe.class,
    ReportTopCustomersBySales.class,
    ReportProfitAndLoss.class,
    ReportBalanceSheet.class,
    ReportIncomeBreakdown.class,
    ReportSalesSummary.class,
    ReportAccountBalances.class
})
public abstract class ReportQueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OfferingId")
    protected OfferingId offeringId;
    @XmlElement(name = "IteratorId")
    protected String iteratorId;
    @XmlElement(name = "StartPage")
    protected BigInteger startPage;
    @XmlElement(name = "ChunkSize")
    protected Integer chunkSize;
    @XmlElement(name = "DateMacro")
    protected DateMacro dateMacro;
    @XmlElement(name = "StartTransactionDate")
    protected String startTransactionDate;
    @XmlElement(name = "EndTransactionDate")
    protected String endTransactionDate;
    @XmlElement(name = "ReportBasis")
    protected ReportBasisEnum reportBasis;

    /**
     * Gets the value of the offeringId property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingId }
     *     
     */
    public OfferingId getOfferingId() {
        return offeringId;
    }

    /**
     * Sets the value of the offeringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingId }
     *     
     */
    public void setOfferingId(OfferingId value) {
        this.offeringId = value;
    }

    /**
     * Gets the value of the iteratorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIteratorId() {
        return iteratorId;
    }

    /**
     * Sets the value of the iteratorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIteratorId(String value) {
        this.iteratorId = value;
    }

    /**
     * Gets the value of the startPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartPage(BigInteger value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the chunkSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    /**
     * Sets the value of the chunkSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChunkSize(Integer value) {
        this.chunkSize = value;
    }

    /**
     * Gets the value of the dateMacro property.
     * 
     * @return
     *     possible object is
     *     {@link DateMacro }
     *     
     */
    public DateMacro getDateMacro() {
        return dateMacro;
    }

    /**
     * Sets the value of the dateMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateMacro }
     *     
     */
    public void setDateMacro(DateMacro value) {
        this.dateMacro = value;
    }

    /**
     * Gets the value of the startTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTransactionDate() {
        return startTransactionDate;
    }

    /**
     * Sets the value of the startTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTransactionDate(String value) {
        this.startTransactionDate = value;
    }

    /**
     * Gets the value of the endTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTransactionDate() {
        return endTransactionDate;
    }

    /**
     * Sets the value of the endTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTransactionDate(String value) {
        this.endTransactionDate = value;
    }

    /**
     * Gets the value of the reportBasis property.
     * 
     * @return
     *     possible object is
     *     {@link ReportBasisEnum }
     *     
     */
    public ReportBasisEnum getReportBasis() {
        return reportBasis;
    }

    /**
     * Sets the value of the reportBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportBasisEnum }
     *     
     */
    public void setReportBasis(ReportBasisEnum value) {
        this.reportBasis = value;
    }

}
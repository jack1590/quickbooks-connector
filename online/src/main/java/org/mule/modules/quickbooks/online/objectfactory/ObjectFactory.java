/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.quickbooks.online.objectfactory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.mule.modules.quickbooks.online.schema.*;
import org.mule.modules.quickbooks.online.schema.Class;


/**
* This object contains factory methods for each 
* Java content interface and Java element interface 
* generated in the org.mule.modules.quickbooks.schema package. 
* <p>An ObjectFactory allows you to programatically 
* construct new instances of the Java representation 
* for XML content. The Java representation of XML 
* content can consist of schema derived interfaces 
* and classes representing the binding of schema 
* type definitions, element declarations and model 
* groups.  Factory methods for each of these are 
* provided in this class.
* 
*/
@XmlRegistry
public class ObjectFactory {

 private final static QName _Discount_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Discount");
 private final static QName _SalesTaxCode_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesTaxCode");
 private final static QName _SalesReceipt_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesReceipt");
 private final static QName _Item_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Item");
 private final static QName _Payment_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Payment");
 private final static QName _CreditCardCharge_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CreditCardCharge");
 private final static QName _Organization_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Organization");
 private final static QName _TimeActivity_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "TimeActivity");
 private final static QName _ShipMethod_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "ShipMethod");
 private final static QName _SalesRep_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesRep");
 private final static QName _ItemReceipt_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "ItemReceipt");
 private final static QName _Class_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Class");
 private final static QName _SalesOrder_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesOrder");
 private final static QName _CompanyMetaData_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CompanyMetaData");
 private final static QName _CustomFieldDefinitions_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CustomFieldDefinitions");
 private final static QName _PurchaseOrder_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "PurchaseOrder");
 private final static QName _Persons_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Persons");
 private final static QName _CustomFieldDefinition_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CustomFieldDefinition");
 private final static QName _CreditCardCredit_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CreditCardCredit");
 private final static QName _PaymentMethod_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "PaymentMethod");
 private final static QName _Charge_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Charge");
 private final static QName _Invoice_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Invoice");
 private final static QName _Party_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Party");
 private final static QName _CreditMemo_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CreditMemo");
 private final static QName _CustomField_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CustomField");
 private final static QName _SalesTerm_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesTerm");
 private final static QName _InventoryAdjustment_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "InventoryAdjustment");
 private final static QName _ItemGroupComponent_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "ItemGroupComponent");
 private final static QName _Preferences_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Preferences");
 private final static QName _CashPurchase_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "CashPurchase");
 private final static QName _SalesTaxGroup_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesTaxGroup");
 private final static QName _SalesTax_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesTax");
 private final static QName _Account_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Account");
 private final static QName _Organizations_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Organizations");
 private final static QName _Person_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Person");
 private final static QName _BOMComponent_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "BOMComponent");
 private final static QName _SalesTaxPaymentCheck_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "SalesTaxPaymentCheck");
 private final static QName _UOM_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "UOM");
 private final static QName _Vendor_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Vendor");
 private final static QName _BillPayment_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "BillPayment");
 private final static QName _Bill_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Bill");
 private final static QName _Job_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Job");
 private final static QName _Parties_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Parties");
 private final static QName _Employee_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Employee");
 private final static QName _VendorCredit_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "VendorCredit");
 private final static QName _TxnGeneric_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "TxnGeneric");
 private final static QName _VendorCreditToApply_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "VendorCreditToApply");
 private final static QName _Estimate_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Estimate");
 private final static QName _JournalEntry_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "JournalEntry");
 private final static QName _Check_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Check");
 private final static QName _Customer_QNAME = new QName("http://www.intuit.com/sb/cdm/v2", "Customer");
 
 private final static QName _QboUser_QNAME = new QName("http://www.intuit.com/sb/cdm/qbo", "QboUser");
 private final static QName _FaultInfo_QNAME = new QName("http://www.intuit.com/sb/cdm/baseexceptionmodel/xsd", "FaultInfo");
 private final static QName _SearchResults_QNAME = new QName("http://www.intuit.com/sb/cdm/qbo", "SearchResults");
 
 private final static QName _DeletedEntities_QNAME = new QName("http://www.intuit.com/sb/cdm/qbo", "DeletedEntities");
 private final static QName _GenericEntity_QNAME = new QName("http://www.intuit.com/sb/cdm/qbo", "GenericEntity");

 /**
  * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mule.modules.quickbooks.schema
  * 
  */
 public ObjectFactory() {
 }

 /**
  * Create an instance of {@link IdType }
  * 
  */
 public IdType createIdType() {
     return new IdType();
 }

 /**
  * Create an instance of {@link Customer }
  * 
  */
 public Customer createCustomer() {
     return new Customer();
 }

 /**
  * Create an instance of {@link SalesTaxPaymentCheckLine }
  * 
  */
 public SalesTaxPaymentCheckLine createSalesTaxPaymentCheckLine() {
     return new SalesTaxPaymentCheckLine();
 }

 /**
  * Create an instance of {@link CashPurchase }
  * 
  */
 public CashPurchase createCashPurchase() {
     return new CashPurchase();
 }

 /**
  * Create an instance of {@link SalesReceipts }
  * 
  */
 public SalesReceipts createSalesReceipts() {
     return new SalesReceipts();
 }

 /**
  * Create an instance of {@link QboAccountValidationInfo }
  * 
  */
 public QboAccountValidationInfo createQboAccountValidationInfo() {
     return new QboAccountValidationInfo();
 }

 /**
  * Create an instance of {@link CashPurchases }
  * 
  */
 public CashPurchases createCashPurchases() {
     return new CashPurchases();
 }

 /**
  * Create an instance of {@link ItemReceiptHeader }
  * 
  */
 public ItemReceiptHeader createItemReceiptHeader() {
     return new ItemReceiptHeader();
 }

 /**
  * Create an instance of {@link SalesOrders }
  * 
  */
 public SalesOrders createSalesOrders() {
     return new SalesOrders();
 }

 /**
  * Create an instance of {@link QboListReportResponse.ReportRow }
  * 
  */
 public QboListReportResponse.ReportRow createQboListReportResponseReportRow() {
     return new QboListReportResponse.ReportRow();
 }

 /**
  * Create an instance of {@link QboListReportRequest }
  * 
  */
 public QboListReportRequest createQboListReportRequest() {
     return new QboListReportRequest();
 }

 /**
  * Create an instance of {@link NumberTypeCustomField }
  * 
  */
 public NumberTypeCustomField createNumberTypeCustomField() {
     return new NumberTypeCustomField();
 }

 /**
  * Create an instance of {@link LinePurchase }
  * 
  */
 public LinePurchase createLinePurchase() {
     return new LinePurchase();
 }

 /**
  * Create an instance of {@link Employees }
  * 
  */
 public Employees createEmployees() {
     return new Employees();
 }

 /**
  * Create an instance of {@link LineBase }
  * 
  */
 public LineBase createLineBase() {
     return new LineBase();
 }

 /**
  * Create an instance of {@link CreditCardChargeLine }
  * 
  */
 public CreditCardChargeLine createCreditCardChargeLine() {
     return new CreditCardChargeLine();
 }

 /**
  * Create an instance of {@link ChargeLine }
  * 
  */
 public ChargeLine createChargeLine() {
     return new ChargeLine();
 }

 /**
  * Create an instance of {@link PaymentMethods }
  * 
  */
 public PaymentMethods createPaymentMethods() {
     return new PaymentMethods();
 }

 /**
  * Create an instance of {@link Item }
  * 
  */
 public Item createItem() {
     return new Item();
 }

 /**
  * Create an instance of {@link StringTypeCustomField }
  * 
  */
 public StringTypeCustomField createStringTypeCustomField() {
     return new StringTypeCustomField();
 }

 /**
  * Create an instance of {@link CreditCardCharge }
  * 
  */
 public CreditCardCharge createCreditCardCharge() {
     return new CreditCardCharge();
 }

 /**
  * Create an instance of {@link QboUser }
  * 
  */
 public QboUser createQboUser() {
     return new QboUser();
 }

 /**
  * Create an instance of {@link StringTypeCustomFieldDefinition }
  * 
  */
 public StringTypeCustomFieldDefinition createStringTypeCustomFieldDefinition() {
     return new StringTypeCustomFieldDefinition();
 }

 /**
  * Create an instance of {@link JournalEntryHeader }
  * 
  */
 public JournalEntryHeader createJournalEntryHeader() {
     return new JournalEntryHeader();
 }

 /**
  * Create an instance of {@link QboBalanceSheetReportResponse.LiabilitiesAndEquity }
  * 
  */
 public QboBalanceSheetReportResponse.LiabilitiesAndEquity createQboBalanceSheetReportResponseLiabilitiesAndEquity() {
     return new QboBalanceSheetReportResponse.LiabilitiesAndEquity();
 }

 /**
  * Create an instance of {@link CustomerRef }
  * 
  */
 public CustomerRef createCustomerRef() {
     return new CustomerRef();
 }

 /**
  * Create an instance of {@link Discount }
  * 
  */
 public Discount createDiscount() {
     return new Discount();
 }

 /**
  * Create an instance of {@link ItemGroupComponent }
  * 
  */
 public ItemGroupComponent createItemGroupComponent() {
     return new ItemGroupComponent();
 }

 /**
  * Create an instance of {@link JournalEntryLine }
  * 
  */
 public JournalEntryLine createJournalEntryLine() {
     return new JournalEntryLine();
 }

 /**
  * Create an instance of {@link VendorCreditLine }
  * 
  */
 public VendorCreditLine createVendorCreditLine() {
     return new VendorCreditLine();
 }

 /**
  * Create an instance of {@link QboBalanceSheetReportResponse.Assets.CurrentAssets }
  * 
  */
 public QboBalanceSheetReportResponse.Assets.CurrentAssets createQboBalanceSheetReportResponseAssetsCurrentAssets() {
     return new QboBalanceSheetReportResponse.Assets.CurrentAssets();
 }

 /**
  * Create an instance of {@link SalesRep }
  * 
  */
 public SalesRep createSalesRep() {
     return new SalesRep();
 }

 /**
  * Create an instance of {@link BillPayment }
  * 
  */
 public BillPayment createBillPayment() {
     return new BillPayment();
 }

 /**
  * Create an instance of {@link BillPaymentHeader }
  * 
  */
 public BillPaymentHeader createBillPaymentHeader() {
     return new BillPaymentHeader();
 }

 /**
  * Create an instance of {@link Vendor }
  * 
  */
 public Vendor createVendor() {
     return new Vendor();
 }

 /**
  * Create an instance of {@link CustomFieldDefinitions }
  * 
  */
 public CustomFieldDefinitions createCustomFieldDefinitions() {
     return new CustomFieldDefinitions();
 }

 /**
  * Create an instance of {@link Person }
  * 
  */
 public Person createPerson() {
     return new Person();
 }

 /**
  * Create an instance of {@link JobInfo }
  * 
  */
 public JobInfo createJobInfo() {
     return new JobInfo();
 }

 /**
  * Create an instance of {@link SalesTaxRef }
  * 
  */
 public SalesTaxRef createSalesTaxRef() {
     return new SalesTaxRef();
 }

 /**
  * Create an instance of {@link AccountRef }
  * 
  */
 public AccountRef createAccountRef() {
     return new AccountRef();
 }

 /**
  * Create an instance of {@link CreditChargeResponse }
  * 
  */
 public CreditChargeResponse createCreditChargeResponse() {
     return new CreditChargeResponse();
 }

 /**
  * Create an instance of {@link QboListReportResponse }
  * 
  */
 public QboListReportResponse createQboListReportResponse() {
     return new QboListReportResponse();
 }

 /**
  * Create an instance of {@link Customers }
  * 
  */
 public Customers createCustomers() {
     return new Customers();
 }

 /**
  * Create an instance of {@link InventoryAdjustmentHeader }
  * 
  */
 public InventoryAdjustmentHeader createInventoryAdjustmentHeader() {
     return new InventoryAdjustmentHeader();
 }

 /**
  * Create an instance of {@link NumberTypeCustomFieldDefinition }
  * 
  */
 public NumberTypeCustomFieldDefinition createNumberTypeCustomFieldDefinition() {
     return new NumberTypeCustomFieldDefinition();
 }

 /**
  * Create an instance of {@link Discounts }
  * 
  */
 public Discounts createDiscounts() {
     return new Discounts();
 }

 /**
  * Create an instance of {@link UOMs }
  * 
  */
 public UOMs createUOMs() {
     return new UOMs();
 }

 /**
  * Create an instance of {@link PayrollTxnHeader }
  * 
  */
 public PayrollTxnHeader createPayrollTxnHeader() {
     return new PayrollTxnHeader();
 }

 /**
  * Create an instance of {@link Preferences }
  * 
  */
 public Preferences createPreferences() {
     return new Preferences();
 }

 /**
  * Create an instance of {@link RoleBase }
  * 
  */
 public RoleBase createRoleBase() {
     return new RoleBase();
 }

 /**
  * Create an instance of {@link Payment }
  * 
  */
 public Payment createPayment() {
     return new Payment();
 }

 /**
  * Create an instance of {@link TelephoneNumber }
  * 
  */
 public TelephoneNumber createTelephoneNumber() {
     return new TelephoneNumber();
 }

 /**
  * Create an instance of {@link JournalEntries }
  * 
  */
 public JournalEntries createJournalEntries() {
     return new JournalEntries();
 }

 /**
  * Create an instance of {@link PaymentHeader }
  * 
  */
 public PaymentHeader createPaymentHeader() {
     return new PaymentHeader();
 }

 /**
  * Create an instance of {@link Offering }
  * 
  */
 public Offering createOffering() {
     return new Offering();
 }

 /**
  * Create an instance of {@link EstimateHeader }
  * 
  */
 public EstimateHeader createEstimateHeader() {
     return new EstimateHeader();
 }

 /**
  * Create an instance of {@link QboBulkResult }
  * 
  */
 public QboBulkResult createQboBulkResult() {
     return new QboBulkResult();
 }

 /**
  * Create an instance of {@link WebSiteAddress }
  * 
  */
 public WebSiteAddress createWebSiteAddress() {
     return new WebSiteAddress();
 }

 /**
  * Create an instance of {@link ShipMethod }
  * 
  */
 public ShipMethod createShipMethod() {
     return new ShipMethod();
 }

 /**
  * Create an instance of {@link QboBalanceSheetReportResponse.LiabilitiesAndEquity.Liabilities }
  * 
  */
 public QboBalanceSheetReportResponse.LiabilitiesAndEquity.Liabilities createQboBalanceSheetReportResponseLiabilitiesAndEquityLiabilities() {
     return new QboBalanceSheetReportResponse.LiabilitiesAndEquity.Liabilities();
 }

 /**
  * Create an instance of {@link InventoryAdjustments }
  * 
  */
 public InventoryAdjustments createInventoryAdjustments() {
     return new InventoryAdjustments();
 }

 /**
  * Create an instance of {@link CreditCardChargeHeader }
  * 
  */
 public CreditCardChargeHeader createCreditCardChargeHeader() {
     return new CreditCardChargeHeader();
 }

 /**
  * Create an instance of {@link HeaderSales }
  * 
  */
 public HeaderSales createHeaderSales() {
     return new HeaderSales();
 }

 /**
  * Create an instance of {@link TaxPayment }
  * 
  */
 public TaxPayment createTaxPayment() {
     return new TaxPayment();
 }

 /**
  * Create an instance of {@link VendorCreditHeader }
  * 
  */
 public VendorCreditHeader createVendorCreditHeader() {
     return new VendorCreditHeader();
 }

 /**
  * Create an instance of {@link CashPurchaseLine }
  * 
  */
 public CashPurchaseLine createCashPurchaseLine() {
     return new CashPurchaseLine();
 }

 /**
  * Create an instance of {@link BooleanTypeCustomField }
  * 
  */
 public BooleanTypeCustomField createBooleanTypeCustomField() {
     return new BooleanTypeCustomField();
 }

 /**
  * Create an instance of {@link PurchaseOrder }
  * 
  */
 public PurchaseOrder createPurchaseOrder() {
     return new PurchaseOrder();
 }

 /**
  * Create an instance of {@link PurchaseOrderLine }
  * 
  */
 public PurchaseOrderLine createPurchaseOrderLine() {
     return new PurchaseOrderLine();
 }

 /**
  * Create an instance of {@link CheckPayment }
  * 
  */
 public CheckPayment createCheckPayment() {
     return new CheckPayment();
 }

 /**
  * Create an instance of {@link BooleanTypeCustomFieldDefinition }
  * 
  */
 public BooleanTypeCustomFieldDefinition createBooleanTypeCustomFieldDefinition() {
     return new BooleanTypeCustomFieldDefinition();
 }

 /**
  * Create an instance of {@link DateTypeCustomFieldDefinition }
  * 
  */
 public DateTypeCustomFieldDefinition createDateTypeCustomFieldDefinition() {
     return new DateTypeCustomFieldDefinition();
 }

 /**
  * Create an instance of {@link SalesTaxPaymentCheckHeader }
  * 
  */
 public SalesTaxPaymentCheckHeader createSalesTaxPaymentCheckHeader() {
     return new SalesTaxPaymentCheckHeader();
 }

 /**
  * Create an instance of {@link PayrollDateRange }
  * 
  */
 public PayrollDateRange createPayrollDateRange() {
     return new PayrollDateRange();
 }

 /**
  * Create an instance of {@link Money }
  * 
  */
 public Money createMoney() {
     return new Money();
 }

 /**
  * Create an instance of {@link ItemReceiptLine }
  * 
  */
 public ItemReceiptLine createItemReceiptLine() {
     return new ItemReceiptLine();
 }

 /**
  * Create an instance of {@link PayrollAdjustment }
  * 
  */
 public PayrollAdjustment createPayrollAdjustment() {
     return new PayrollAdjustment();
 }

 /**
  * Create an instance of {@link EmailAddress }
  * 
  */
 public EmailAddress createEmailAddress() {
     return new EmailAddress();
 }

 /**
  * Create an instance of {@link CreditCardCredit }
  * 
  */
 public CreditCardCredit createCreditCardCredit() {
     return new CreditCardCredit();
 }

 /**
  * Create an instance of {@link BillPaymentLine }
  * 
  */
 public BillPaymentLine createBillPaymentLine() {
     return new BillPaymentLine();
 }

 /**
  * Create an instance of {@link OtherNameRef }
  * 
  */
 public OtherNameRef createOtherNameRef() {
     return new OtherNameRef();
 }

 /**
  * Create an instance of {@link EmployeeRef }
  * 
  */
 public EmployeeRef createEmployeeRef() {
     return new EmployeeRef();
 }

 /**
  * Create an instance of {@link InventoryAdjustmentLine }
  * 
  */
 public InventoryAdjustmentLine createInventoryAdjustmentLine() {
     return new InventoryAdjustmentLine();
 }

 /**
  * Create an instance of {@link SearchResults }
  * 
  */
 public SearchResults createSearchResults() {
     return new SearchResults();
 }

 /**
  * Create an instance of {@link SalesTaxPaymentChecks }
  * 
  */
 public SalesTaxPaymentChecks createSalesTaxPaymentChecks() {
     return new SalesTaxPaymentChecks();
 }

 /**
  * Create an instance of {@link Organizations }
  * 
  */
 public Organizations createOrganizations() {
     return new Organizations();
 }

 /**
  * Create an instance of {@link ModificationMetaData }
  * 
  */
 public ModificationMetaData createModificationMetaData() {
     return new ModificationMetaData();
 }

 /**
  * Create an instance of {@link Invoices }
  * 
  */
 public Invoices createInvoices() {
     return new Invoices();
 }

 /**
  * Create an instance of {@link SalesTerm }
  * 
  */
 public SalesTerm createSalesTerm() {
     return new SalesTerm();
 }

 /**
  * Create an instance of {@link CreditMemo }
  * 
  */
 public CreditMemo createCreditMemo() {
     return new CreditMemo();
 }

 /**
  * Create an instance of {@link TimeActivity }
  * 
  */
 public TimeActivity createTimeActivity() {
     return new TimeActivity();
 }

 /**
  * Create an instance of {@link PaymentMethod }
  * 
  */
 public PaymentMethod createPaymentMethod() {
     return new PaymentMethod();
 }

 /**
  * Create an instance of {@link EstimateLine }
  * 
  */
 public EstimateLine createEstimateLine() {
     return new EstimateLine();
 }

 /**
  * Create an instance of {@link LineSales }
  * 
  */
 public LineSales createLineSales() {
     return new LineSales();
 }

 /**
  * Create an instance of {@link InvoiceLine }
  * 
  */
 public InvoiceLine createInvoiceLine() {
     return new InvoiceLine();
 }

 /**
  * Create an instance of {@link BillHeader }
  * 
  */
 public BillHeader createBillHeader() {
     return new BillHeader();
 }

 /**
  * Create an instance of {@link Charge }
  * 
  */
 public Charge createCharge() {
     return new Charge();
 }

 /**
  * Create an instance of {@link QtyAdj }
  * 
  */
 public QtyAdj createQtyAdj() {
     return new QtyAdj();
 }

 /**
  * Create an instance of {@link CreditChargeInfo }
  * 
  */
 public CreditChargeInfo createCreditChargeInfo() {
     return new CreditChargeInfo();
 }

 /**
  * Create an instance of {@link JournalEntry }
  * 
  */
 public JournalEntry createJournalEntry() {
     return new JournalEntry();
 }

 /**
  * Create an instance of {@link ExternalKey }
  * 
  */
 public ExternalKey createExternalKey() {
     return new ExternalKey();
 }

 /**
  * Create an instance of {@link CashPurchaseHeader }
  * 
  */
 public CashPurchaseHeader createCashPurchaseHeader() {
     return new CashPurchaseHeader();
 }

 /**
  * Create an instance of {@link Estimate }
  * 
  */
 public Estimate createEstimate() {
     return new Estimate();
 }

 /**
  * Create an instance of {@link SalesTaxCodes }
  * 
  */
 public SalesTaxCodes createSalesTaxCodes() {
     return new SalesTaxCodes();
 }

 /**
  * Create an instance of {@link TxnGeneric.Header }
  * 
  */
 public TxnGeneric.Header createTxnGenericHeader() {
     return new TxnGeneric.Header();
 }

 /**
  * Create an instance of {@link Classes }
  * 
  */
 public Classes createClasses() {
     return new Classes();
 }

 /**
  * Create an instance of {@link VendorCreditToApply }
  * 
  */
 public VendorCreditToApply createVendorCreditToApply() {
     return new VendorCreditToApply();
 }

 /**
  * Create an instance of {@link Parties }
  * 
  */
 public Parties createParties() {
     return new Parties();
 }

 /**
  * Create an instance of {@link QboBalanceSheetReportResponse }
  * 
  */
 public QboBalanceSheetReportResponse createQboBalanceSheetReportResponse() {
     return new QboBalanceSheetReportResponse();
 }

 /**
  * Create an instance of {@link BillPayments }
  * 
  */
 public BillPayments createBillPayments() {
     return new BillPayments();
 }

 /**
  * Create an instance of {@link CreditCardCharges }
  * 
  */
 public CreditCardCharges createCreditCardCharges() {
     return new CreditCardCharges();
 }

 /**
  * Create an instance of {@link CreditCardCreditHeader }
  * 
  */
 public CreditCardCreditHeader createCreditCardCreditHeader() {
     return new CreditCardCreditHeader();
 }

 /**
  * Create an instance of {@link ReimbursableInfo }
  * 
  */
 public ReimbursableInfo createReimbursableInfo() {
     return new ReimbursableInfo();
 }

 /**
  * Create an instance of {@link CreditMemoLine }
  * 
  */
 public CreditMemoLine createCreditMemoLine() {
     return new CreditMemoLine();
 }

 /**
  * Create an instance of {@link SalesReps }
  * 
  */
 public SalesReps createSalesReps() {
     return new SalesReps();
 }

 /**
  * Create an instance of {@link ShipMethods }
  * 
  */
 public ShipMethods createShipMethods() {
     return new ShipMethods();
 }

 /**
  * Create an instance of {@link QboAccountTypeEnums }
  * 
  */
 public QboAccountTypeEnums createQboAccountTypeEnums() {
     return new QboAccountTypeEnums();
 }

 /**
  * Create an instance of {@link CreditCardCreditLine }
  * 
  */
 public CreditCardCreditLine createCreditCardCreditLine() {
     return new CreditCardCreditLine();
 }

 /**
  * Create an instance of {@link QboBalanceSheetReportResponse.LiabilitiesAndEquity.Liabilities.CurrentLiabilities }
  * 
  */
 public QboBalanceSheetReportResponse.LiabilitiesAndEquity.Liabilities.CurrentLiabilities createQboBalanceSheetReportResponseLiabilitiesAndEquityLiabilitiesCurrentLiabilities() {
     return new QboBalanceSheetReportResponse.LiabilitiesAndEquity.Liabilities.CurrentLiabilities();
 }

 /**
  * Create an instance of {@link SalesTaxGroups }
  * 
  */
 public SalesTaxGroups createSalesTaxGroups() {
     return new SalesTaxGroups();
 }

 /**
  * Create an instance of {@link SalesOrderHeader }
  * 
  */
 public SalesOrderHeader createSalesOrderHeader() {
     return new SalesOrderHeader();
 }

 /**
  * Create an instance of {@link PayrollEmployeeTimeTrackingInfo }
  * 
  */
 public PayrollEmployeeTimeTrackingInfo createPayrollEmployeeTimeTrackingInfo() {
     return new PayrollEmployeeTimeTrackingInfo();
 }

 /**
  * Create an instance of {@link CreditCardCredits }
  * 
  */
 public CreditCardCredits createCreditCardCredits() {
     return new CreditCardCredits();
 }

 /**
  * Create an instance of {@link ItemReceipts }
  * 
  */
 public ItemReceipts createItemReceipts() {
     return new ItemReceipts();
 }

 /**
  * Create an instance of {@link Estimates }
  * 
  */
 public Estimates createEstimates() {
     return new Estimates();
 }

 /**
  * Create an instance of {@link QboCompanyReport }
  * 
  */
 public QboCompanyReport createQboCompanyReport() {
     return new QboCompanyReport();
 }

 /**
  * Create an instance of {@link CompanyPreferences }
  * 
  */
 public CompanyPreferences createCompanyPreferences() {
     return new CompanyPreferences();
 }

 /**
  * Create an instance of {@link Bills }
  * 
  */
 public Bills createBills() {
     return new Bills();
 }

 /**
  * Create an instance of {@link Jobs }
  * 
  */
 public Jobs createJobs() {
     return new Jobs();
 }

 /**
  * Create an instance of {@link SalesTerms }
  * 
  */
 public SalesTerms createSalesTerms() {
     return new SalesTerms();
 }

 /**
  * Create an instance of {@link PaymentLine }
  * 
  */
 public PaymentLine createPaymentLine() {
     return new PaymentLine();
 }

 /**
  * Create an instance of {@link TaxLine }
  * 
  */
 public TaxLine createTaxLine() {
     return new TaxLine();
 }

 /**
  * Create an instance of {@link VendorCredit }
  * 
  */
 public VendorCredit createVendorCredit() {
     return new VendorCredit();
 }

 /**
  * Create an instance of {@link UOM }
  * 
  */
 public UOM createUOM() {
     return new UOM();
 }

 /**
  * Create an instance of {@link Bill }
  * 
  */
 public Bill createBill() {
     return new Bill();
 }

 /**
  * Create an instance of {@link QboUserCompanyMapping }
  * 
  */
 public QboUserCompanyMapping createQboUserCompanyMapping() {
     return new QboUserCompanyMapping();
 }

 /**
  * Create an instance of {@link PayrollRefund }
  * 
  */
 public PayrollRefund createPayrollRefund() {
     return new PayrollRefund();
 }

 /**
  * Create an instance of {@link BillLine }
  * 
  */
 public BillLine createBillLine() {
     return new BillLine();
 }

 /**
  * Create an instance of {@link SalesReceipt }
  * 
  */
 public SalesReceipt createSalesReceipt() {
     return new SalesReceipt();
 }

 /**
  * Create an instance of {@link SalesReceiptHeader }
  * 
  */
 public SalesReceiptHeader createSalesReceiptHeader() {
     return new SalesReceiptHeader();
 }

 /**
  * Create an instance of {@link PurchaseOrderHeader }
  * 
  */
 public PurchaseOrderHeader createPurchaseOrderHeader() {
     return new PurchaseOrderHeader();
 }

 /**
  * Create an instance of {@link QboBalanceSheetReportResponse.Assets }
  * 
  */
 public QboBalanceSheetReportResponse.Assets createQboBalanceSheetReportResponseAssets() {
     return new QboBalanceSheetReportResponse.Assets();
 }

 /**
  * Create an instance of {@link TxnGeneric }
  * 
  */
 public TxnGeneric createTxnGeneric() {
     return new TxnGeneric();
 }

 /**
  * Create an instance of {@link ItemReceipt }
  * 
  */
 public ItemReceipt createItemReceipt() {
     return new ItemReceipt();
 }

 /**
  * Create an instance of {@link DateTypeCustomField }
  * 
  */
 public DateTypeCustomField createDateTypeCustomField() {
     return new DateTypeCustomField();
 }

 /**
  * Create an instance of {@link Payments }
  * 
  */
 public Payments createPayments() {
     return new Payments();
 }

 /**
  * Create an instance of {@link SalesOrderLine }
  * 
  */
 public SalesOrderLine createSalesOrderLine() {
     return new SalesOrderLine();
 }

 /**
  * Create an instance of {@link Checks }
  * 
  */
 public Checks createChecks() {
     return new Checks();
 }

 /**
  * Create an instance of {@link BOMComponent }
  * 
  */
 public BOMComponent createBOMComponent() {
     return new BOMComponent();
 }

 /**
  * Create an instance of {@link PayrollCompany }
  * 
  */
 public PayrollCompany createPayrollCompany() {
     return new PayrollCompany();
 }

 /**
  * Create an instance of {@link PayrollCheck }
  * 
  */
 public PayrollCheck createPayrollCheck() {
     return new PayrollCheck();
 }

 /**
  * Create an instance of {@link SalesTaxCode }
  * 
  */
 public SalesTaxCode createSalesTaxCode() {
     return new SalesTaxCode();
 }

 /**
  * Create an instance of {@link CreditCardPayment }
  * 
  */
 public CreditCardPayment createCreditCardPayment() {
     return new CreditCardPayment();
 }

 /**
  * Create an instance of {@link PayrollTxnBase }
  * 
  */
 public PayrollTxnBase createPayrollTxnBase() {
     return new PayrollTxnBase();
 }

 /**
  * Create an instance of {@link NameValue }
  * 
  */
 public NameValue createNameValue() {
     return new NameValue();
 }

 /**
  * Create an instance of {@link Check }
  * 
  */
 public Check createCheck() {
     return new Check();
 }

 /**
  * Create an instance of {@link Invoice }
  * 
  */
 public Invoice createInvoice() {
     return new Invoice();
 }

 /**
  * Create an instance of {@link SalesOrder }
  * 
  */
 public SalesOrder createSalesOrder() {
     return new SalesOrder();
 }

 /**
  * Create an instance of {@link VendorCreditsToApply }
  * 
  */
 public VendorCreditsToApply createVendorCreditsToApply() {
     return new VendorCreditsToApply();
 }

 /**
  * Create an instance of {@link ValueAdj }
  * 
  */
 public ValueAdj createValueAdj() {
     return new ValueAdj();
 }

 /**
  * Create an instance of {@link VendorRef }
  * 
  */
 public VendorRef createVendorRef() {
     return new VendorRef();
 }

 /**
  * Create an instance of {@link UOMConvUnit }
  * 
  */
 public UOMConvUnit createUOMConvUnit() {
     return new UOMConvUnit();
 }

 /**
  * Create an instance of {@link Job }
  * 
  */
 public Job createJob() {
     return new Job();
 }

 /**
  * Create an instance of {@link Charges }
  * 
  */
 public Charges createCharges() {
     return new Charges();
 }

 /**
  * Create an instance of {@link PayrollTerminationInfo }
  * 
  */
 public PayrollTerminationInfo createPayrollTerminationInfo() {
     return new PayrollTerminationInfo();
 }

 /**
  * Create an instance of {@link Organization }
  * 
  */
 public Organization createOrganization() {
     return new Organization();
 }

 /**
  * Create an instance of {@link PhysicalAddress }
  * 
  */
 public PhysicalAddress createPhysicalAddress() {
     return new PhysicalAddress();
 }

 /**
  * Create an instance of {@link Account }
  * 
  */
 public Account createAccount() {
     return new Account();
 }

 /**
  * Create an instance of {@link InventoryAdjustment }
  * 
  */
 public InventoryAdjustment createInventoryAdjustment() {
     return new InventoryAdjustment();
 }

 /**
  * Create an instance of {@link TxnRef }
  * 
  */
 public TxnRef createTxnRef() {
     return new TxnRef();
 }

 /**
  * Create an instance of {@link InvoiceHeader }
  * 
  */
 public InvoiceHeader createInvoiceHeader() {
     return new InvoiceHeader();
 }

 /**
  * Create an instance of {@link Vendors }
  * 
  */
 public Vendors createVendors() {
     return new Vendors();
 }

 /**
  * Create an instance of {@link CompaniesMetaData }
  * 
  */
 public CompaniesMetaData createCompaniesMetaData() {
     return new CompaniesMetaData();
 }

 /**
  * Create an instance of {@link HeaderBase }
  * 
  */
 public HeaderBase createHeaderBase() {
     return new HeaderBase();
 }

 /**
  * Create an instance of {@link CheckLine }
  * 
  */
 public CheckLine createCheckLine() {
     return new CheckLine();
 }

 /**
  * Create an instance of {@link ReportAccount }
  * 
  */
 public ReportAccount createReportAccount() {
     return new ReportAccount();
 }

 /**
  * Create an instance of {@link SalesTax }
  * 
  */
 public SalesTax createSalesTax() {
     return new SalesTax();
 }

 /**
  * Create an instance of {@link FaultInfo }
  * 
  */
 public FaultInfo createFaultInfo() {
     return new FaultInfo();
 }

 /**
  * Create an instance of {@link Class }
  * 
  */
 public Class createClass() {
     return new Class();
 }

 /**
  * Create an instance of {@link SalesReceiptLine }
  * 
  */
 public SalesReceiptLine createSalesReceiptLine() {
     return new SalesReceiptLine();
 }

 /**
  * Create an instance of {@link Accounts }
  * 
  */
 public Accounts createAccounts() {
     return new Accounts();
 }

 /**
  * Create an instance of {@link PaymentDetail }
  * 
  */
 public PaymentDetail createPaymentDetail() {
     return new PaymentDetail();
 }

 /**
  * Create an instance of {@link SalesTaxGroup }
  * 
  */
 public SalesTaxGroup createSalesTaxGroup() {
     return new SalesTaxGroup();
 }

 /**
  * Create an instance of {@link SalesTaxPaymentCheck }
  * 
  */
 public SalesTaxPaymentCheck createSalesTaxPaymentCheck() {
     return new SalesTaxPaymentCheck();
 }

 /**
  * Create an instance of {@link Note }
  * 
  */
 public Note createNote() {
     return new Note();
 }

 /**
  * Create an instance of {@link PayrollEmployee }
  * 
  */
 public PayrollEmployee createPayrollEmployee() {
     return new PayrollEmployee();
 }

 /**
  * Create an instance of {@link PurchaseOrders }
  * 
  */
 public PurchaseOrders createPurchaseOrders() {
     return new PurchaseOrders();
 }

 /**
  * Create an instance of {@link TxnGenerics }
  * 
  */
 public TxnGenerics createTxnGenerics() {
     return new TxnGenerics();
 }

 /**
  * Create an instance of {@link ChargeHeader }
  * 
  */
 public ChargeHeader createChargeHeader() {
     return new ChargeHeader();
 }

 /**
  * Create an instance of {@link Party }
  * 
  */
 public Party createParty() {
     return new Party();
 }

 /**
  * Create an instance of {@link CashPayment }
  * 
  */
 public CashPayment createCashPayment() {
     return new CashPayment();
 }

 /**
  * Create an instance of {@link Employee }
  * 
  */
 public Employee createEmployee() {
     return new Employee();
 }

 /**
  * Create an instance of {@link Items }
  * 
  */
 public Items createItems() {
     return new Items();
 }

 /**
  * Create an instance of {@link CheckHeader }
  * 
  */
 public CheckHeader createCheckHeader() {
     return new CheckHeader();
 }

 /**
  * Create an instance of {@link PayrollTxnLine }
  * 
  */
 public PayrollTxnLine createPayrollTxnLine() {
     return new PayrollTxnLine();
 }

 /**
  * Create an instance of {@link SalesTaxes }
  * 
  */
 public SalesTaxes createSalesTaxes() {
     return new SalesTaxes();
 }

 /**
  * Create an instance of {@link VendorCredits }
  * 
  */
 public VendorCredits createVendorCredits() {
     return new VendorCredits();
 }

 /**
  * Create an instance of {@link Label }
  * 
  */
 public Label createLabel() {
     return new Label();
 }

 /**
  * Create an instance of {@link HeaderPurchase }
  * 
  */
 public HeaderPurchase createHeaderPurchase() {
     return new HeaderPurchase();
 }

 /**
  * Create an instance of {@link CreditMemoHeader }
  * 
  */
 public CreditMemoHeader createCreditMemoHeader() {
     return new CreditMemoHeader();
 }

 /**
  * Create an instance of {@link CreditMemos }
  * 
  */
 public CreditMemos createCreditMemos() {
     return new CreditMemos();
 }

 /**
  * Create an instance of {@link CompanyMetaData }
  * 
  */
 public CompanyMetaData createCompanyMetaData() {
     return new CompanyMetaData();
 }

 /**
  * Create an instance of {@link QboCompany }
  * 
  */
 public QboCompany createQboCompany() {
     return new QboCompany();
 }

 /**
  * Create an instance of {@link Persons }
  * 
  */
 public Persons createPersons() {
     return new Persons();
 }

 /**
  * Create an instance of {@link TimeActivities }
  * 
  */
 public TimeActivities createTimeActivities() {
     return new TimeActivities();
 }

 /**
  * Create an instance of {@link DeletedEntities }
  * 
  */
 public DeletedEntities createDeletedEntities() {
     return new DeletedEntities();
 }
 
 /**
  * Create an instance of {@link GenericEntity }
  * 
  */
 public GenericEntity createGenericEntity() {
     return new GenericEntity();
 }
 
 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Discount }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Discount")
 public JAXBElement<Discount> createDiscount(Discount value) {
     return new JAXBElement<Discount>(_Discount_QNAME, Discount.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesTaxCode }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesTaxCode")
 public JAXBElement<SalesTaxCode> createSalesTaxCode(SalesTaxCode value) {
     return new JAXBElement<SalesTaxCode>(_SalesTaxCode_QNAME, SalesTaxCode.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesReceipt")
 public JAXBElement<SalesReceipt> createSalesReceipt(SalesReceipt value) {
     return new JAXBElement<SalesReceipt>(_SalesReceipt_QNAME, SalesReceipt.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Item")
 public JAXBElement<Item> createItem(Item value) {
     return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Payment")
 public JAXBElement<Payment> createPayment(Payment value) {
     return new JAXBElement<Payment>(_Payment_QNAME, Payment.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardCharge }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CreditCardCharge")
 public JAXBElement<CreditCardCharge> createCreditCardCharge(CreditCardCharge value) {
     return new JAXBElement<CreditCardCharge>(_CreditCardCharge_QNAME, CreditCardCharge.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Organization")
 public JAXBElement<Organization> createOrganization(Organization value) {
     return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "TimeActivity")
 public JAXBElement<TimeActivity> createTimeActivity(TimeActivity value) {
     return new JAXBElement<TimeActivity>(_TimeActivity_QNAME, TimeActivity.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link ShipMethod }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "ShipMethod")
 public JAXBElement<ShipMethod> createShipMethod(ShipMethod value) {
     return new JAXBElement<ShipMethod>(_ShipMethod_QNAME, ShipMethod.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesRep }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesRep")
 public JAXBElement<SalesRep> createSalesRep(SalesRep value) {
     return new JAXBElement<SalesRep>(_SalesRep_QNAME, SalesRep.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link ItemReceipt }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "ItemReceipt")
 public JAXBElement<ItemReceipt> createItemReceipt(ItemReceipt value) {
     return new JAXBElement<ItemReceipt>(_ItemReceipt_QNAME, ItemReceipt.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Class }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Class")
 public JAXBElement<Class> createClass(Class value) {
     return new JAXBElement<Class>(_Class_QNAME, Class.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesOrder")
 public JAXBElement<SalesOrder> createSalesOrder(SalesOrder value) {
     return new JAXBElement<SalesOrder>(_SalesOrder_QNAME, SalesOrder.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CompanyMetaData }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CompanyMetaData")
 public JAXBElement<CompanyMetaData> createCompanyMetaData(CompanyMetaData value) {
     return new JAXBElement<CompanyMetaData>(_CompanyMetaData_QNAME, CompanyMetaData.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CustomFieldDefinitions }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CustomFieldDefinitions")
 public JAXBElement<CustomFieldDefinitions> createCustomFieldDefinitions(CustomFieldDefinitions value) {
     return new JAXBElement<CustomFieldDefinitions>(_CustomFieldDefinitions_QNAME, CustomFieldDefinitions.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "PurchaseOrder")
 public JAXBElement<PurchaseOrder> createPurchaseOrder(PurchaseOrder value) {
     return new JAXBElement<PurchaseOrder>(_PurchaseOrder_QNAME, PurchaseOrder.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Persons }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Persons")
 public JAXBElement<Persons> createPersons(Persons value) {
     return new JAXBElement<Persons>(_Persons_QNAME, Persons.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CustomFieldDefinition")
 public JAXBElement<CustomFieldDefinition> createCustomFieldDefinition(CustomFieldDefinition value) {
     return new JAXBElement<CustomFieldDefinition>(_CustomFieldDefinition_QNAME, CustomFieldDefinition.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardCredit }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CreditCardCredit")
 public JAXBElement<CreditCardCredit> createCreditCardCredit(CreditCardCredit value) {
     return new JAXBElement<CreditCardCredit>(_CreditCardCredit_QNAME, CreditCardCredit.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "PaymentMethod")
 public JAXBElement<PaymentMethod> createPaymentMethod(PaymentMethod value) {
     return new JAXBElement<PaymentMethod>(_PaymentMethod_QNAME, PaymentMethod.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Charge }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Charge")
 public JAXBElement<Charge> createCharge(Charge value) {
     return new JAXBElement<Charge>(_Charge_QNAME, Charge.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Invoice }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Invoice")
 public JAXBElement<Invoice> createInvoice(Invoice value) {
     return new JAXBElement<Invoice>(_Invoice_QNAME, Invoice.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Party }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Party")
 public JAXBElement<Party> createParty(Party value) {
     return new JAXBElement<Party>(_Party_QNAME, Party.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CreditMemo")
 public JAXBElement<CreditMemo> createCreditMemo(CreditMemo value) {
     return new JAXBElement<CreditMemo>(_CreditMemo_QNAME, CreditMemo.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CustomField }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CustomField")
 public JAXBElement<CustomField> createCustomField(CustomField value) {
     return new JAXBElement<CustomField>(_CustomField_QNAME, CustomField.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesTerm }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesTerm")
 public JAXBElement<SalesTerm> createSalesTerm(SalesTerm value) {
     return new JAXBElement<SalesTerm>(_SalesTerm_QNAME, SalesTerm.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link InventoryAdjustment }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "InventoryAdjustment")
 public JAXBElement<InventoryAdjustment> createInventoryAdjustment(InventoryAdjustment value) {
     return new JAXBElement<InventoryAdjustment>(_InventoryAdjustment_QNAME, InventoryAdjustment.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link ItemGroupComponent }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "ItemGroupComponent")
 public JAXBElement<ItemGroupComponent> createItemGroupComponent(ItemGroupComponent value) {
     return new JAXBElement<ItemGroupComponent>(_ItemGroupComponent_QNAME, ItemGroupComponent.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Preferences }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Preferences")
 public JAXBElement<Preferences> createPreferences(Preferences value) {
     return new JAXBElement<Preferences>(_Preferences_QNAME, Preferences.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link CashPurchase }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "CashPurchase")
 public JAXBElement<CashPurchase> createCashPurchase(CashPurchase value) {
     return new JAXBElement<CashPurchase>(_CashPurchase_QNAME, CashPurchase.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesTaxGroup }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesTaxGroup")
 public JAXBElement<SalesTaxGroup> createSalesTaxGroup(SalesTaxGroup value) {
     return new JAXBElement<SalesTaxGroup>(_SalesTaxGroup_QNAME, SalesTaxGroup.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesTax }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesTax")
 public JAXBElement<SalesTax> createSalesTax(SalesTax value) {
     return new JAXBElement<SalesTax>(_SalesTax_QNAME, SalesTax.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Account")
 public JAXBElement<Account> createAccount(Account value) {
     return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Organizations }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Organizations")
 public JAXBElement<Organizations> createOrganizations(Organizations value) {
     return new JAXBElement<Organizations>(_Organizations_QNAME, Organizations.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Person")
 public JAXBElement<Person> createPerson(Person value) {
     return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link BOMComponent }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "BOMComponent")
 public JAXBElement<BOMComponent> createBOMComponent(BOMComponent value) {
     return new JAXBElement<BOMComponent>(_BOMComponent_QNAME, BOMComponent.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SalesTaxPaymentCheck }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "SalesTaxPaymentCheck")
 public JAXBElement<SalesTaxPaymentCheck> createSalesTaxPaymentCheck(SalesTaxPaymentCheck value) {
     return new JAXBElement<SalesTaxPaymentCheck>(_SalesTaxPaymentCheck_QNAME, SalesTaxPaymentCheck.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link UOM }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "UOM")
 public JAXBElement<UOM> createUOM(UOM value) {
     return new JAXBElement<UOM>(_UOM_QNAME, UOM.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Vendor")
 public JAXBElement<Vendor> createVendor(Vendor value) {
     return new JAXBElement<Vendor>(_Vendor_QNAME, Vendor.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link BillPayment }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "BillPayment")
 public JAXBElement<BillPayment> createBillPayment(BillPayment value) {
     return new JAXBElement<BillPayment>(_BillPayment_QNAME, BillPayment.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Bill }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Bill")
 public JAXBElement<Bill> createBill(Bill value) {
     return new JAXBElement<Bill>(_Bill_QNAME, Bill.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Job }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Job")
 public JAXBElement<Job> createJob(Job value) {
     return new JAXBElement<Job>(_Job_QNAME, Job.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Parties }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Parties")
 public JAXBElement<Parties> createParties(Parties value) {
     return new JAXBElement<Parties>(_Parties_QNAME, Parties.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Employee")
 public JAXBElement<Employee> createEmployee(Employee value) {
     return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "VendorCredit")
 public JAXBElement<VendorCredit> createVendorCredit(VendorCredit value) {
     return new JAXBElement<VendorCredit>(_VendorCredit_QNAME, VendorCredit.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link TxnGeneric }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "TxnGeneric")
 public JAXBElement<TxnGeneric> createTxnGeneric(TxnGeneric value) {
     return new JAXBElement<TxnGeneric>(_TxnGeneric_QNAME, TxnGeneric.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link VendorCreditToApply }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "VendorCreditToApply")
 public JAXBElement<VendorCreditToApply> createVendorCreditToApply(VendorCreditToApply value) {
     return new JAXBElement<VendorCreditToApply>(_VendorCreditToApply_QNAME, VendorCreditToApply.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Estimate }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Estimate")
 public JAXBElement<Estimate> createEstimate(Estimate value) {
     return new JAXBElement<Estimate>(_Estimate_QNAME, Estimate.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "JournalEntry")
 public JAXBElement<JournalEntry> createJournalEntry(JournalEntry value) {
     return new JAXBElement<JournalEntry>(_JournalEntry_QNAME, JournalEntry.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Check }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Check")
 public JAXBElement<Check> createCheck(Check value) {
     return new JAXBElement<Check>(_Check_QNAME, Check.class, null, value);
 }

 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/v2", name = "Customer")
 public JAXBElement<Customer> createCustomer(Customer value) {
     return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
 }
 
 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link QboUser }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/qbo", name = "QboUser")
 public JAXBElement<QboUser> createQboUser(QboUser value) {
     return new JAXBElement<QboUser>(_QboUser_QNAME, QboUser.class, null, value);
 }
 
 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/baseexceptionmodel/xsd", name = "FaultInfo")
 public JAXBElement<FaultInfo> createFaultInfo(FaultInfo value) {
     return new JAXBElement<FaultInfo>(_FaultInfo_QNAME, FaultInfo.class, null, value);
 }
 
 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link SearchResults }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/qbo", name = "SearchResults")
 public JAXBElement<SearchResults> createSearchResults(SearchResults value) {
     return new JAXBElement<SearchResults>(_SearchResults_QNAME, SearchResults.class, null, value);
 }
 
 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link DeletedEntities }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/qbo", name = "DeletedEntities")
 public JAXBElement<DeletedEntities> createDeletedEntities(DeletedEntities value) {
     return new JAXBElement<DeletedEntities>(_DeletedEntities_QNAME, DeletedEntities.class, null, value);
 }
 
 /**
  * Create an instance of {@link JAXBElement }{@code <}{@link GenericEntity }{@code >}}
  * 
  */
 @XmlElementDecl(namespace = "http://www.intuit.com/sb/cdm/qbo", name = "GenericEntity")
 public JAXBElement<GenericEntity> createGenericEntity(GenericEntity value) {
     return new JAXBElement<GenericEntity>(_GenericEntity_QNAME, GenericEntity.class, null, value);
 }
}

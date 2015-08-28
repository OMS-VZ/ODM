package com.model;


import javax.jws.WebMethod;
import javax.jws.WebService;

//import java.sql.Clob;
@WebService
public class CustOrders {
	int customerID;
	String customerFname;
	String customerLname;
	String customerEmailID;
	long customerMobNo;
	String customerStatus;
	String customerType;
	String billPaymentMethod;
	int billingAddID;
	int serviceAddID;
	
	
	@WebMethod
	public String getCustomerFname() {
		return customerFname;
	}
	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}
	@WebMethod
	public String getCustomerLname() {
		return customerLname;
	}
	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}
	@WebMethod
	public String getCustomerEmailID() {
		return customerEmailID;
	}
	public void setCustomerEmailID(String customerEmailID) {
		this.customerEmailID = customerEmailID;
	}
	@WebMethod
	public long getCustomerMobNo() {
		return customerMobNo;
	}
	public void setCustomerMobNo(long customerMobNo) {
		this.customerMobNo = customerMobNo;
	}
	@WebMethod
	public String getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	@WebMethod
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	@WebMethod
	public int getBillingAddID() {
		return billingAddID;
	}
	public void setBillingAddID(int billingAddID) {
		this.billingAddID = billingAddID;
	}
	@WebMethod
	public int getServiceAddID() {
		return serviceAddID;
	}
	public void setServiceAddID(int serviceAddID) {
		this.serviceAddID = serviceAddID;
	}
	
	
	@WebMethod
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	@WebMethod
	public String getBillPaymentMethod() {
		return billPaymentMethod;
	}
	public void setBillPaymentMethod(String billPaymentMethod) {
		this.billPaymentMethod = billPaymentMethod;
	}
	
}

package com.model;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CustOrders3 {
	int customerID;
	String serviceID;
	String productID;
	int productQuantity;
	String productDescription;
	java.util.Date productStartDate;
	java.util.Date productEndDate;
	@WebMethod
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	@WebMethod
	public String getServiceID() {
		return serviceID;
	}
	
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	@WebMethod
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	@WebMethod
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	@WebMethod
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@WebMethod
	public java.util.Date getProductStartDate() {
		return productStartDate;
	}
	public void setProductStartDate(java.util.Date productStartDate) {
		this.productStartDate = productStartDate;
	}
	@WebMethod
	public java.util.Date getProductEndDate() {
		return productEndDate;
	}
	public void setProductEndDate(java.util.Date productEndDate) {
		this.productEndDate = productEndDate;
	}
}

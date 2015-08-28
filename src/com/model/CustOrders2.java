package com.model;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CustOrders2 {
	int customerID;
	int orderId;
	String orderStatus;
	java.util.Date negotiationDate;
	java.util.Date dueDate;
	java.util.Date completionDate;
	String orderType;
	@WebMethod
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	@WebMethod
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@WebMethod
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@WebMethod
	public java.util.Date getNegotiationDate() {
		return negotiationDate;
	}
	public void setNegotiationDate(java.util.Date negotiationDate) {
		this.negotiationDate = negotiationDate;
	}
	@WebMethod
	public java.util.Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(java.util.Date dueDate) {
		this.dueDate = dueDate;
	}
	@WebMethod
	public java.util.Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(java.util.Date completionDate) {
		this.completionDate = completionDate;
	}
	@WebMethod
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
}

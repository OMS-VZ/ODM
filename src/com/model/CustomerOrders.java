package com.model;

import java.sql.Clob;

public class CustomerOrders {
	int customerID;
	int orderId;
	java.util.Date negotiationDate;
	java.util.Date dueDate;
	String orderStatus;
	java.util.Date complitionDate;
	Clob clob1;
	String orderType;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public java.util.Date getNegotiationDate() {
		return negotiationDate;
	}
	public void setNegotiationDate(java.util.Date negotiationDate) {
		this.negotiationDate = negotiationDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public java.util.Date getComplitionDate() {
		return complitionDate;
	}
	public void setComplitionDate(java.util.Date complitionDate) {
		this.complitionDate = complitionDate;
	}
	public Clob getClob1() {
		return clob1;
	}
	public void setClob1(Clob clob1) {
		this.clob1 = clob1;
	}
	public java.util.Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(java.util.Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
}

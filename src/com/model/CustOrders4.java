package com.model;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CustOrders4 {
	int customerID;
	String serviceID;
	String serviceCurrentStatus;
	java.util.Date serviceEffectiveDate;
	java.util.Date serviceEndDate;
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
	public String getServiceCurrentStatus() {
		return serviceCurrentStatus;
	}
	public void setServiceCurrentStatus(String serviceCurrentStatus) {
		this.serviceCurrentStatus = serviceCurrentStatus;
	}
	@WebMethod
	public java.util.Date getServiceEffectiveDate() {
		return serviceEffectiveDate;
	}
	public void setServiceEffectiveDate(java.util.Date serviceEffectiveDate) {
		this.serviceEffectiveDate = serviceEffectiveDate;
	}
	@WebMethod
	public java.util.Date getServiceEndDate() {
		return serviceEndDate;
	}
	public void setServiceEndDate(java.util.Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

}

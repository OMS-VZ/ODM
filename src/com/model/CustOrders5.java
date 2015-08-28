package com.model;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CustOrders5 {
    String serviceID;
	String serviceName;
	@WebMethod
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	@WebMethod
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}

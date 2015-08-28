package com.model;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class CustOrders1 {
	int addressID;
	String addLine1;
	String addLine2;
	String city;
	String state;
	String stateCode;
	int zipCode;
	@WebMethod
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	@WebMethod
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	@WebMethod
	public String getAddLine2() {
		return addLine2;
	}
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	@WebMethod
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@WebMethod
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@WebMethod
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	@WebMethod
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
}

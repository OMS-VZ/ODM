package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.factory.CustFactory;
import com.model.CustOrders;
import com.model.CustOrders1;
import com.model.CustOrders2;
import com.model.CustOrders3;
import com.model.CustOrders4;
import com.model.CustOrders5;
//import com.model.CustOrders;
@WebService
public class CustDao {
	CustOrders co;
	CustOrders1 coa;
	CustOrders2 cob;
	CustOrders3 coc;
	CustOrders4 cod;
	CustOrders5 coe;

	CustFactory fc;
	public CustDao()
	{
		co= new CustOrders();
		coa= new CustOrders1();
		cob= new CustOrders2();
		coc= new CustOrders3();
		cod= new CustOrders4();
		coe= new CustOrders5();
		fc= new CustFactory();
	}
	
	
		@WebMethod
		public CustOrders newProv(int customerID)
		{
			
			Connection conn= fc.getOracleCon();
			
			try {
				
				String Query= "select * from customer where customer_id=?" ;
				
				PreparedStatement ps=conn.prepareStatement(Query);
				ps.setInt(1,customerID);
				
				ResultSet rs = ps.executeQuery();
				//System.out.println("");
				while(rs.next())
				{
					/*int orderID=rs.getInt("order_id");
					String status=rs.getString("order_status");
					String type=rs.getString("order_type");*/
					co.setCustomerFname(rs.getString("customer_fname"));
					co.setCustomerLname(rs.getString("customer_lname"));
					co.setCustomerEmailID(rs.getString("customer_email_id"));
					co.setCustomerMobNo(rs.getLong("customer_mobile_no"));
					co.setCustomerStatus(rs.getString("customer_status"));
					co.setCustomerType(rs.getString("customer_type"));
					co.setBillingAddID(rs.getInt("billing_address_id"));
					co.setServiceAddID(rs.getInt("service_address_id"));
					co.setBillPaymentMethod(rs.getString("bill_payment_method"));
					System.out.println("customer fname:"+co.getCustomerFname()+"customer lname:"+co.getCustomerLname()+"customer emailid:"+co.getCustomerEmailID()+"customer mobile no:"+co.getCustomerMobNo()+"customer status:"+co.getCustomerStatus()+"billing address id:"+co.getBillingAddID()+"service address id:"+co.getServiceAddID()+"bill payment id:"+co.getBillPaymentMethod());		
					}
				
			} catch (SQLException f) {
				
				f.printStackTrace();
			}	
			return co;
			}
		@WebMethod
		public CustOrders1 newProv1(int customerID)
		{
			
			Connection conn= fc.getOracleCon();
			
			try {
				
				String Query1= " select * from customer c,customer_address cs where c.customer_id=? and c.service_address_id=cs.address_id and c.billing_address_id=cs.address_id" ;
				
				PreparedStatement ps1=conn.prepareStatement(Query1);
				ps1.setInt(1,customerID);
				
				ResultSet rs1 = ps1.executeQuery();
				//System.out.println("");
				while(rs1.next())
				{
					/*int orderID=rs.getInt("order_id");
					String status=rs.getString("order_status");
					String type=rs.getString("order_type");*/
					coa.setAddressID(rs1.getInt("address_id"));
					coa.setAddLine1(rs1.getString("add_line1"));
					coa.setAddLine2(rs1.getString("add_line2"));
					coa.setCity(rs1.getString("city"));
					coa.setState(rs1.getString("state"));
					coa.setStateCode(rs1.getString("state_code"));
					coa.setZipCode(rs1.getInt("zip_code"));
					
					//System.out.println("address id:"+co.getAddressID()+"address line1:"+co.getAddLine1()+"address line1:"+co.getAddLine2()+"City:"+co.getCity()+"State:"+co.getState()+"StateCode:"+co.getStateCode()+"zip code:"+co.getZipCode());		
					}
				
			} catch (SQLException f) {
				
				f.printStackTrace();
			}	
			return coa;
			}

		@WebMethod
		public CustOrders2 newProv2(int customerID)
		{
			
			Connection conn= fc.getOracleCon();
			
			try {
				
				String Query2= "select * from customer_orders where customer_id=? " ;
				
				PreparedStatement ps2=conn.prepareStatement(Query2);
				ps2.setInt(1,customerID);
				
				ResultSet rs2 = ps2.executeQuery();
				//System.out.println("");
				while(rs2.next())
				{
					/*int orderID=rs.getInt("order_id");
					String status=rs.getString("order_status");
					String type=rs.getString("order_type");*/
					//rs.getInt("address_id")
					cob.setOrderId(rs2.getInt("order_id"));
					cob.setOrderStatus(rs2.getString("order_status"));
					cob.setDueDate(rs2.getDate("order_due_date"));
					
					java.sql.Date duedate = rs2.getDate("order_due_date");
					cob.setDueDate(duedate);
					
					java.sql.Date negdate = rs2.getDate("order_negotiation_date");
					cob.setNegotiationDate(negdate);
	
					java.sql.Date compdate = rs2.getDate("order_completion_date");
					cob.setCompletionDate(compdate);
					
					cob.setOrderType(rs2.getString("order_type"));
					
					//System.out.println("address id:"+co.getAddressID()+"address line1:"+co.getAddLine1()+"address line1:"+co.getAddLine2()+"City:"+co.getCity()+"State:"+co.getState()+"StateCode:"+co.getStateCode()+"zip code:"+co.getZipCode());		
					}
				
			} catch (SQLException f) {
				
				f.printStackTrace();
			}	
			return cob;
			}

		@WebMethod
		public CustOrders3 newProv3(int customerID)
		{
			
			Connection conn= fc.getOracleCon();
			
			try {
				
				String Query3= " select * from customer_orders co,product_services ps where customer_id=? and co.order_id=ps.order_id " ;
				
				PreparedStatement ps3=conn.prepareStatement(Query3);
				ps3.setInt(1,customerID);
				
				
				ResultSet rs3 = ps3.executeQuery();
				//System.out.println("");
				while(rs3.next())
				{
					
					coc.setCustomerID(rs3.getInt("customer_id"));
					coc.setServiceID(rs3.getString("service_id"));
					coc.setProductID(rs3.getString("product_id"));
					coc.setProductQuantity(rs3.getInt("product_quantity"));
					coc.setProductDescription(rs3.getString("product_description"));
					java.sql.Date psdate = rs3.getDate("product_start_date");
					coc.setProductStartDate(psdate);
					
					java.sql.Date pedate = rs3.getDate("product_end_date");
					coc.setProductEndDate(pedate);
					
					//System.out.println("address id:"+co.getAddressID()+"address line1:"+co.getAddLine1()+"address line1:"+co.getAddLine2()+"City:"+co.getCity()+"State:"+co.getState()+"StateCode:"+co.getStateCode()+"zip code:"+co.getZipCode());		
					}
				
			} catch (SQLException f) {
				
				f.printStackTrace();
			}	
			return coc;
			}
		@WebMethod
		public CustOrders4 newProv4(int customerID)
		{
			
			Connection conn= fc.getOracleCon();
			
			try {
				
				String Query4= " select * from customer_services where customer_id=? " ;
				
				PreparedStatement ps4=conn.prepareStatement(Query4);
				ps4.setInt(1,customerID);
				
				ResultSet rs4 = ps4.executeQuery();
				//System.out.println("");
				while(rs4.next())
				{
					
					cod.setServiceID(rs4.getString("service_id"));
					cod.setServiceCurrentStatus(rs4.getString("service_current_status"));
					
					java.sql.Date sedate = rs4.getDate("service_effective_date");
					cod.setServiceEffectiveDate(sedate);
					
					java.sql.Date enddate = rs4.getDate("service_end_date");
					cod.setServiceEndDate(enddate);
					
					//System.out.println("address id:"+co.getAddressID()+"address line1:"+co.getAddLine1()+"address line1:"+co.getAddLine2()+"City:"+co.getCity()+"State:"+co.getState()+"StateCode:"+co.getStateCode()+"zip code:"+co.getZipCode());		
					}
				
			} catch (SQLException f) {
				
				f.printStackTrace();
			}	
			return cod;
			}
		@WebMethod
		public CustOrders5 newProv5(int customerID)
		{
			
			Connection conn= fc.getOracleCon();
			
			try {
				
				String Query5= "  select * from customer_services cs,service_description sd where customer_id=? and cs.service_id=sd.service_id " ;
				
				PreparedStatement ps5=conn.prepareStatement(Query5);
				ps5.setInt(1,customerID);
				
				ResultSet rs5 = ps5.executeQuery();
				//System.out.println("");
				while(rs5.next())
				{
					
					coe.setServiceID(rs5.getString("service_id"));
					coe.setServiceName(rs5.getString("service_name"));
					//System.out.println("address id:"+co.getAddressID()+"address line1:"+co.getAddLine1()+"address line1:"+co.getAddLine2()+"City:"+co.getCity()+"State:"+co.getState()+"StateCode:"+co.getStateCode()+"zip code:"+co.getZipCode());		
					}
				
			} catch (SQLException f) {
				
				f.printStackTrace();
			}	
			return coe;
			}
		
		
	}




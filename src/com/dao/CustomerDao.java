package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.factory.DbFactory;
@WebService
public class CustomerDao {
	@WebMethod
	public  void newInstall(String dueDate1,String orderStatus,String orderType ,String clob1) throws ParseException
	{
		DbFactory fc= new DbFactory();
		Connection conn= fc.getOracleCon();
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into customer_orders(customer_id,order_id,order_negotiation_date,order_due_date,order_status,order_xml,order_type ) values(customers_sequence.nextval,order_sequence.nextval,to_date(sysdate,'DD/MM/YYYY'),?,?,?,?)");
			 SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		        Date parsed = format.parse("20110210");
		        java.sql.Date dueDate = new java.sql.Date(parsed.getTime());
			ps.setDate(1,dueDate);
			ps.setString(2,orderStatus);
			ps.setString(3,orderType);
			ps.setString(4,clob1);
			int x= ps.executeUpdate();
			if(x>0)
			{
			System.out.println("Success");
			conn.commit();
		}
		} catch (SQLException f) {
			
			f.printStackTrace();
		}
		
	}
//	
//	@WebMethod
//	public void updateBillAdress(String add_line1,String add_line2, String city, String state_code, int zipcode)
//	{
//		DbFactory fc= new DbFactory();
//		Connection conn= fc.getOracleCon();
//		try {
//			
//			PreparedStatement ps=conn.prepareStatement("insert into customer_address values(address_seq.nextval,?,?,?,?,?,?)");
//			ps.setString(1, add_line1);
//			ps.setString(2, add_line2);
//			ps.setString(3, city);
//			ps.setString(4, "state");
//			ps.setString(5, state_code);
//			ps.setInt(6, zipcode);
//			int x= ps.executeUpdate();
//			if(x>0)
//			{
//			System.out.println("Success");
//			conn.commit();
//		}
//		} catch (SQLException f) {
//			f.printStackTrace();
//		}
//		}
//	
//	@WebMethod
//	public void updateServeAdress(String add_line1,String add_line2, String city, String state_code, int zipcode)
//	{
//		DbFactory fc= new DbFactory();
//		Connection conn= fc.getOracleCon();
//		try {
//			
//			PreparedStatement ps=conn.prepareStatement("insert into customer_address values(address_seq.currval,?,?,?,?,?,?)");
//			ps.setString(1, add_line1);
//			ps.setString(2, add_line2);
//			ps.setString(3, city);
//			ps.setString(4, "state");
//			ps.setString(5, state_code);
//			ps.setInt(6, zipcode);
//			int x= ps.executeUpdate();
//			if(x>0)
//			{
//			System.out.println("Success");
//			conn.commit();
//		}
//		} catch (SQLException f) {
//			f.printStackTrace();
//		}
//		}	
//	@WebMethod
//	public void updatecustomer(String fname,String lname, String email, long moblie, String status, String custType)
//	{
//		DbFactory fc= new DbFactory();
//		Connection conn= fc.getOracleCon();
//		try {
//			PreparedStatement ps=conn.prepareStatement("insert into customer values(customers_sequence.currval,?,?,?,?,?,?,address_seq.currval,address_seq.nextval)");
//			ps.setString(1, fname);
//			ps.setString(2, lname);
//			ps.setString(3, email);
//			ps.setLong(4,moblie);
//			ps.setString(5,status);
//			ps.setString(6, custType);
//			int x= ps.executeUpdate();
//			if(x>0)
//			{
//			System.out.println("Success");
//			conn.commit();
//		}
//		} catch (SQLException f) {
//			f.printStackTrace();
//		}
//		}
}
	


package com.controller;

import java.util.List;

import javax.xml.ws.Endpoint;

import com.dao.CustDao1;
import com.dao.CustomerDao;
import com.model.CustOrders;
import com.model.CustOrders1;
import com.model.CustOrders2;
import com.model.CustOrders3;
import com.model.CustOrders4;
import com.model.CustOrders5;

public class CustController {
public static void main(String[] args) {
	CustDao1 op= new CustDao1();
	String url="http://192.168.0.121:1008/CustOrders";
	    Endpoint.publish(url, op);
	    System.out.println("service started"+url);
	    
	    
	    CustomerDao cd= new CustomerDao();
	     String url1="http://192.168.0.121:1013/CustomerOrdersService";
	    Endpoint.publish(url1, cd);
	    System.out.println("service started"+url1);
	    
	/*List<CustOrders> obj=op.getCustOrders(22);
	System.out.println("first:"+obj);

	List<CustOrders1> obj1=op.getCustOrders1(22);
	System.out.println("second:"+obj1);

	List<CustOrders2> obj2=op.getCustOrders2(22);
	System.out.println("third:"+obj2);

	List<CustOrders3> obj3=op.getCustOrders3(22);
	System.out.println("four:"+obj3);

	List<CustOrders4> obj4=op.getCustOrders4(22);
	System.out.println("five:"+obj4);

	List<CustOrders5> obj5=op.getCustOrders5(22);
	System.out.println("six:"+obj5);*/	    
}

}

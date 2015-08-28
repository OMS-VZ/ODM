package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.model.CustOrders;
import com.model.CustOrders1;
import com.model.CustOrders2;
import com.model.CustOrders3;
import com.model.CustOrders4;
import com.model.CustOrders5;
@WebService
public class CustDao1 {
    
    List<CustOrders> l;
    @WebMethod
	public List<CustOrders> getCustOrders(int customerID)
	{
		l=new ArrayList<CustOrders>();
		CustDao ca=new CustDao();
		CustOrders dp=new CustOrders();
		dp=ca.newProv(customerID);
		l.add(dp);
		return l;
	}
	
    List<CustOrders1> m;
    @WebMethod
	public List<CustOrders1> getCustOrders1(int customerID)
	{
		m=new ArrayList<CustOrders1>();
		CustDao ab=new CustDao();
		CustOrders1 bc=new CustOrders1();
		bc=ab.newProv1(customerID);
		m.add(bc);
		return m;
	}
    
   
    List<CustOrders2> n;
    @WebMethod
	public List<CustOrders2> getCustOrders2(int customerID)
	{
		n=new ArrayList<CustOrders2>();
		CustDao cd=new CustDao();
		CustOrders2 de=new CustOrders2();
		de=cd.newProv2(customerID);
		n.add(de);
		return n;
	}  
    
    List<CustOrders3> o;
    @WebMethod
	public List<CustOrders3> getCustOrders3(int customerID)
	{
		o=new ArrayList<CustOrders3>();
		CustDao fg=new CustDao();
		CustOrders3 hi=new CustOrders3();
		hi=fg.newProv3(customerID);
		o.add(hi);
		return o;
	}  
    
    List<CustOrders4> p;
    @WebMethod
	public List<CustOrders4> getCustOrders4(int customerID)
	{
		p=new ArrayList<CustOrders4>();
		CustDao jk=new CustDao();
		CustOrders4 lm=new CustOrders4();
		lm=jk.newProv4(customerID);
		p.add(lm);
		return p;
	}  
  
    List<CustOrders5> q;
    @WebMethod
	public List<CustOrders5> getCustOrders5(int customerID)
	{
		q=new ArrayList<CustOrders5>();
		CustDao np=new CustDao();
		CustOrders5 qr=new CustOrders5();
		qr=np.newProv5(customerID);
		q.add(qr);
		return q;
	}  
    
    
}

package TestPack;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.dao.CustDao;
import com.dao.CustDao1;
import com.model.CustOrders;
import com.model.CustOrders1;
import com.model.CustOrders2;
import com.model.CustOrders3;
import com.model.CustOrders4;
import com.model.CustOrders5;

public class CustDaoTest {

	CustDao cdobj;
	@Before
	public void initEnvironment()//SETS UP TESTING ENVIRONMENT
    {
	    System.out.println("creating test environment");
	    cdobj=new CustDao();
    }

	@Test
	public void custOrdersTest() throws Exception {
	
	//int customerID=27;
	CustDao1 py=new CustDao1();
	List<CustOrders> an=py.getCustOrders(27);
	assertNotNull(an);
	assertTrue(an.size()>0);
    assertEquals(an.get(0).getCustomerFname(),"raju");
	}

	@Test
	public void custOrders1Test() throws Exception {
	
	//int customerID=27;
	CustDao1 ay=new CustDao1();
	List<CustOrders1> bn= ay.getCustOrders1(27);
	assertNotNull(bn);
	assertTrue(bn.size()>0);
    assertEquals(bn.get(0).getAddLine1(),null);
	}
	
	@Test
	public void custOrders2Test() throws Exception {
	
	//int customerID=27;
	CustDao1 by=new CustDao1();
	List<CustOrders2> cn= by.getCustOrders2(28);
	assertNotNull(cn);
	assertTrue(cn.size()>0);
    assertEquals(cn.get(0).getOrderId(),136);
	}
	
	@Test
	public void custOrders3Test() throws Exception {
	
	//int customerID=27;
	CustDao1 cy=new CustDao1();
	List<CustOrders3> dn= cy.getCustOrders3(28);
	assertNotNull(dn);
	assertTrue(dn.size()>0);
    assertEquals(dn.get(0).getServiceID(),null);
	}
	
	//public void test() {
		//fail("Not yet implemented");
	//}

	@Test
	public void custOrders4Test() throws Exception {
	
	//int customerID=27;
	CustDao1 dy=new CustDao1();
	List<CustOrders4> en= dy.getCustOrders4(27);
	assertNotNull(en);
	assertTrue(en.size()>0);
    assertEquals(en.get(0).getServiceCurrentStatus(),"Working");
	}
	
	@Test
	public void custOrders5Test() throws Exception {
	
	//int customerID=27;
	CustDao1 ey=new CustDao1();
	List<CustOrders5> fn= ey.getCustOrders5(27);
	assertNotNull(fn);
	assertTrue(fn.size()>0);
    assertEquals(fn.get(0).getServiceName(),null);
	}
	
	
}

package TestPack;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

//import org.junit.Before;
import org.junit.Test;

public class CustFactoryTest {
	Connection conn=null;
	@Test
	public void setUp() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr" );
	     assertNotNull(conn);
	     conn.close();
	}

	//@Test
	//public void test() {
		//fail("Not yet implemented");
		
		//assertNotNull(conn);
		
		//assertEquals(expected, actual);
	//}

}

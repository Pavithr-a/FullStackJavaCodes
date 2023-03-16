package AccountManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCls6 {
	void ConnectionDemo() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
		if(connection==null) {
			System.out.println("Connection not established with Oracle Data Base");
		}
		else {
			System.out.println("Success....Connection is established with Oracle DB");
		}
	}

}

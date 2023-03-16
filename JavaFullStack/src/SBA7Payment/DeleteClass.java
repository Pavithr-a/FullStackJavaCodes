package SBA7Payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteClass extends InsertClass{
	void Delquery() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			
			
			//for(int i=0;i<cartItems.size();i++) {
				String delquery="Delete from cartList where cartItems='productName'";
						int result=statement.executeUpdate(delquery);
			//}
		} catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
	



}

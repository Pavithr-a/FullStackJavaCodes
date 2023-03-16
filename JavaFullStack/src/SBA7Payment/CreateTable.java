package SBA7Payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable extends PaymentMethods{
	void sql() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			
			Statement statement=connection.createStatement();
			boolean Table=statement.execute("create table cartList(cartItems varchar(25),productid number(10),priceList number(10))");
			if(Table==false) {
				System.out.println("table is created");
			}
			else {
				System.out.println("error in table");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

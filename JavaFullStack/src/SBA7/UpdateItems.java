package SBA7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateItems extends ReplaceAndRefund5{
	void UpdateItems() throws SQLException {
		Scanner scanner=new Scanner(System.in);
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
		Statement statement=connection.createStatement();
		System.out.println("Enter order number:");
		int productNumber=sc.nextInt();
		for(int i=0;i<=cartItems.size();i++) {
			int ItemsAdded=statement.executeUpdate("update CartItemsPayment set OrderName=?"+",OrderPrice=?"+ " where OrderNumber="+productNumber);
		}
	}

}

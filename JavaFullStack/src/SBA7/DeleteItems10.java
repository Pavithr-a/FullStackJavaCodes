package SBA7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteItems10 extends ConnectionClss7{
	void ItemsDeleteInCart() throws SQLException {
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Your record will be deleted,Enter order number:");
			int OrderNumber=sc.nextInt();
			String delQuery="delete from CartItemsPaymentC where ="+OrderNumber;
			System.out.println(delQuery);
			int result=statement.executeUpdate(delQuery);
			if(result==0) {
				System.out.println("Customer account number doesn't exist "+OrderNumber);
			}
			else {
				System.out.println("Customer account is deleted successfully");
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package AccountManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import SBA7.ReplaceAndRefund5;

public class UpdateAccount11 extends ReplaceAndRefund5{

	void AccountUpdates() throws SQLException {
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Your account details will be updated");
			int select;
			int updatePin;
			System.out.println("To update, Enter account number:");
			long AccountNumber=sc.nextLong();
			System.out.println("Change Pin");
				System.out.println("Enter pin to update:");
				updatePin=sc.nextInt();
				
			String UpdateQuery="update accountsDXC set pin="+updatePin+ " where AccountNumber="+AccountNumber;
			
			System.out.println(UpdateQuery);
			Integer result=statement.executeUpdate(UpdateQuery);
			
			if(result==0) {
				System.out.println("No account information was updated.");
			}
			else {
				System.out.println("Account information updated successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

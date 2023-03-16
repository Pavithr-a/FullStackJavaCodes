package AccountManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAccount10 extends ConnectionCls6{

	void AccountDelete() throws SQLException {
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Your record will be deleted,Enter your account number:");
			long AccountNumber=sc.nextLong();
			String delQuery="delete from accountsDXC where AccountNumber="+AccountNumber;
			System.out.println(delQuery);
			int result=statement.executeUpdate(delQuery);
			if(result==0) {
				System.out.println("Customer account number doesn't exist "+AccountNumber);
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

package SBA6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAccount6 extends ConnectionCls{

	void DeleteAccount() {
		Scanner sc=new Scanner(System.in);
		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			System.out.println("Record will be deleted for a customer,Enter username:");
			String username=sc.nextLine();
			String deleteQuery="delete from DXCBank where username= "+username;
			int result=statement.executeUpdate(deleteQuery);
			if(result==0) {
				System.out.println("Customer record doesn't exists with username: "+username);
			}
			else {
				System.out.println("Customer record deleted");
			}
			
		}
		 catch (SQLException e) {
				e.printStackTrace();
		}
	}
}

package AccountManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert7 extends ConnectionCls6{
	Scanner sc=new Scanner(System.in);
	void InsertDetails() throws Exception{
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			System.out.println("Enter Serial number:");
			int sno=sc.nextInt();
			System.out.println("Enter Customer name:");
			String username=sc.next();
			System.out.println("Enter pin number:");
			int pin=sc.nextInt();
			System.out.println("Enter account number: ");
			long AccountNumber=sc.nextLong();
			System.out.println("Enter balance:");
			double balance=sc.nextDouble();
			String insertQuery="insert into accountsDXC values(" + sno + ",'"+username+"',"+pin+","+AccountNumber+","+ balance+")";
			int result=statement.executeUpdate(insertQuery);
			
			if(result==0) {
				System.out.println("Records not inserted");
			}
			else {
				System.out.println("Records inserted into accountsDXC table");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}

package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			if(connection==null) {
				System.out.println("Connection not established with Oracle Data Base");
			}
			else {
				System.out.println("Success....Connection is established with Oracle DB");
			}
			Statement statement=connection.createStatement();
			for(int i=0;i<3;i++) {
			System.out.println("Enter Student number:");
			int sno=sc.nextInt();
			System.out.println("Enter Student name:");
			String sname=sc.next();
			System.out.println("Enter engineering branch:");
			String branch=sc.next();
			String insertQuery="insert into studentdxc values(" + sno + ",'"+sname+"','"+branch+"')";
			System.out.println(insertQuery);
			
			int result=statement.executeUpdate(insertQuery);
	
			if(result==0) {
				System.out.println("Records not inserted");
			}
			else {
				System.out.println("Records inserted into studentdxc table");
			}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

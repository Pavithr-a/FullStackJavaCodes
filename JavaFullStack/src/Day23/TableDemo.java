package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class TableDemo {

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
			java.sql.Statement statement=connection.createStatement();
			System.out.println("Enter tableName:");
			String table=sc.next();
			boolean success=statement.execute("create table "+table +"(sno number(5),sname varchar(40),pin number(4),AccountNumber numeric(16),balance number(8,2))");
			if(success==false) {
				System.out.println("Student table created");
			}
			else {
				System.out.println("Error in table creation");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

}

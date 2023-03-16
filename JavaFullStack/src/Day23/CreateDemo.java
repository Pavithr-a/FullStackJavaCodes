package Day23;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDemo {
	public static void main(String[] args) {
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
			boolean success=statement.execute("create table studentdxc(sno number(5),sname varchar(40),branch varchar(30))");
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

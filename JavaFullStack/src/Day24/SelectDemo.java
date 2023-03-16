package Day24;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

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
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from studentdxc");
			while(rs.next()!=false) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			rs.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

}

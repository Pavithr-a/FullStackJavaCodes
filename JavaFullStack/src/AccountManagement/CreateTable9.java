package AccountManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable9 extends ConnectionCls6{

	Scanner sc=new Scanner(System.in);
	void Table() throws Exception{
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			System.out.println("Enter tableName:");
			String table=sc.next();
			boolean success=statement.execute("create table "+table +"(sno number(5),username varchar(40),pin number(4),AccountNumber numeric(16),balance number(8,2))");
			if(success==false) {
				System.out.println("Student table created");
			}
			else {
				System.out.println("Error in table creation");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

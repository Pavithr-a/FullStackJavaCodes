package SBA6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDXCBankTable extends ConnectionCls{
	
	void CreateTable(){
		Scanner sc=new Scanner(System.in);
	try {
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
		Statement statement=connection.createStatement();
		System.out.println("Enter tableName:");
		String tableName=sc.next();
		String createSQl="create table "+tableName+"(accountNumber number(16),username varchar(40),userpassword number(4),balance number(8,2))";
		boolean success=statement.execute(createSQl);
		if(success==false) {
			System.out.println("DXC table created");
		}
		else {
			System.out.println("Error in table creation");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}

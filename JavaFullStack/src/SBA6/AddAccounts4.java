package SBA6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddAccounts4 extends ConnectionCls{
	List<Accounts3> accounts=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void InsertAccount() throws Exception{
		
		try {
			String userName;
			long accountNumber;
			int userpassword;
			double balance;
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			System.out.println("Enter account number 16-digit:");
			accountNumber=sc.nextLong();
			System.out.println("Enter username:");
			userName =sc.next();
			System.out.println("Enter password as 4-digit pin:");
			userpassword=sc.nextInt();
			System.out.println("Balance:");
			balance=sc.nextDouble();
			String insertQuery="insert into DXCBank(accountNumber,username,userpassword,balance) values("+accountNumber+",'"+userName+"',"+userpassword+""+balance+")";
			int result=statement.executeUpdate(insertQuery);
			if(result==0) {
				System.out.println("Records not inserted");
			}
			else {
				System.out.println("Records inserted into studentdxc table");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}

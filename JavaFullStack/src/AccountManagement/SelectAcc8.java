package AccountManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SelectAcc8 extends ConnectionCls6{
	List<Accounts3> list=new ArrayList<>();
	SelectAcc8() throws SQLException{
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from accountsDXC");
			
			

		while(rs.next()!=false) {
			Accounts3 acc=new Accounts3();
			acc.setSno(rs.getInt(1));
			acc.setUserName(rs.getString(2));
			acc.setUserPin(rs.getInt(3));
			acc.setAccountNumber(rs.getLong(4));
			acc.setBalance(rs.getDouble(5));
			list.add(acc);
			
		}
		rs.close();
		statement.close();
		connection.close();
		}
	
	void SelectAllDetails() throws Exception{
		
		
			for(Accounts3 account:list) {
				System.out.println(account.getSno()+" "+account.getUserName()+" "+account.getUserPin()+" "+account.getAccountNumber()+" "+account.getBalance());
			}
				
			
			
		}
}



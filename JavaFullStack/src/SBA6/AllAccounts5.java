package SBA6;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllAccounts5 extends ConnectionCls{
	
	private Connection connection;
	public void allAccounts() throws Exception {
		List<Accounts3> accounts=new ArrayList<>();
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from DXCBank");
			
			while(rs.next()!=false) {
				Accounts3 acc=new Accounts3();
				acc.setAccountNumber(rs.getLong(1));
				acc.setUserName(rs.getString(2));
				acc.setUserPassword(rs.getInt(3));
				acc.setBalance(rs.getDouble(4));
				accounts.add(acc);

			}
			for(Accounts3 account:accounts) {
				System.out.println(account.get);
			}

			rs.close();
			statement.close();
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

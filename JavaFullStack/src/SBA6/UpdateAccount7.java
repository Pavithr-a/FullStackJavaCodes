package SBA6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAccount7 extends ConnectionCls{

	void UpdateAccount() throws Exception {
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
		Statement statement=connection.createStatement();
		String UpdateQuery="update DXCBank set username='Keerthu' where accountNumber=8714228799141189";
	}
}

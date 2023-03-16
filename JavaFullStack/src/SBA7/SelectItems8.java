package SBA7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SelectItems8 extends ConnectionClss7{
	List<OrderItems3> list =new ArrayList<>();
	void SelectItems() throws SQLException{
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("select * from CartItemsPayment");
		
		

	while(rs.next()!=false) {
		OrderItems3 acc=new OrderItems3(0, null, 0);
		acc.setOrderNumber(rs.getInt(1));
		acc.setOrderName(rs.getString(2));
		acc.setOrderPrice(rs.getInt(3));
		
		list.add(acc);
		
	}
	rs.close();
	statement.close();
	connection.close();
	}

	void SelectAllItems() throws Exception{
		for(OrderItems3 order:list) {
			System.out.println(order.getOrderNumber()+" "+order.getOrderName()+" "+order.getOrderPrice());
		}
			
		
		
	}
}

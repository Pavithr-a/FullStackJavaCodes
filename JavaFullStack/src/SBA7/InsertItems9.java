package SBA7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertItems9 extends ReplaceAndRefund5{

	
	void InsertDetails() throws Exception{
		Scanner sc=new Scanner(System.in);
		try {
			Scanner scanner=new Scanner(System.in);
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement statement=connection.createStatement();
			for(int i=0;i<cartItems.size();i++) {
				int cartdetails=statement.executeUpdate("insert into cartList values('"+Items.get(i)+"',"+orderId.get(i)+","+priceList.get(i)+")");
			}
			/*System.out.println("Enter order number:");
			int OrderNumber=sc.nextInt();
			System.out.println("Enter order name:");
			String OrderName=scanner.nextLine();
			System.out.println("Enter order price:");
			int OrderPrice=sc.nextInt();
			String insertQuery="insert into CartItemsPayment values(" +OrderNumber + ",'"+OrderName+"',"+OrderPrice+")";
			int result=statement.executeUpdate(insertQuery);
			
			if(result==0) {
				System.out.println("Records not inserted");
			}
			else {
				System.out.println("Records inserted into  table CartItemsPayment");
			}*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
			
}

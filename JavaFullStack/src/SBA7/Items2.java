package SBA7;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Items2{ 
	Scanner sc=new Scanner(System.in);
		List<OrderItems3> cartItems=new ArrayList<>();
		double totalCost;
	
	
	void CartItems() {
		cartItems.add(new OrderItems3(1512, "Tie&Dye T-shirt", 1299));
		cartItems.add(new OrderItems3(2152, "Jeans", 649));
		cartItems.add(new OrderItems3(4520, "Sarees", 1479));
		cartItems.add(new OrderItems3(3874, "Boots", 1960));
		System.out.println("-----------");
		System.out.println("|Cart Items|");
		System.out.println("--------------------------------------------------------");
		for(OrderItems3 items:cartItems) {
			System.out.println("| "+items.getOrderNumber()+" "+items.getOrderName()+" "+items.getOrderPrice());
			totalCost+=items.getOrderPrice();
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Total:"+totalCost);
		
		
		
	}
	
	

}

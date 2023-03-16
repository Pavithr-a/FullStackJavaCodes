package SBA7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceAndRefund5 extends Items2{
	InsertItems9 items=new InsertItems9();
	Scanner sc=new Scanner(System.in);
	DeleteItems10 del=new DeleteItems10();
	ArrayList<String> Items=new ArrayList<String>();
	ArrayList<Integer>priceList=new ArrayList<Integer>();
	ArrayList<Integer>orderId=new ArrayList<Integer>();
	
	

	/*void addCart() {
		Items.add("Socks");
		Items.add("Suits");
		priceList.add(250);
		priceList.add(3000);
		orderId.add(6810);
		orderId.add(6815);
		
		for(int k=0;k<Items.size();k++) {
			
			System.out.println(Items.get(k)+    "         "+priceList.get(k)+" Rs.");
		}
		totalCost=totalCost+(priceList.get(0)+priceList.get(1)+priceList.get(2)+priceList.get(3));
		
		System.out.println("Total: "+totalCost);
		
	}*/
	void Refund() {
		System.out.println("Enter the order number for refund:");
		int number1=sc.nextInt();
		for(OrderItems3 order:cartItems) {
			if(order.getOrderNumber()==number1) {
				System.out.println("Your amount of Rs."+order.getOrderPrice()+" will be refunded to your account within 2-3 days.");
			}
			else {
				System.out.println("Order number is not on the cart");
			}
		}
		
	}
	void choose() throws Exception {
		System.out.println("Do you want to place order?Yes or No");
		char choice=sc.next().charAt(0);
		if(choice=='y') {
			System.out.println("Directing you to payment");
		}
		else if(choice=='n') {
			System.out.println("Do you need delete or add orders?1.Delete Item 2.Add Item");
			int select;
			select=sc.nextInt();
			switch(select) {
			case 1:
				del.ItemsDeleteInCart();
				break;
			case 2:
				//addCart();
				items.InsertDetails();
				break;
			case 3:
				System.out.println("Invaild selection");
				break;
			}
			
		}
		else {
			System.out.println("Select only the two required options");
			choose();
		}
	}
}

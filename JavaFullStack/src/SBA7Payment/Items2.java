package SBA7Payment;

import java.util.ArrayList;

public class Items2{
	ArrayList<String> cartItems=new ArrayList<String>();
	ArrayList<Integer>priceList=new ArrayList<Integer>();
	//ArrayList<Integer>quantity=new ArrayList<Integer>();
	ArrayList<Integer>productid=new ArrayList<Integer>();
	double total=0;
	
	void Cart() {
	
	cartItems.add("Tie&Dye T-shirt");
	cartItems.add("Jeans");
	cartItems.add("Sarees");
	cartItems.add("Boots");
	priceList.add(1299);
	priceList.add(649);
	priceList.add(1479);
	priceList.add(1960);
	productid.add(1512);
	productid.add(2152);
	productid.add(4520);
	productid.add(3874);
	System.out.println("These are the products in your cart");
	System.out.println("--------------------------------------------");
	System.out.println("Products           price");
	for(int k=0;k<cartItems.size();k++) {
		
		System.out.println(cartItems.get(k)+    "         "+priceList.get(k)+" Rs/-");
	}
	System.out.println("--------------------------------------------");
	
	total=total+(priceList.get(0)+priceList.get(1)+priceList.get(2)+priceList.get(3));
	
	System.out.println("Total: "+total);
	System.out.println("--------------------------------------------");
		
	}
	
}

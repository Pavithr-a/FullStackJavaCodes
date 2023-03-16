package SBA7Payment;

public class ChatBot extends Discount6{

String productName;
	
	void query() {
		System.out.println("Do you have any queires regarding orders ?(yes or no)");
		String Input=sc.next();
		if(Input.equalsIgnoreCase("yes")) {
			chatbot();
		}
		else if(Input.equalsIgnoreCase("no")) {
			System.out.println("Thanks for shopping with us Have a good day");
		}
		else {
			System.out.println("Invalid entry please try again");
			query();
		}
		
	}
	void chatbot() {
		System.out.println("Welcome to chatbox we are here to help you");
		System.out.println("type anything to get started");
		String types=sc.next();
		System.out.println("Hey there!!!!!" );
		String Array1[]= {"1.cancel order", "2.Refund related queries", "3.offers or discounts"};
		for(String x:Array1) {
			System.out.println(x);
		}
		String chat=sc.next();
		if(chat.equals("1")) {
			cancellation();
		}
		else if(chat.equals("2")) {
			refund();
			
		}
		else if(chat.equals("3")) {
			coupon();
			
		}
		else {
			System.out.println("Invalid entry try again");
			chatbot();
		}
		
	}
	void refund() {
		System.out.println("1.I self shipped my return but haven't received my refund ");
		System.out.println("2.My order didnt get placed but payment got debited");
		String ref=sc.next();
		if(ref.equals("1")) {
			System.out.println("Refund will be initiated after we receive the items at our warehouse and it passes the quality check.");
			System.out.println("Refund time depends on the mode of refund ");
			System.out.println("Bank Account: Time the items takes to +1 to 3 business days ");
			System.out.println("Online refund: Time the items takes to reach us +7 to 10 business days");
			System.out.println("Phonepe Wallet Time the item takes to reach us +1 business days");
			
		}
		else if(ref.equals("2")) {
			System.out.println("We are sorry that your order didn't get through successfully but you no need to worry at all");
			System.out.println("The amount debited from your bank/card account will be automatically refunded");
			
		}
		else {
			System.out.println("Invalid input");
			refund();
		}
	}
	void coupon() {
		System.out.println("1.My coupon got locked");
		System.out.println("2.I didn't receive complete discount");
		String offer=sc.next();
		if(offer.equals("1")) {
			System.out.println("A locked coupon will automatically unlocked in 3 hours");
			
		}
		else if(offer.equals("2")) {
			System.out.println("your discount depends on the products you select and the total bill ");
		}
		else {
			System.out.println("Invalid Input");
			coupon();
		}
	}
	void cancellation() {
		
		
		System.out.println("Please select which order you want to cancel ");
		viewcart();
		 productName=sc.next();
		for(int k=0;k<cartItems.size();k++) {
			if(productName.equalsIgnoreCase(cartItems.get(k))) {
				cartItems.remove(k);
				priceList.remove(k);
				productid.remove(k);
				viewcart();
				System.out.println("your amount of Rs "+priceList.get(k)+" will get  refunded WITHIN 2-3 working days.");
				break;
			}
			
		}
	}
	void viewcart() {
		System.out.println("your cart contains:");
		for(String x:cartItems) {
			System.out.println(x);
	}

}
}

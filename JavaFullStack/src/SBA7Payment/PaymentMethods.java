package SBA7Payment;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaymentMethods extends ChatBot{
	String UserOtp,s="";
	int randNo;
	Scanner scanner=new Scanner(System.in);
	
	void paymentMode() {
		System.out.println("Please select the mode of payment");
		String Array[]= {"debit card","credit card","Upi","Cash"};
		for(String x:Array) {
			System.out.println(x);
		}
		
		String select=scanner.next();
		if(select.equalsIgnoreCase("debitcard")) {
			System.out.println("You have selected debit card");
			System.out.println("You have received 200 off on debit card");
			total=total-200;
			System.out.println("Your total amount to be paid is "+total);
			while(true) {
			System.out.println("Please enter 16 digit card Number");
			String debit=scanner.next();
			Pattern pat3=Pattern.compile("[1-9][0-9]{15}");
			Matcher mat3=pat3.matcher(debit);
			boolean iscorrect=mat3.matches();
			if(iscorrect) {
				otp();
				System.out.println("your account is debited with "+total+" Rs.");
				query();
				
				break;
		}
			else {
				System.out.println("Invalid Input Try again");
			}
		}

}
		else if(select.equalsIgnoreCase("Creditcard")) {
			System.out.println("You have selected credit card");
			System.out.println("You have received 500 off on credit card");
			total=total-500;
			System.out.println("Your total amount to be paid is "+total);
			while(true) {
			System.out.println("Please enter 16 digit card Number");
			String credit=scanner.next();
			Pattern pat3=Pattern.compile("[1-9][0-9]{15}");
			Matcher mat3=pat3.matcher(credit);
			boolean iscorrect=mat3.matches();
			if(iscorrect) {
				otp();
				System.out.println("your account is debited with "+total+" Rs/-");
				query();
				break;
		}
			else {
				System.out.println("Invalid Input Try again");
			}
		}
		}
		else if(select.equalsIgnoreCase("Upi")) {
			System.out.println("you have selected upi");
			System.out.println("You have received 100 off on upi payment");
			total=total-100;
			System.out.println("Your total amount to be paid is "+total);
			while(true) {
			System.out.println("Please enter the 4 digit upi pin");
			String pin=scanner.next();
			Pattern pat3=Pattern.compile("[1-9]{4}");
			Matcher mat3=pat3.matcher(pin);
			boolean iscorrect=mat3.matches();
			if(iscorrect) {
				otp();
				System.out.println("your account is debited with "+total+" Rs/-");
				System.out.println("Your order is placed and will be delivered by March-12-2023");
				query();
				break;
		}
			else {
				System.out.println("Invalid pin Try again");
			}
		}
		}
		else if(select.equalsIgnoreCase("cash")) {
			System.out.println("You have selected cash");
			System.out.println("Your order is placed and will be delivered by March-12-2023");
			System.out.println("Please pay the amount "+total+" at the time of delivery");
			query();
			
		}
		else {
			System.out.println("Invalid Input please try again ");
			paymentMode();
			
		}
		
}
	void otp() {
		
		for(int i=0;i<4;i++) {
			randNo=new Random().nextInt(9);
			s=s.concat(Integer.toString(randNo));
		}
		
		System.out.println("Otp generated: "+s);
		System.out.println("Enter your Otp: ");
		UserOtp=scanner.next();
		if(s.equals(UserOtp)) {
			System.out.println("OTP verified Successfully");
		}else {
			System.out.println("Please enter the valid Otp");
			otp();
		}
		
		
	}
	

}

package SBA7;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaymentMethods4 extends UserDetails1{
	Scanner sc=new Scanner(System.in);
	
	void PayMethods() {
		System.out.println("1.Debit Card/Credit Card");
		System.out.println("2.UPI payment");
		System.out.println("3.COD");
		int choice;
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter your debit/credit card number:");
				String card=sc.next();
				Pattern pat3=Pattern.compile("[1-9]{16}");
				
				Matcher mat3=pat3.matcher(card);
				boolean iscorrect=mat3.matches();
				if(iscorrect) {
					OTPGenerate();
					System.out.println("NOTIFICATION TO CUSTOMER");
					System.out.println("your account is debited with "+totalCost+" Rs.");					
					break;
			}
				else {
					System.out.println("Invalid card number try again");
					
				}
				break;
			case 2:
				System.out.println("In your online payment app click OK to process further");
				System.out.println("Enter your UPI pin:");
				String upiPin=sc.nextLine();
				Pattern pat4=Pattern.compile("[1-9]{4}");
				Matcher mat4=pat4.matcher(upiPin);
				boolean iscorrect1=mat4.matches();
				break;
			
			case 3:
				System.out.println("Your total bill+delivery=80 is Rs."+totalCost+80);
				break;
		}
				
		}
	void OTPGenerate(){
		Random randNumber=new Random();
		
		int otp=randNumber.nextInt(8999)+1000;
		System.out.println("VERIFICATION:");
		for(int i=0;i<3;i++) {
			System.out.println("VERIFICATION CODE:"+otp);
			System.out.println("Enter given OTP:");
			int verify=sc.nextInt();
			if(verify==otp) {
				System.out.println(ANSI_GREEN+"****VERIFICATION SUCCESSFUL****"+ANSI_RESET);
				break;
			}else {
				System.out.println("Enter the correct OTP");
			}
	}
	}
		
	}

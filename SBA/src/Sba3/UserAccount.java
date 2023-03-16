package Sba3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAccount extends Cab implements User,UserPayment {

	@Override
	public void display() {
		System.out.println(ANSI_YELLOW2+"		Welcome to Rider App		"+ANSI_RESET);
	}

	Scanner sc = new Scanner(System.in);
	int count = 0;
	void UserInput() {
		
		
		System.out.println("Enter your 10 digit Mobile Number:");
		String MobNum = sc.nextLine();
		Pattern pattern = Pattern.compile("[6-9][0-9]{9}");
		boolean mat = MobNum.matches("9952451694");
			if (mat) {
				System.out.println("Proceed to next");
				System.out.println("--------------------------------");
				UserPassword();
				
			}else {
				System.out.println("Wrong number");
				UserInput();
			}
	}
		void UserPassword() {
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		Pattern pat2 = Pattern.compile("[a-z]+[A-Z]+[0-9]+[@!]+");
		boolean mat2=password.matches("Pavi@1562");
			if (mat2) {
				System.out.println(ANSI_PURPLE+"Hey Pavithra!! You are back!!!"+ANSI_RESET);
				System.out.println("--------------------------------");
			} 
			else if(count==2){
				System.out.println("You have tried 3 attempts and your account will be locked!!");
				System.out.println("--------------------------------");
			}
			else{
				System.out.println("Wrong Password!! Try again!");
				System.out.println("Please enter the correct password:");
				count++;				
				UserPassword();
				System.out.println("--------------------------------");
				
			}
		
	}
		@Override
		public void Payment() {
			System.out.println("Payment Methods");
			System.out.println("1.Debit/Credit card\n2.UPI payment");
			int number=sc.nextInt();
			if(number==1) {
				System.out.println("Enter your card number: ");
				
			}
			
		}

}

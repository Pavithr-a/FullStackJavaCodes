package Sba2;

import java.util.Scanner;

public class BankingDetails2 extends BankingDetails {

	BankingDetails2(int AccountNumber, int Balance, int Pin) {
		super(AccountNumber, Balance, Pin);
	}

	int choice;
	
	void Display() {
		do {
			System.out.println();
			System.out.println("Welcome to Pavi's Bank");
			System.out.println();
			System.out.println("Enter account number(8 digits): " + AccountNumber);
			// AccountNumber=scanner.nextInt();
			System.out.println("Enter pin(4 digit):" + Pin);
			System.out.println("---------------------------------------------");
			// PinNumber=scanner.nextInt();
			// System.out.println(Balance);
			System.out.println("Options");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.View Balance");
			System.out.println("4.Exit");
			System.out.println("---------------------------------------------");
			//boolean value = true;
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Withdraw();
				break;
			case 2:
				Deposit();
				break;
			case 3:
				Balance();
				break;
			case 4:
				System.out.println("Thanks for banking with Pavi Bank.....");
				break;

			default:
				System.out.println("Invalid Choice!!!");
			}
		}

		while (choice != 4);
	}
}

/*
 * boolean value=false; void Check() { for(int element:AccountNum) {
 * if(element==AccountNumber) {
 * 
 * //System.out.print("Proceed"); break; } //System.out.println("Try again"); }
 * 
 * 
 * 
 * 
 * for(int element:Pin) { if(element==PinNumber) { value=true;
 * System.out.println("Proceed"); break; }
 * //System.out.println("Incorrect pin"); }
 * //System.out.println("Incorrect pin"); }
 */

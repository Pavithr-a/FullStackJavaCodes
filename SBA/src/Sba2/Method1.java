package Sba2;

import java.util.Scanner;

public abstract class Method1 {
	Scanner scanner = new Scanner(System.in);
	int amount;
	char confirmation;
	
	int[] AccountNum= {15647862,65479214,86472245};
	int[] Balance= {100000,115000,80000};
	int[] Pin= {7594,2526,4587};
	
	int AccountNumber;
	int BankBalance;
	int PinNumber;
	boolean value=false;
	void Check() {
		for(int element:AccountNum) {
			if(element==AccountNumber) {
				
				System.out.print("Proceed");
				break;
			}
			//System.out.println("Try again");
		}
		
		
		
		
		for(int element:Pin) {
			if(element==PinNumber) {
				value=true;
				System.out.println("Proceed");
				break;
			}
			//System.out.println("Incorrect pin");
			}
			//System.out.println("Incorrect pin");
		
		
	}
	void Withdraw() {
		System.out.println("Enter the amount");
		amount = scanner.nextInt();
		System.out.println();
		System.out.println("Please confirm:y or n");
		confirmation = scanner.next().charAt(0);
		char convert = Character.toUpperCase(confirmation);

		if (convert == 'Y') {
			BankBalance = BankBalance - amount;
			System.out.println("New balance: " + BankBalance);
			System.out.println("---------------------------------------------");
		}
	}

	void Deposit() {
		System.out.println("Enter the amount");
		amount = scanner.nextInt();
		System.out.println("Please confirm:y or n");
		confirmation = scanner.next().charAt(0);
		char convert = Character.toUpperCase(confirmation);
		if (convert == 'Y') {
			BankBalance = BankBalance + amount;
			System.out.println("New balance: " + BankBalance);
			System.out.println("---------------------------------------------");
		}

	}

	void Balance() {
		System.out.println("Check Balance");
		System.out.println("Please confirm:y or n");
		confirmation = scanner.next().charAt(0);
		char convert = Character.toUpperCase(confirmation);
		if (convert == 'Y') {
			System.out.println("New balance: " + BankBalance);
			System.out.println("---------------------------------------------");
		}

	}

}

package Sba2;

import java.util.Scanner;

public abstract class BankingDetails {
	Scanner scanner = new Scanner(System.in);
	
	int AccountNumber, Balance, Pin, amount;
	char confirmation;

	// int AccountNumber;
	// int BankBalance;
	// int PinNumber;

	// int[] AccountNum= {15647862,65479214,86472245};
	// int[] Balance= {100000,115000,80000};
	// int[] Pin= {7594,2526,4587};

	abstract void Display();

	BankingDetails(int AccountNumber, int Balance, int Pin) {
		this.AccountNumber = AccountNumber;
		this.Balance = Balance;
		this.Pin = Pin;

	}

	void Withdraw() {
		System.out.println("Enter the amount");
		amount = scanner.nextInt();
		System.out.println();
		System.out.println("Please confirm:y or n");
		confirmation = scanner.next().charAt(0);
		char convert = Character.toUpperCase(confirmation);

		if (convert == 'Y') {
			Balance = Balance - amount;
			System.out.println("New balance: " + Balance);
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
			Balance = Balance + amount;
			System.out.println("New balance: " + Balance);
			System.out.println("---------------------------------------------");
		}

	}

	void Balance() {
		System.out.println("Check Balance");
		System.out.println("Please confirm:y or n");
		confirmation = scanner.next().charAt(0);
		char convert = Character.toUpperCase(confirmation);
		if (convert == 'Y') {
			System.out.println("New balance: " + Balance);
			System.out.println("---------------------------------------------");
		}

	}

}

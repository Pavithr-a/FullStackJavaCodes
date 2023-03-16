package Sba2Try;

import java.util.Scanner;

public abstract class Details {

Scanner scanner = new Scanner(System.in);
	
	int AccountNumber, Balance, Pin, amount;
	char confirmation;
	
	//int[] AccountNum= {15647862,65479214,86472245};
	//int[] BankBalance= {100000,115000,80000};
	//int[] PinNumber= {7594,2526,4587};
	
	public Details(int[] AccountNum,int[] BankBalance,int[] PinNumber) {
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
		this.Pin=Pin;
		}

	abstract void Display();
	void Withdraw() {
		System.out.println("Enter the amount");
		amount = scanner.nextInt();
		System.out.println();
		System.out.println("Please confirm:y or n");
		confirmation = scanner.next().charAt(0);
		char convert = Character.toUpperCase(confirmation);

		if (convert == 'Y') {
			Balance = Balance - amount;
			}
			System.out.println("New balance: " + Balance);
			System.out.println("---------------------------------------------");
	}

	void Deposit() {
		System.out.println("Enter the amount");
		amount = scanner.nextInt();
		System.out.println("Please confirm:y or n");
		confirmation = scanner.next().charAt(0);
		char convert = Character.toUpperCase(confirmation);
		if (convert == 'Y') {
			Balance = Balance + amount;
			}
			System.out.println("New balance: " + Balance);
			System.out.println("---------------------------------------------");
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

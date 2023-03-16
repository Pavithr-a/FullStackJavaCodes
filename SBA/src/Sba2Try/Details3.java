package Sba2Try;

public class Details3 extends Details2{
	void Display() {
		do {
			System.out.println();
			System.out.println("Welcome to Pavi's Bank");
			System.out.println();
			System.out.println("Enter account number(8 digits): " +this.AccountNumber);
			AccountNumber=scanner.nextInt();
			System.out.println("Enter pin(4 digit):" + this.Pin);
			System.out.println("---------------------------------------------");
			Pin=scanner.nextInt();
			Validate();
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

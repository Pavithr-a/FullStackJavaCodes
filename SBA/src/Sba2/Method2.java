package Sba2;

public class Method2 extends Method1{
	int choice;
	void Display() {
		do {
		System.out.println();
		System.out.println("Welcome to Pavi's Bank");
		System.out.println();
		System.out.println("Enter account number(8 digits): "+AccountNumber);
		AccountNumber=scanner.nextInt();
		System.out.println("Enter pin(4 digit):"+PinNumber);
		System.out.println("---------------------------------------------");
		PinNumber=scanner.nextInt();
		//System.out.println(Balance);
		System.out.println("Options");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.View Balance");
		System.out.println("4.Exit");
		System.out.println("---------------------------------------------");
		boolean value=true;
			choice=scanner.nextInt();
			switch(choice) {
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
				System.out.println("Thank you for the service");
				break;
			
			default:
				System.out.println("Invalid Choice!!!");
			}
		}
				
		while(choice!=4);
			}

}

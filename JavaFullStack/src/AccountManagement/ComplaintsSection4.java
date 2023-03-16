package AccountManagement;

import java.util.Scanner;

public class ComplaintsSection4 {
	Scanner sc=new Scanner(System.in);
	void SolveComplaints() {
	System.out.println("=========================================");
	System.out.println("|1.ATM withdrawal complaints            |");
	System.out.println("|2.Net/Mobile Banking Failure complaints|");
	System.out.println("|3.Credit card complaints               |");
	System.out.println("=========================================");
	int choose;
	System.out.println("Select from 1 to 3");
	choose=sc.nextInt();
	if(choose==1) {
		System.out.println("1.What are the cash withdrawal charges applicable if I use my Debit Card at ATM?");
		System.out.println("2.What is to be done if my debit card gets swallowed in an ATM?");
		int again=sc.nextInt();
		if(again==1) {
			System.out.println("Log on to www.dxcbank.com > Rates and Charges > Service Charges and Fees (at the bottom of the page) > Personal Banking.");
		}
		else if(again==2) {
			System.out.println("For security reasons, immediately block the Debit Card through any of the following channels.\r\n"
					+ "Internet Banking:\r\n"
					+ "Login to Internet Banking with your User ID and Password > My Accounts > Bank Accounts > Service Requests > ATM/Debit Card Related > Request for blocking of Debit / ATM Card.");
		}
		else {
			System.out.println("No solution in this option choose from above");
		}
	}
	else if(choose==2) {
		System.out.println("1.How to update my new mobile number in my account?");
		System.out.println("2.How do I register my number for internet banking alerts?");
		int again=sc.nextInt();
		if(again==1) {
			System.out.println("You can update mobile number for alerts through ATM with easy steps.\r\n"
					+ "\r\n"
					+ "Visit the nearest DXC Bank ATM > Select ‘More options’ > Register your mobile > Enter the mobile number. Your mobile number will be updated in 1 working day.\r\n"
					+ "\r\n"
					+ "Alternatively, you may also visit the nearest DXC Bank Branch, along with the valid original photo ID proof.  Once the request is placed, your mobile number will be updated in 2 working days.");
		}
		else if(again==2) {
			System.out.println("In case your mobile number is already registered in your account, yet you are not getting alerts for doing transactions through Internet Banking, please call our Customer Care from your registered mobile number to update the mobile number for Internet Banking alerts. ");
		}
		else {
			System.out.println("No solution in this option choose from above");
		}
	}
	else if(choose==3) {
		System.out.println("1.How do I lodge a complaint?");
		System.out.println("2.Credit card");
		int again=sc.nextInt();
		if(again==1) {
			System.out.println("You may call our Customer Care number to lodge a complaint or to report an unauthorized transaction. ");
		}
		if(again==2) {
			System.out.println("Apply credit and ungrade credit card or done in Bank.Please visit our nearest branch.");
		}
	}
	}

}

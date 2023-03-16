package Sba1;

import java.util.Scanner;

public class Sba1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days=1;
		int count=1;
		while(days<=7) {
			System.out.print("Enter day:");
			int weekday=sc.nextInt();
			if(weekday==1) {
				System.out.println("Monday, Day "+count+" we have session.");
				count++;
			}
			else if(weekday==2)
			{
				System.out.println("Tuesday, Day "+count+" we have session.");
				count++;
			}
			else if(weekday==3) {
				System.out.println("Wednesday, Day "+count+" we have session.");
				count++;
			}
			else if(weekday==4) {
				System.out.println("Thursday, today is a rupublic day holiday");
			}
			else if(weekday==5) {
				System.out.println("Friday, Day "+count+" we have session.");
				count++;
			}
			else if(weekday==6) {
				System.out.println("Saturday, Today we don't have a session.");
			}
			else {
				System.out.println("Sunday , Today we don't have a session.");
			}
			days++;
		}
		
		
	}

}

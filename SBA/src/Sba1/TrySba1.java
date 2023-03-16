package Sba1;

import java.util.Scanner;

public class TrySba1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days=1;
		int count=1;
		while(days<=7) {
			System.out.print("Enter day:");
			int weekday=sc.nextInt();
			System.out.println("enter weekday name:");
			String weekdayName=sc.next();
			if(weekday==1 && weekdayName.equals("Monday")) {
				System.out.println(weekdayName+", Day "+count+" we have session.");
				count++;
			}
			else if(weekday==2 && weekdayName.equals("Tuesday"))
			{
				System.out.println(weekdayName+", Day "+count+" we have session.");
				count++;
			}
			else if(weekday==3 && weekdayName.equals("Wednesday")) {
				System.out.println(weekdayName+", Day "+count+" we have session.");
				count++;
			}
			else if(weekday==4 && weekdayName.equals("Thursday")) {
				System.out.println(weekdayName+", today is a rupublic day holiday");
			}
			else if(weekday==5 && weekdayName.equals("Friday")) {
				System.out.println(weekdayName+", Day "+count+" we have session.");
				count++;
			}
			else if(weekday==6 && weekdayName.equals("Saturday")) {
				System.out.println(weekdayName+", Today we don't have a session.");
			}
			else {
				weekdayName.equals("Sunday");
				System.out.println(weekdayName +" , Today we don't have a session.");
			}
			days++;
		}
		
		
	}

}

package DayFour;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number:");
		int a=sc.nextInt();
		int sq1=a*a;
		float sq2=a*a;
		double sq3=a*a;
		char sq4=(char) (a*a);
		
		System.out.println("In integer sq1:"+sq1);
		System.out.println("In float sq2:"+sq2);
		System.out.println("In double sq3:"+sq3);
		System.out.println("In char sq4:"+sq4);
		
		
	}

}

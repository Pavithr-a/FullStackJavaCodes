package DayThree;

import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		System.out.println("Enter num3:");
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		System.out.println("The sum of "+num1+" + "+num2+" + "+num3+" is "+sum);
	}

}

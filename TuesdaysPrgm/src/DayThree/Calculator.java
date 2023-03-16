package DayThree;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int a=sc.nextInt();
		System.out.println("Enter num2:");
		int b=sc.nextInt();
		System.out.println("Sum: "+(a+b));
		System.out.println("Difference: "+(a-b));
		float division=a/b;
		float remainder=a%b;
		System.out.println("Product: "+division);
		System.out.println("Remainder: "+remainder);
	}

}

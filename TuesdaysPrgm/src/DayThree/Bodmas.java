package DayThree;

import java.util.Scanner;

public class Bodmas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a:");
		int a=sc.nextInt();
		System.out.println("b:");
		int b=sc.nextInt();
		System.out.println("c:");
		int c=sc.nextInt();
		System.out.println("d:");
		int d=sc.nextInt();
		int result=(2*a+3*b)-(d+c);
		System.out.println("Result: "+result);
		
	}

}

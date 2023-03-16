package DayThree;

import java.util.Scanner;

public class Biodata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter height:");
		double height=sc.nextDouble();
		System.out.println("Enter weight:");
		double weight=sc.nextDouble();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Marital status:");
		String maritalSt=sc.next();
		
		System.out.println("Name: "+name);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("Age: "+age);
		System.out.println("Marital Status: "+maritalSt);
		
	}

}

package DayThree;

import java.util.Scanner;

public class SumOf2Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //to get user input
		System.out.println("Enter num1:"); //printing a prompt for user input num1
		int num1=sc.nextInt();//declaring and initializing for num1 
		System.out.println("Enter num2:");//printing a prompt for user input num2
		int num2=sc.nextInt(); //declaring and initializing for num2
		System.out.println("Sum:"+(num1+num2)); //printing a prompt sum
		
	}

}

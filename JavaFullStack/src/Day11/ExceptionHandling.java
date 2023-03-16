package Day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter distance travelled: ");
		int distance=scanner.nextInt();
		System.out.println("Enter time travelled:");
		int time1=scanner.nextInt();
		System.out.println("Speed travelled is "+(distance/time1)+" mps");
		int[] Array= {2,3,5,7,20222};
		Array[23]=2034;
		}catch (ArithmeticException|InputMismatchException|ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exception caught "+exception);
		}//catch(InputMismatchException ime) {
		//	System.out.println("Please check your input :Exception is "+ime);
		//}
		
		int ctr=0;
		while(ctr<10) {
			System.out.println(ctr);
			ctr++;
		}
	}
}

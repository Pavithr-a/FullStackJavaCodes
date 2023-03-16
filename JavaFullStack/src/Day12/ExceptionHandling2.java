package Day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter distance travelled: ");
			int distance=scanner.nextInt();
			System.out.println("Enter time travelled:");
			int time1=scanner.nextInt();
			System.out.println("Speed travelled is "+(distance/time1)+" mps");
			throw new ArrayIndexOutOfBoundsException();
			//int[] Array= {2,3,5,7,20222};
			//Array[23]=2034;
			}catch (ArithmeticException|InputMismatchException|ArrayIndexOutOfBoundsException exception) {
				System.out.println("Exception caught "+exception);
			}
		int ctr=0;
		while(ctr<10) {
			System.out.println(ctr);
			ctr++;
		}
	}

}

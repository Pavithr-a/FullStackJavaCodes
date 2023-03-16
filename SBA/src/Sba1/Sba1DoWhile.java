package Sba1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sba1DoWhile {

	public static void main(String[] args) {
		int NoOfSessions=1;
		int NoOfDays=1;
		String day = null;
		Scanner scanner=new Scanner(System.in);
		try {
		do {
			System.out.println("Enter day:");
			day=scanner.nextLine().toUpperCase();
			if(day.matches("[0-9]+")==true) {
				throw new InputMismatchException();
			}
			else if(day.equals("MONDAY")) {
				System.out.println(day+" Today Day "+NoOfSessions+" you have session.");
				NoOfSessions++;
				System.out.println("--------------------------------------------------");
			}
			else if(day.equals("TUESDAY")) {
				System.out.println(day+" Today Day "+NoOfSessions+" you have session.");
				NoOfSessions++;
				System.out.println("--------------------------------------------------");
			}
			else if(day.equals("WEDNESDAY")) {
				System.out.println(day+" Today Day "+NoOfSessions+" you have session.");
				NoOfSessions++;
				System.out.println("--------------------------------------------------");
			}
			else if(day.equals("THURSDAY")) {
				System.out.println(day+" Today is a Republic day holiday.");
				System.out.println("--------------------------------------------------");
			}
			else if(day.equals("FRIDAY")) {
				System.out.println(day+" Today Day "+NoOfSessions+" you have session.");
				NoOfSessions++;
				System.out.println("--------------------------------------------------");
			}
			else if(day.equals("SATURDAY")||day.equals("SUNDAY")) {
				System.out.println(day+" You don't have session.");
			}
			else {
				System.out.println("Invalid input");
				System.out.println("--------------------------------------------------");
				throw new IllegalArgumentException();
			}
			
		NoOfDays++;
		}while(NoOfDays!=8);
		
		}catch (InputMismatchException |ArithmeticException|IllegalArgumentException e) {
			System.out.println("Exception caught "+e);
		}
		finally {
		System.out.println("Number of sessions : "+(--NoOfSessions));
		}
	}

}

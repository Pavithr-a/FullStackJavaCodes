package DayThree;

import java.util.Scanner;

public class CelToFah {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Celcius: ");
		double Celcius=sc.nextDouble();
		double Fahrenheit;
		Fahrenheit=(Celcius*9/5)+32;
		System.out.println("Fahrenheit is: "+Fahrenheit);
	}

}

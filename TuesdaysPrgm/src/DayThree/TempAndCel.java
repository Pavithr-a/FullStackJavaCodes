package DayThree;

import java.util.Scanner;

public class TempAndCel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fahrenheit: ");
		double Fahrenheit=sc.nextDouble();
		double Celsius;
		Celsius=(5*(Fahrenheit-32)/9);
		System.out.println("Celcius : "+Celsius);
	}

}

package DayFour;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius:");
		float r=sc.nextFloat();
		double peri;
		peri=(2*3.14*r);
		System.out.println("Perimeter of a circle:"+peri);
	}

}

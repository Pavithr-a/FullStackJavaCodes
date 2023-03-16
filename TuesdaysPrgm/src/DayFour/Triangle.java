package DayFour;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Side a:");
		int a = sc.nextInt();
		System.out.print("Side b:");
		int b = sc.nextInt();
		System.out.print("Side c:");
		int c = sc.nextInt();
		if (a == b && b == c && c == a) {
			System.out.println("Equilaternal triangle");
		}
		else if (a == b || b == c || c == a) {
			System.out.println("Isosceles triangle");
		}
		else{
			System.out.println("Scalene triangle");
		}
	}

}

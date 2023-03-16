package DayFour;

import java.util.Scanner;

public class PhotoFrame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length:");
		int length=sc.nextInt();
		System.out.print("Enter breadth:");
		int breadth=sc.nextInt();
		if(length==breadth) {
			System.out.println("It is a square photoframe");
		}else {
			System.out.println("It is a rectangle photoframe");
		}
	}

}

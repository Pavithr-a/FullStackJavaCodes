package DayFive;

import java.util.Scanner;

public class Midpoints {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();

		while(++start<--end); 
			System.out.println("Midpoint is: "+start);
	}

}

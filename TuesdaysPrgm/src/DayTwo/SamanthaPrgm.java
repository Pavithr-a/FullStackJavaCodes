package DayTwo;

import java.util.Scanner;

public class SamanthaPrgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int depositAmt=100000;
		float years=6.5f;
		int DoubleAmt=0;
		System.out.println("Start year:");
		int givenYr=sc.nextInt();
		DoubleAmt+=(depositAmt*2);
		System.out.println("Money after 6.5 years:"+DoubleAmt);
		DoubleAmt*=5;
		System.out.println("Money after 20 years:"+DoubleAmt);
		givenYr+=100;
		System.out.println("The year samantha decides to keep:"+(givenYr));
		
	}

}

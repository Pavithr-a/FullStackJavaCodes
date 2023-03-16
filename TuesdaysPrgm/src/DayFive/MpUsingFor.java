package DayFive;

import java.util.Scanner;

public class MpUsingFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(;++start<--end;) ;
			System.out.println("Midpoint is:"+start);
			}

}

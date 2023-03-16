package DayTwo;

import java.util.Scanner;

public class IntEx3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//single line comment
		/* Multi-line 
		 comment
		 given here
		 */
		float height;
		int year;
		System.out.print("Name: ");
		String name=scanner.nextLine();
		
		System.out.print("Enter height:");
		height=scanner.nextFloat();
		System.out.print("Enter year:");
		year=scanner.nextInt();
		System.out.println("Name :"+name);
		System.out.println("Year : Height");
		System.out.println("-----------------");
		
		System.out.println(year + " : " + height);
		
	}

}

package DayFive;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter multiple:");
		int multiple=scanner.nextInt();
		System.out.print("Enter LastNum:");
		int LastNum=scanner.nextInt();
		
		for(int number=1;number<=LastNum;number++) {
			System.out.println(multiple+" "+"*"+" "+number+" = "+(multiple*number));
		}
	}

}

package DayTwo;

import java.util.Scanner;

public class CricketStrategy {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sachin Tendular's Cricket History");
		System.out.print("Player Name: ");
		String name=scanner.nextLine();
		System.out.print("Country name:");
		String country=scanner.nextLine();
		System.out.print("Start year:");
		int StartYear=scanner.nextInt();
		System.out.print("End Year:");
		int EndYear=scanner.nextInt();
		System.out.print("Number of matches:");
		int Matches=scanner.nextInt();
		System.out.print("Innings:");
		int Innings=scanner.nextInt();
		System.out.print("NO:");
		int NO=scanner.nextInt();
		System.out.print("Total runs:");
		int runs=scanner.nextInt();
		System.out.print("HS:");
		int hs=scanner.nextInt();
		System.out.print("Average:");
		float avg=scanner.nextFloat();
		System.out.print("100's:");
		int hundreds=scanner.nextInt();
		System.out.print("50's:");
		int fiftys=scanner.nextInt();
		System.out.print("0's:");
		int zeros=scanner.nextInt();
		System.out.println("Player Name "+"\tCountry name"+"\tStart year "+"\tEnd year  "+"\tNumber of matches"+"\tInnings"+"\t\tNO"+"\tTotal runs"+"\tHS"+"\tAverage"+"\t\t100's"+"\t50's"+"\t0's");
		System.out.println(name+"\t"+country+"\t\t"+StartYear+"\t"+EndYear+"\t\t\t"+Matches+"\t\t"+Innings+"\t\t"+NO+"\t\t"+runs+"\t\t"+hs+"\t"+avg+"\t\t"+hundreds+"\t"+fiftys+"\t"+zeros);
		
	}

}

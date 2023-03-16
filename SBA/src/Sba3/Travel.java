package Sba3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Travel extends Booking{

	void Place() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("1.Erode Bus Stand");
		list.add("2.Palayapalayam");
		list.add("3.Erode Railway Station");
		list.add("4.P.S Park");
		list.add("5.Kollampalayam");
		list.add("6.Moolapalayam");
		list.add("7.Poondurai");
		list.add("8.Solar Bus Stand");
		list.add("9.Thindal");
		list.add("10.Perundurai");
		
		System.out.println("List of places:");
		System.out.println(list);
		System.out.println("--------------------------------");
		
		System.out.println("------------------------------");
		System.out.println("Choice a place from 1 to 10");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Destination: "+list.get(0));
			break;
		case 2:
			System.out.println("Destination: "+list.get(1));
			break;
		case 3:
			System.out.println("Destination: "+list.get(2));
			break;
		case 4:
			System.out.println("Destination: "+list.get(3));
			break;
		case 5:
			System.out.println("Destination: "+list.get(4));
			break;
		case 6:
			System.out.println("Destination: "+list.get(5));
			break;
		case 7:
			System.out.println("Destination: "+list.get(6));
			break;
		case 8:
			System.out.println("Destination: "+list.get(7));
			break;
		case 9:
			System.out.println("Destination: "+list.get(8));
			break;
		case 10:
			System.out.println("Destination: "+list.get(9));
			break;
			}
	}
	char ans;
	
	void StartTrip() {
		System.out.println("Ready to start your trip?(Yes or No)");
		String confirm=sc.next().toLowerCase();
		if(confirm.equals("yes")) {
			System.out.println("Your journey has started from current location");
		}
		if(confirm.equals("no")) {
			System.out.println("Would you like to change the location?");
			ans=sc.nextLine().toLowerCase().charAt(0);
			
			if(ans=='y') {
				System.out.println("Extra charges will be charged.......");
				System.out.println("Pick a location: ");
				Place();
			}
			else {
				System.out.println("On the way to your destination");
			}
		}
		
	}
}

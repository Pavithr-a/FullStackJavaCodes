package Sba3;


public class Booking extends UserAccount{
	String locate;
	void JourneyMessage() {
		System.out.println("--------------------------------");
		System.out.println(ANSI_PURPLE2+ANSI_WHITE+"         Welcome to Erode           "+ANSI_RESET);
		System.out.println("--------------------------------");
	}
	void Location() {
		System.out.println("Please turn on your current location:(ok or no)");
		locate=sc.nextLine().toLowerCase();
		if(locate.equals("ok")) {
			System.out.println("Your current location has pinned....");
			System.out.println("-----------------------------------------");
			System.out.println(ANSI_CYAN+"Would like to pick the place of your destination?"+ANSI_RESET);
		}
		else {
			System.out.println("Please turn the location to pin your Current Location");
			Location();
		}
	}
	
	

}

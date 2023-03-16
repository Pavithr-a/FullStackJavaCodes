package Day15;

import java.util.LinkedList;

public class MailingList {

	public static void main(String[] args) {
		LinkedList<Address> mail=new LinkedList<Address>();
		mail.add(new Address("Pavi", "39/1", "nehru street", "Erode", "TamilNadu", "638002"));
		mail.add(new Address("Keerthu", "55", "RiceMill Nagar", "Erode", "TamilNadu", "638003"));
		mail.add(new Address("Uma", "10", "Nethaji nagar", "Moolanur", "Tamilnadu", "652841"));
		mail.add(new Address("Jethvik", "26", "North mada street", "Chennai", "Tamilnadu", "600001"));
		mail.add(new Address("Dhruv", "18", "Indira nagar", "Bangalore", "Karnataka", "625545"));
		mail.add(new Address("Paxton", "9", "Adams street", "London", "London", "456564"));
		mail.add(new Address("Senthil", "6", "Sanjay nagar", "Erode", "TamilNadu", "638011"));
		
		for(Address address:mail) {
			System.out.println(address+"\n");
		}
	}
}

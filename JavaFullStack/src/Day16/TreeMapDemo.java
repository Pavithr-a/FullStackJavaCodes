package Day16;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Double> tree=new TreeMap<String,Double>();
		tree.put("Mary", 542.87);
		tree.put("Tanya", 123.50);
		tree.put("Swetha", 32542.8);
		tree.put("Rahul", 3257.4);
	
		Set<Map.Entry<String, Double>> set=tree.entrySet();
		for(Map.Entry<String, Double> mapentry:set) {
			System.out.print(mapentry.getKey()+" : ");
			System.out.println(mapentry.getValue());
		}
		double balance=tree.get("Tanya");
		tree.put("Tanya", balance+100000);
		
		System.out.println("Tanya's new balance is : "+tree.get("Tanya"));

	}

}

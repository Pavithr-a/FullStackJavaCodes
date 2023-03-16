package Day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> hashMap=new HashMap<String,String>();
		hashMap.put("Bala","9562458752");
		hashMap.put("Micheal", "8541256547");
		hashMap.put("Sammy", "5465789621");
		hashMap.put("Rosy", null);
		hashMap.put("Sunny","8787878787");
		
		Set<Map.Entry<String, String>> set= hashMap.entrySet();
		for(Map.Entry<String, String> mapentry:set) {
			System.out.print(mapentry.getKey()+" : ");
			System.out.println(mapentry.getValue());
		}
	}

}

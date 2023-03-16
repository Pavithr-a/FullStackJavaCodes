package Day16;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareReverse implements Comparator<String>{

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>(new CompareReverse());
		tree.add("Calcutta");
		tree.add("Mumbai");
		tree.add("Delhi");
		tree.add("Hyderabad");
		tree.add("Pune");
		
		for(String element:tree) {
			System.out.println(element+" ");
		}
	}

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}

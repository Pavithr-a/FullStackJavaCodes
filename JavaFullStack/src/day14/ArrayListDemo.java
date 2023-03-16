package day14;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		System.out.println("Size of the array list: "+arrayList.size());
		arrayList.add("Pavi");
		arrayList.add("Meri");
		arrayList.add("Keerthu");
		arrayList.add("Vibha");
		System.out.println("Elements of array are "+arrayList);
		System.out.println("Size of the array list: "+arrayList.size());
		arrayList.add(2, "Rosa");
		System.out.println("Elements of array are "+arrayList);
		System.out.println("Size of the array list: "+arrayList.size());
		arrayList.remove(3);
		System.out.println("Elements of array are "+arrayList);
		System.out.println("Size of the array list: "+arrayList.size());
		arrayList.remove("Vibha");
		System.out.println("Elements of array are "+arrayList);
		System.out.println("Size of the array list: "+arrayList.size());
		System.out.println(arrayList.get(1));
			

	}

}

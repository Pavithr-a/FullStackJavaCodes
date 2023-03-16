package day14;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Mango");
		linkedList.add("Orange");
		linkedList.add("Apple");
		linkedList.add("Grapes");
		linkedList.add("Pear");
		System.out.println("Linked list elements :"+linkedList);
		linkedList.add("Strawberry");
		linkedList.add("Melon");
		linkedList.add("Blueberry");
		System.out.println("Linked list elements :"+linkedList);
		linkedList.removeFirst();
		System.out.println("Linked list elements :"+linkedList);
		linkedList.removeLast();
		System.out.println("Linked list elements :"+linkedList);
		String fruit=linkedList.get(4);
		System.out.println(fruit);
		System.out.println(linkedList.set(4, fruit+" is good for health"));
		System.out.println("Linked list elements :"+linkedList);
		System.out.println(linkedList.get(1));
	}

}

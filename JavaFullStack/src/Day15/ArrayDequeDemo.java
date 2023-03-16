package Day15;

import java.util.ArrayDeque;

public class ArrayDequeDemo{
	public static void main(String[] args) {
		ArrayDeque<String> arrayDeque=new ArrayDeque<String>();
		arrayDeque.push("Jasmine");
		arrayDeque.push("Rose");
		arrayDeque.push("Lily");
		arrayDeque.push("Tulip");
		System.out.println("Array deque: "+arrayDeque);
		while(arrayDeque.peek()!=null) {
			System.out.println("Pop :"+arrayDeque.pop()+" ");
		}
		
		System.out.println(arrayDeque);
	}

}

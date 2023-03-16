package Day16;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>(3,3);
		System.out.println("Initial size:"+vector.size());
		System.out.println("Initial capacity:"+vector.capacity());
		vector.addElement(22);
		vector.addElement(99);
		vector.add(77);
		System.out.println("After 3 additions size is: "+vector.size());
		System.out.println("After 3 additions capacity is: "+vector.capacity());
		vector.addElement(100);
		System.out.println("After 4 additions size is: "+vector.size());
		System.out.println("After 4 additions capacity is: "+vector.capacity());
		
		System.out.println("First element: "+vector.firstElement());
		System.out.println("Last element: "+vector.lastElement());
		
		Enumeration venum=vector.elements();
		System.out.println("Vector elements are: ");
		while(venum.hasMoreElements()) {
			System.out.println(venum.nextElement()+" ");
		}
	
		

	}

}

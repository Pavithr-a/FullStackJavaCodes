package day13;

public class ChaAtDemo {

	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("Hello");
		System.out.println("Initial stringBuffer is "+stringBuffer);
		System.out.println("Initial charAt is "+stringBuffer.charAt(1));
		
		stringBuffer.setCharAt(1,'i');
		System.out.println("After change StringBuffer value "+stringBuffer);
		System.out.println("After change charAt is "+stringBuffer.charAt(1));
		
		stringBuffer.setLength(4);
		System.out.println("After setLength buffer is "+stringBuffer);
		System.out.println("After setLength charAt is "+stringBuffer.charAt(1));
	}
}

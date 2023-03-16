package day13;

public class AppendDemo {

	public static void main(String[] args) {
		String string1;
		int num1=10;
		
		StringBuffer stringBuffer=new StringBuffer("Original value");
		System.out.println(stringBuffer);
		string1=stringBuffer.append(" num1= ").append(num1).append(" !!! ").toString();
		System.out.println(string1);
		stringBuffer.append(" Value changes ");
		System.out.println(stringBuffer);

		StringBuffer stringBuffer2=new StringBuffer("I java !!!");
		stringBuffer2.insert(2, " Love ");
		System.out.println(stringBuffer2);
		stringBuffer2.insert(2, string1);
		System.out.println(stringBuffer2);
		System.out.println(stringBuffer2.reverse());
		System.out.println("------------------------------\nDelete");
		StringBuffer stringBuffer3=new StringBuffer("Hello all! My name is Pavithra");
		System.out.println(stringBuffer3.delete(5, 22));
		System.out.println("-----------------------------\nDelete charAt");
		StringBuffer stringBuffer4=new StringBuffer("Hello all! My name is Pavithra");
		System.out.println(stringBuffer4.deleteCharAt(22));
		System.out.println("-------------------------------\nReplace");
		System.out.println(stringBuffer3);
		System.out.println(stringBuffer3.replace(6, 15, "Tanjiro"));
		
		System.out.println("---------------------\nSubstring");
		System.out.println(stringBuffer4);
		System.out.println(stringBuffer4.substring(6,10));

	}

}

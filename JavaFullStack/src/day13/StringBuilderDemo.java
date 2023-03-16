package day13;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder strBuilder=new StringBuilder("Code");
		System.out.println("Initial value "+strBuilder);
		
		char[] charSequence=new char[]{'w','i','t','h',' ','P','a','v','i','1','5'};
		strBuilder.append(charSequence,0,11);
		System.out.println(strBuilder);
		
	}

}

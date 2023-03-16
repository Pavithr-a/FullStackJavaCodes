package Day9;

public class StaticDemo {

	static int num1=10;
	static int num2=20;
	static void displayValues(int num3) {//static method
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
	}
	static {//static block
		System.out.println("Static block initialised");
		System.out.println(num1*num2);
	}
}

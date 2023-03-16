package Day12;

public class ThrowsDemo {
	public static int num1,num2;
	public static double div;
	public int num3;
	public ThrowsDemo(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	static void division() throws ArithmeticException{
		div=num1/num2;
		System.out.println(div);
	}
	static void arrayFn() {
		throw new ArrayIndexOutOfBoundsException();
	}
}

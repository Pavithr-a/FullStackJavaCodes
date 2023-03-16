package Day12;

public class ThrowsDemoMain {

	public static void main(String[] args) {
		ThrowsDemo td=new ThrowsDemo(20, 0);
		try {
			ThrowsDemo.division();
		}catch (ArithmeticException ae) {
			System.out.println("Exception caught");
		}finally {
			System.out.println("Finally block ae");
		}
		
		try {
			ThrowsDemo.arrayFn();
		}catch (ArithmeticException oob) {
			System.out.println("OOB caught");
		}finally {
			System.out.println("Finally block oob");
		}
	}

}

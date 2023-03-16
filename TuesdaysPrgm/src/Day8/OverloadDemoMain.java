package Day8;

public class OverloadDemoMain {

	public static void main(String[] args) {
		double result;
		OverloadDemo overload=new OverloadDemo();
		overload.test();
		overload.test(5);
		overload.test(45, 30);
		result=overload.test(4.56);
		
		System.out.println("Return method is "+result);
	}

}

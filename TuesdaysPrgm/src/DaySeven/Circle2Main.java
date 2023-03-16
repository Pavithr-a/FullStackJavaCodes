package DaySeven;

public class Circle2Main {

	public static void main(String[] args) {
		Circle2 c1=new Circle2(3.56);
		Circle2 c2=new Circle2(12.22);
		Circle2 c3=new Circle2(23.456);
		
		c1.Result();
		c2.Result();
		c3.Result();
		
		System.out.println();
		System.out.println("Circle 1");
		System.out.println("Return function of area is "+c1.CircleArea());
		System.out.println("Return function of circumference is "+c1.CircleCircum());
		System.out.println("------------------------------------------------------");
		System.out.println("Circle 2");
		System.out.println("Return function of area is "+c2.CircleArea());
		System.out.println("Return function of circumference is "+c2.CircleCircum());
		System.out.println("-----------------------------------------------------");
		System.out.println("Circle 3");
		System.out.println("Return function of area is "+c3.CircleArea());
		System.out.println("Return function of circumference is "+c3.CircleCircum());
		
		
	}

}

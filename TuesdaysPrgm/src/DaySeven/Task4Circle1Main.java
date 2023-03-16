package DaySeven;

public class Task4Circle1Main {

	public static void main(String[] args) {
		Task4Circle1 c1=new Task4Circle1();
		Task4Circle1 c2=new Task4Circle1();
		Task4Circle1 c3=new Task4Circle1();
		
		
		c1.CircleInit(3.56);
		c2.CircleInit(12.22);
		c3.CircleInit(23.456);
		
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

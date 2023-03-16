package DaySeven;

public class Circle2 {
	double radius;
	double area;
	double circumference;
	
	Circle2(double rad1) {
		radius=rad1;	
	}
	
	double CircleArea() {
		area=(double) (2*3.14*radius*radius);
		return area;
	}
	double CircleCircum() {
		circumference=(double) (2*3.14*radius);
		return circumference;
	}
		
	void Result() {
		area=(double) (2*3.14*radius*radius);
		circumference=(double) (2*3.14*radius);
		System.out.println("Void function of area is "+area);
		System.out.println("Void function of circumference is "+circumference);
	}

}

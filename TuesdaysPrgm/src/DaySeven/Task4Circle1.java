package DaySeven;

public class Task4Circle1 {
	double radius;
	double area;
	double circumference;
	
	
	void CircleInit(double d) {
		radius=d;
	}
	
	double CircleArea() {
		area=(double) (2*3.14*radius*radius);
		return area;
	}
	double CircleCircum() {
		circumference=(double) (2*3.14*radius);
		return circumference;
	}

}

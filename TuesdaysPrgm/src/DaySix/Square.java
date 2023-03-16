package DaySix;

public class Square {
	float side;
	float area;
	float perimeter;
	
	void squareArea() {
		area=side*side;
		System.out.println("Area of a square is :"+area);
	}
	void squarePerimeter() {
		perimeter=4*side;
		System.out.println("Perimeter of a square is :"+perimeter);
	}
}

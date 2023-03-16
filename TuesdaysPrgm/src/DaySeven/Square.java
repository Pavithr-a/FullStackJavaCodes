package DaySeven;

public class Square {

	float side,area,perimeter;
	
	//Square() { //default constructor
		//side=10;
	//}
	/*
	void sideInit(float side1) {
		side=side1;
	}*/
	Square(float side) { //parameterized constructor
		this.side=side;
	}
	
	void squareArea() { 
		area=side*side;
		System.out.println("Area : "+area );
	}
	float squarePerimeter() {
		perimeter=4*side;
		return perimeter;
	}
}

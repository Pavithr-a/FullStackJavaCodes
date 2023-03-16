package Day8;

public class SquareSuper { //Parent cls

	float side,area,perimeter;
	//void sideInit(float side1) {
	//	side=side1;
	//}
	SquareSuper(float side) {
		this.side=side;
	}
	
	void squareArea() { 
		area=side*side;
		System.out.println("Area : "+area );
	}
	
}

package Day8;

public class Square extends SquareSuper{
	
	Square(){
		super(30);
	}

	float squarePerimeter() {
		perimeter=4*side;
		return perimeter;
	}
}

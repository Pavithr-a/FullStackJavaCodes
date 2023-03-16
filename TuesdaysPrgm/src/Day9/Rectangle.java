package Day9;

public class Rectangle extends GeometricFigure{
	
	Rectangle(double dim1,double dim2) {
		super(dim1,dim2);
	}

	@Override
	double area() {
		return dim1*dim2;
	}

	
}

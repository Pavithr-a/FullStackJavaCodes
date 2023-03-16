package Day9;

public abstract class GeometricFigure {

	double dim1,dim2;
	
	GeometricFigure(double dim1,double dim2) {
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	abstract double area();
	
	void Display() {
		System.out.println("Hello.....");
	}
}

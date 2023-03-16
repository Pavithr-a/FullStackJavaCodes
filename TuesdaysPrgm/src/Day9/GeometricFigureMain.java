package Day9;

public class GeometricFigureMain {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(12.2, 13.5);
		System.out.println(rectangle.area());
		rectangle.Display();
		
		GeometricFigure geof;
		geof=rectangle;
		System.out.println(geof.area());
	}

}

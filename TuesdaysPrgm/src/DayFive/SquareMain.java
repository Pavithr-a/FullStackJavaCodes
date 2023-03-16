package DayFive;

public class SquareMain {

	public static void main(String[] args) {
		Square sqr=new Square();
		Square sqr2=new Square();
		Square sqr3=new Square();
		sqr.side=20;
		sqr2.side=25;
		sqr3.side=50;
		sqr.area=sqr.side*sqr.side;
		sqr2.area=sqr2.side*sqr2.side;
		sqr3.area=sqr3.side*sqr3.side;
		sqr.perimeter=4*sqr.side;
		sqr2.perimeter=4*sqr2.side;
		sqr3.perimeter=4*sqr3.side;
		System.out.println("Sides of a square1 is: "+sqr.side);
		System.out.println("Sides of a square2 is: "+sqr2.side);
		System.out.println("Sides of a square3 is: "+sqr3.side);
		System.out.println("Area of a square1: "+sqr.area);
		System.out.println("Area of a square2: "+sqr2.area);
		System.out.println("Area of a square3: "+sqr3.area);
		System.out.println("Perimeter of a square1: "+sqr.perimeter);
		System.out.println("Perimeter of a square2: "+sqr2.perimeter);
		System.out.println("Perimeter of a square3: "+sqr3.perimeter);
	}

}

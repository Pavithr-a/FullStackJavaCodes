package DaySeven;


public class SquareMain {

	public static void main(String[] args) {
		Square sqr=new Square(10);
		Square sqr2=new Square(15);
		Square sqr3=new Square(20);
		//sqr.side=10;
		//sqr2.side=15;
		//sqr3.side=20;
		
		//sqr.sideInit(10);
		//sqr2.sideInit(15);
		//sqr3.sideInit(20);
		
		sqr.squareArea();
		sqr2.squareArea();
		sqr3.squareArea();
		
		System.out.println("Perimeter square 1: "+sqr.squarePerimeter() );
		System.out.println("Perimeter square 2: "+sqr2.squarePerimeter() );
		System.out.println("Perimeter square 3: "+sqr3.squarePerimeter() );
		
	}

}

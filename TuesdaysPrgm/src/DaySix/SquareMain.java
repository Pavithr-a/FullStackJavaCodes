package DaySix;

public class SquareMain {

	public static void main(String[] args) {
		Square sqr=new Square();
		Square sqr2=new Square();
		Square sqr3=new Square();
		sqr.side=10; //obj.var
		sqr2.side=15;
		sqr3.side=20;
		sqr.squareArea(); //obj.function
		sqr.squarePerimeter();
		
		System.out.println("----------------------------");
		
		sqr2.squareArea();
		sqr2.squarePerimeter();
		
		System.out.println("-----------------------------");
		
		sqr3.squareArea();
		sqr3.squarePerimeter();
	}

}

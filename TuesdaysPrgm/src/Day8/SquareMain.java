package Day8;

public class SquareMain {

	public static void main(String[] args) {
		Square sqr=new Square();
		//sqr.sideInit(6);
		sqr.squareArea();
		System.out.println(sqr.squarePerimeter());
		
		SquareSuper sqrsuper =new SquareSuper(20);
		//sqrsuper.sideInit(5);
		sqrsuper.squareArea();
		
		Square2 sqr2=new Square2();
		//sqr2.sideInit(8);
		sqr2.squareArea();
		sqr2.squarePerimeter();
		sqr2.Square2fn();
	}

}

package DaySix;

public class EquationMain {

	public static void main(String[] args) {
		Equation eql=new Equation();
		
		eql.y=2;
		eql.z=3;
		eql.m=5;
		
		eql.SolveEquation(); //method call
		Equation eql2=new Equation();
		eql2.y=5;
		eql2.z=10;
		eql2.m=15;
		eql2.SolveEquation();
		
		Equation eql3=new Equation();
		eql3.y=6;
		eql3.z=3;
		eql3.m=2;
		eql3.SolveEquation();
	}

}

package DaySeven;

public class EquationMain {

	public static void main(String[] args) {
		Equation eqn=new Equation();
		
		eqn.EqInit(5, 6, 7);
		
		System.out.println("Equation result is :"+eqn.ResultEqn());
	}

}

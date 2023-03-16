package DaySeven;

public class Equation2 {
	int a,b,c;
	int res;
	
	Equation2(int a2,int b2,int c2) {
		a=a2;
		b=b2;
		c=c2;
	}

	int ResultEqn() {
		res=(3*a)+(5*b)-(c);
		return res;
	}
	
	void Result() {
		res=(3*a)+(5*b)-(c);
		System.out.println("REsult of function is "+res);
	}
}

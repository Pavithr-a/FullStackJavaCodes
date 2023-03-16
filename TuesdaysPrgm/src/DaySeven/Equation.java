package DaySeven;

public class Equation {
	int a,b,c;
	int res;
	
	

	void EqInit(int a1,int b1,int c1) {
		a=a1;
		b=b1;
		c=c1;
	}
	
	int ResultEqn() {
		res=(3*a)+(5*b)-(c);
		return res;
		
		
	}

}

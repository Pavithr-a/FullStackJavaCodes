package DaySeven;

public class Task21C {
	int a,b,c,d;
	int res;
	
	Task21C(int a2,int b2,int c2,int d2) {
		a=a2;
		b=b2;
		c=c2;
		d=d2;
	}
	int Task2Res() {
		res=((3*a)+(9*b))+((4*c)+(2*d));
		return res;
	}
	
	void Result() {
		res=((3*a)+(9*b))+((4*c)+(2*d));
		System.out.println("Void function Result is "+res);
	}

}

package DaySeven;

public class Task2Func {
	int a,b,c,d;
	int res;
	
	void Task2Init(int a1,int b1,int c1,int d1) {
		a=a1;
		b=b1;
		c=c1;
		d=d1;
	}
	
	int Task2Res() {
		res=((3*a)+(9*b))+((4*c)+(2*d));
		return res;
	}

}

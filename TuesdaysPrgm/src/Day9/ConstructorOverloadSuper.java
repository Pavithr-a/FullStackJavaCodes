package Day9;

public class ConstructorOverloadSuper {
	int num1,num2; //instance var
	
	ConstructorOverloadSuper(){
		num1=10;
		num2=20;
	}
	ConstructorOverloadSuper(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	void calculate() {
		System.out.println("Sum is "+(num1+num2));
	}
	void calculate(String str) {
		System.out.println(str + (num1*num2));
	}

}

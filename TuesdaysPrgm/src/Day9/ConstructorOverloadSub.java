package Day9;

public class ConstructorOverloadSub extends ConstructorOverloadSuper {

	int num3;
	//ConstructorOverloadSub() {
	//	super();
	//}
	
	ConstructorOverloadSub(int num3){
		super();
		this.num3=num3;
	}
	
	ConstructorOverloadSub(int num1,int num2,int num3) {
		super(num1,num2);
		this.num3=num3;
	}
	
	void calculate() {
		System.out.println("Sub method: "+(num1*num2*num3));
	}
	//ConstructorOverloadSub(int n1,int n2){
	//	super(n1,n2);
	//}
}

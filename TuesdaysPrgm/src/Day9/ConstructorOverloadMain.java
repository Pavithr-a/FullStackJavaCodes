package Day9;

public class ConstructorOverloadMain {

	public static void main(String[] args) {
		ConstructorOverloadSub sub=new ConstructorOverloadSub(30);
		ConstructorOverloadSub sub2=new ConstructorOverloadSub(5,10,15);
		
		sub.calculate();  //sub-class
		sub.calculate("Super string arg :"); //parent cls
		
		sub2.calculate(); //sub-cls
		sub2.calculate("Super: string arg :"); //parent cls
	}

}

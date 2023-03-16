package Day8;

public class OverloadA {

	
		int num1,num2;
		
		OverloadA(int num1,int num2){
			this.num1=num1;
			this.num2=num2;
		}
		
		void sum() {
			System.out.println(num1+num2);
		}
		
		void sum(String str) {
			System.out.println(str);
		}
	

	

}

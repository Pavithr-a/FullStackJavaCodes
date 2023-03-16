package Sba2Try;

public class Details2 extends Details{

	public Details2() {
		super();
	}
	
int choice;
	
	void Validate() {
		if((this.AccountNumber==AccountNum[0]&&this.Pin==4572)||(this.AccountNumber==AccountNum[1]&&this.Pin==2121)||(this.AccountNumber==AccountNum[3]&&this.Pin==8564)) {
			System.out.println("Correct Account Number and Pin");
		}
		else {
			System.out.println("Try again!!");
		}
	}
	
}

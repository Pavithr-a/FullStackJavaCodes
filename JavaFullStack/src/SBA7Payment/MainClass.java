package SBA7Payment;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails1 user=new UserDetails1();
		DeleteClass del=new DeleteClass();
		InsertClass ins=new InsertClass();
		
	try {
		user.Signup();
		del.Cart();
		del.DiscountForItems();
		del.InsertInfo();
		
		del.paymentMode();
		del.Delquery();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	

	}


}

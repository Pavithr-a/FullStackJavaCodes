package SBA7Payment;

import java.util.Scanner;

public class Discount6 extends Items2{

	Scanner sc=new Scanner(System.in);
	void DiscountForItems() {
		System.out.println("Apply this CODE:MYNTRA2023 to get offers on your purchase");
		String Coupon="MYNTRA2023";
		String userCoupon;
		userCoupon=sc.nextLine();
		if(Coupon.equals(userCoupon)) {
			System.out.println("Thank you for applying you got a discount of 10%");
			total=total-250;
		}
		
	}
}

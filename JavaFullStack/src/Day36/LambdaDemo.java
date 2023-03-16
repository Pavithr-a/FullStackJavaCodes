package Day36;

import java.util.ArrayList;

public class LambdaDemo {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(2020);
		nums.add(2021);
		nums.add(2022);
		nums.add(2023);
		
		
		nums.forEach(
				(mynum) ->{System.out.println(mynum);
				});
	}

}

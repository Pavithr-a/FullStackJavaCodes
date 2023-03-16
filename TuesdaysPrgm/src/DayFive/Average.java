package DayFive;

public class Average {

	public static void main(String[] args) {
		double nums[]= {10.5,12.2,11.1,9.5,14.8};
		double result=0;
		
		for(int i=0;i<5;i++) {
			result +=nums[i];
		}
		System.out.println("Average is : "+(result/5));
	}

}

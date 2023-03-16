package DayFive;

public class RangeNum {

	public static void main(String[] args) {
		int start=300;
		int end=600;
		while(start<=end) {
			if(start%2==0) {
				System.out.println(start);
			}
			start++;
		}
	}

}

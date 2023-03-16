package Day8;

public class SumOfNumbersMain {

	public static void main(String[] args) {
		SumOfNumbers num=new SumOfNumbers();
		num.Sum(20, 30);
		
		System.out.println(num.Sum(5, 40, 65));
		num.Sum(5, 8, 6, 9);
		
	}
}

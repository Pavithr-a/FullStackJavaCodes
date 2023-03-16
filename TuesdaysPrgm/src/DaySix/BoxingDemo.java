package DaySix;

public class BoxingDemo {

	public static void main(String[] args) {
		int num1=200;
		//Integer iob=new Integer(100);
		Integer iob=Integer.valueOf(num1);  //boxing
		int i=iob.intValue();//unboxing
		Integer iOb=1000;//auto-box
		System.out.println("i: "+i);
		System.out.println("iob: "+iob);
	}

}

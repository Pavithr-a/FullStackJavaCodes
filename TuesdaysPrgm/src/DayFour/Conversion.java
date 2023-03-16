package DayFour;

public class Conversion {

	public static void main(String[] args) {
		byte b;
		int i=257;
		double d=323.142;
		System.out.println("Int to Byte:");
		b=(byte)i;
		System.out.println("i and b "+i+" "+b);
		System.out.println("Double to Int");
		i=(int)d;
		System.out.println("d and i "+d+" "+i);
		System.out.println("Double to byte");
		b=(byte) d;
		System.out.println("d and b "+d+" "+b);
		int a=200;
		byte z=100;
		z=(byte) a;
		System.out.println("a and z "+a+" "+z);
	}

}

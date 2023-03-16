package Day12;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=42/a;
			System.out.println("a= "+a);
			try {
				if(a==1) {
					a=a/(a-a);
				}
				if(a==2) {
					int c[]= {1};
					c[42]=99;
				}
			}//inner try
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out-of-bounds :"+e);
			}
		}//outer try
		catch(ArithmeticException e) {
			System.out.println("Divide by 0: "+e);
		}
			
		}
}

package DayThree;

import java.util.Scanner;

public class BakeryShop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double BlackCur=175;
		double WhiteFor=130;
		double Choco=127.50;
		double RedVel=241.40;
		System.out.println("Black Currant Cake: ");
		int BlackCurCQ=sc.nextInt();
		System.out.println("White Forest Cake: ");
		int WhiteForCQ=sc.nextInt();
		System.out.println("Chocolate: ");
		int chocolateQ=sc.nextInt();
		System.out.println("Red Velvet: ");
		int RedVQ=sc.nextInt();
		double a=(BlackCur*BlackCurCQ);
		double b=(WhiteFor*WhiteForCQ);
		double c=(Choco*chocolateQ);
		double d=(RedVel*RedVQ);
		System.out.println("=================================================================");
		System.out.println("Menu Item"+"		"+"Price	"+"	Qty	"+"	payable		");
		System.out.println("=================================================================");
		System.out.println("Black Currant Cake"+"	"+BlackCur+"		"+BlackCurCQ+"		"+a);
		System.out.println("White Forest Cake"+"	"+WhiteFor+"		"+WhiteForCQ+"		"+b);
		System.out.println("Chocolate"+"		"+Choco+"		"+chocolateQ+"		"+c);
		System.out.println("Red Velvet"+"		"+RedVel+"		"+RedVQ+"		"+d);
		System.out.println("=================================================================");
		System.out.println("Total"+"	"+"		"+"		"+"		"+(a+b+c+d));
		System.out.println("=================================================================");
	}

}

package DaySix;

import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		
		Box box1=new Box();
		Scanner sc=new Scanner(System.in);
		System.out.print("Box1 height:");
		box1.height=sc.nextFloat();
		System.out.print("Box1 width:");
		box1.width=sc.nextFloat();
		System.out.print("Box1 depth:");
		box1.depth=sc.nextFloat();
		box1.volume=box1.height*box1.width*box1.depth;
		System.out.println("Volume of box1 with width: "+box1.width+" Height: "+box1.height+" Depth: "+box1.depth+" is "+box1.volume);
		System.out.println("------------------------------");
		Box box2=new Box();
		System.out.print("Box2 height:");
		box2.height=sc.nextFloat();
		System.out.print("Box2 width:");
		box2.width=sc.nextFloat();
		System.out.print("Box3 depth:");
		box2.depth=sc.nextFloat();
		box2.volume=box2.height*box2.width*box2.depth;
		System.out.println("Volume of box2 with width: "+box2.width+" Height: "+box2.height+" Depth: "+box2.depth+" is "+box2.volume);
		System.out.println("------------------------------");
		Box box3=new Box();
		System.out.print("Box3 height:");
		box3.height=sc.nextFloat();
		System.out.print("Box3 width:");
		box3.width=sc.nextFloat();
		System.out.print("Box3 depth:");
		box3.depth=sc.nextFloat();
		box3.volume=box3.height*box3.width*box3.depth;
		System.out.println("Volume of box3 with width: "+box3.width+" Height: "+box3.height+" Depth: "+box3.depth+" is "+box3.volume);
		System.out.println("------------------------------");
		
	}

}

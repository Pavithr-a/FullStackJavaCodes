package DaySeven;

import java.util.Scanner;

public class ForEachReportCard {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter Student name:");
		String name=scanner.next();
		System.out.print("Enter Roll No.:");
		String rollNum=scanner.next();
		System.out.print("Enter class:");
		int cls=scanner.nextInt();
		int subject[]=new int[6];
		String subject_name[]= {"English ","Maths ","Science ","Social ","Tamil ","Computer Science "};
		System.out.println("Subject marks are:");
	
		
		for(int i=0;i<6;i++) {
			System.out.print(subject_name[i]);
			subject[i]=scanner.nextInt();
		}
		int total = 0;
		for(int i:subject) {
			total=total+i;
		}
		System.out.println("Total: "+total);
		
		int average=total/6;
		System.out.println("Average : "+average);
		
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("                 DXC SCHOOL - REPORT CARD                       ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Name : "+name+"  		   "+" Class : "+cls+"		  		  ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| English			"+"  |  "+ +subject[0]+"				  " );
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Maths				"+"  |  "+ +subject[1]+"				  " );
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Science			"+"  |  "+ +subject[2]+"				  " );
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Social			"+"  |  "+ +subject[3]+"				  " );
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Tamil				"+"  |  "+ +subject[4]+"				  " );
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Computer Science		"+"  |  "+ +subject[5]+"				  ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Total				"+"  |  "+ +total+"			  " );
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Average			"+"  |  "+ +average+"				  " );
		System.out.println("--------------------------------------------------------------------");
		if(average>90) {
			System.out.println("| Grade				  |	A+		");
		}
		else if(average<=89 && average>=80) {
			System.out.println("| Grade				  |	A	");
		}
		else if(average<=79 && average>=70) {
			System.out.println("| Grade				  |	B+		");
		}
		else if(average<=69 && average>=60) {
			System.out.println("| Grade				  |	B		");
		}
		else if(average<=59 && average>=50) {
			System.out.println("| Grade				  |	C		");
		}
		else if(average<=49 && average>=40) {
			System.out.println("| Grade				  |	D	");
		}
		else {
			System.out.println("| Grade				  |	E	");
		}
		
		
		System.out.println("---------------------------------------------------------------------");
	}

}

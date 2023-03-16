package DaySix;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number of Students:");
		int NoOfStudents=scanner.nextInt();
		
		String StudentNames[]=new String[3];
		
		int cls[]=new int[3];
		
		String RollNum[]=new String[3];
		String subject_name[]= {"English ","Maths ","Science ","Social ","Tamil ","Computer Science "};
		int Sub_marks[]=new int[6];
		
		for(int i=0;i<NoOfStudents;i++) {
			System.out.println("Enter Student Name:");
			StudentNames[i]=scanner.next();
			System.out.println("Enter class: ");
			cls[i]=scanner.nextInt();
			System.out.println("Enter Roll Number: ");
			RollNum[i]=scanner.next();
			for(int j=0;j<6;j++) {
				System.out.print(subject_name[j]);
				Sub_marks[i]=scanner.nextInt();
				
			}
		}
			int total = 0;
			for(int i=0;i<6;i++) {
				total=total+Sub_marks[i];
			}
			
			System.out.println("Total: "+total);
			
			int average=total/6;
			System.out.println("Average : "+average);
			
			for(int i=0;i<NoOfStudents;i++) {
				for(int j=0;j<6;j++) {
				
			System.out.println("--------------------------------------------------------------------");
			System.out.println("                 DXC SCHOOL - REPORT CARD                       ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| Name : "+StudentNames[i]+"  		   "+" Class : "+cls[i]+"		  		  ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| English			"+"  |  "+ +Sub_marks[0]+"				  " );
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| Maths				"+"  |  "+ +Sub_marks[1]+"				  " );
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| Science			"+"  |  "+ +Sub_marks[2]+"				  " );
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| Social			"+"  |  "+ +Sub_marks[3]+"				  " );
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| Tamil				"+"  |  "+ +Sub_marks[4]+"				  " );
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| Computer Science		"+"  |  "+ +Sub_marks[5]+"				  ");
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
				}
			
			System.out.println("---------------------------------------------------------------------");
			}
		}
}

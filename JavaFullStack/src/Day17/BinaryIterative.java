package Day17;

import java.util.Scanner;

public class BinaryIterative {
	static void binarySearch(int array[],int num) {
		int low =0,high=array.length-1;
		while (high-low>0) {
			int mid=(high+low)/2;
			if(array[mid]<num) {
				low=mid+ 1;	
			}
			else {
				high=mid;
			}
		}
		if(array[low]==num) {
			System.out.println("Found "+num+" in index of "+low);
		}
		else if(array[high]==num) {
			System.out.println("Found "+num+" in index of "+high);
		}
		else {
			System.out.println("did not found "+num);
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int array[]= {1,3,4,5,6,7,8,9,12,22,23,24,56,78,89,990,7800,45000};
		System.out.println("Enter any integer you want to find from the array: ");
		int num=sc.nextInt();
		binarySearch(array, num);
		

	}

}

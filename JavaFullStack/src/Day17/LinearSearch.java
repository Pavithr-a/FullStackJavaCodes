package Day17;

import java.util.Scanner;

public class LinearSearch {
	private static int search(int[] array,int num) {
		int arrayLength=array.length;
		System.out.println("Length of array is "+arrayLength);
		for(int ctr=0;ctr<arrayLength;ctr++) {
			if(array[ctr]==num) {
				return ctr;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]= {2,88,99,30,45,30,899,100,457,249,784,22,24,15,947,477,6};
		System.out.println("Enter the number to be searched:");
		int numSearch=sc.nextInt();
		int result=search(array, numSearch);
		if(result==-1) {
			System.out.println(numSearch+" is not found in the array.");
		}
		else {
			System.out.println(numSearch+" is found");
		}
	}

}

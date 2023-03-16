package Day17;

import java.util.Scanner;

public class BinarySearch {
	int binarySearch(int array[],int q,int r,int num) {
		if(r>=q) {
			int mid=q+(r-q)/2;
			if(array[mid]==num)
			{
				return mid;
			}
			if(array[mid]>num) {
				return binarySearch(array,q, mid-1, num);
			}
			return binarySearch(array, mid+1, r, num);
		}
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinarySearch binarySearch1=new BinarySearch();
		int array[]= {2,3,5,8,9,22,45,66,77,89,99,100,150,200,209,210,222,999,1090,20900};
		int arrayLength=array.length;
		System.out.println("LEngth:"+arrayLength);
		System.out.println("Enter search element: ");
		int searchInt=sc.nextInt();
		int result=binarySearch1.binarySearch(array,0, arrayLength -1, searchInt);
		if(result==-1) {
			System.out.println(searchInt+" is not found!");
		}else {
			System.out.println(searchInt+" is present");
		}

	}

}

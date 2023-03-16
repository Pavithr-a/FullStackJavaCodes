package Day17;


public class SelectionSort {
	void sort(int array[]) {
		int arrayLength=array.length;
		for(int ctr=0;ctr<arrayLength-1;ctr++) {
			int minIndex=ctr;
			for(int ctr1=ctr+1;ctr1<arrayLength;ctr1++) 
				if(array[ctr1]<array[minIndex])
					minIndex=ctr1;
			int temp=array[minIndex];
			array[minIndex]=array[ctr];
			array[ctr]=temp;
		}
	}
	void printArray(int array[]) {
		int arrayLength=array.length;
		for(int ctr=0;ctr<arrayLength-1;++ctr) {
			System.out.println(array[ctr]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort selectSort=new SelectionSort();
		int array[]= {45,5,78,2,99,254,22,15,8};
		selectSort.sort(array);
		System.out.println(" Sorted Array is ");
		selectSort.printArray(array);
		

	}

}

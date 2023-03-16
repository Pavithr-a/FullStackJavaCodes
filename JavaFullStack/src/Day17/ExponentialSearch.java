package Day17;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	static int expoSearch(int array[], int n, int num) {
		if (array[0] == num)
			return 0;
		int i = 1;
		while (i < n && array[i] <= num) {
			i = i * 2;
		}
		return Arrays.binarySearch(array, i / 2, Math.min(i, n - 1), num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = { 2, 3, 4, 5, 6, 10, 11, 12 };
		System.out.println("Enter num:");
		int num = sc.nextInt();
		int result = expoSearch(array, array.length, num);
		System.out.println(
				(result < 0) ? "Element is not present in the array" : "Element is present at index " + result);

	}

}

package algorithms.p06.two_sum;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr;
		int target;
		
		arr = new int[]{1, 3, 5, 3, 8, 9};
		target = 8;
		printResult(arr, target);
		target = 10;
		printResult(arr, target);
		target = 13;
		printResult(arr, target);

		arr = new int[]{3, 4, 5, 6};
		target = 7;
		printResult(arr, target);

		arr = new int[]{4, 5, 6};
		target = 10;
		printResult(arr, target);
		
		arr = new int[]{5, 5};
		target = 10;
		printResult(arr, target);
	}
	
	public static void printResult(int[] arr, int target) {
		System.out.print("Array: " + Arrays.toString(arr) + ", target: " + target);
		System.out.println(" -> " + Arrays.toString(Solution.twoSum(arr, target)));
	}
}

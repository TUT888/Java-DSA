package algorithms.p06.contains_duplicate;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr;
		
		arr = new int[]{1, 3, 5, 3, 8, 9};
		System.out.println("Array: " + Arrays.toString(arr) + " -> " + Solution.hasDuplicate(arr));
		
		arr = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println("Array: " + Arrays.toString(arr) + " -> " + Solution.hasDuplicate(arr));

		arr = new int[]{11, 31, 53, 34, 82, 91, 11};
		System.out.println("Array: " + Arrays.toString(arr) + " -> " + Solution.hasDuplicate(arr));
	}
}

package dsa2.find_interval_in_array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		printResult(new int[]{2, 1, 4, 3, 2, 1, 1, 4}, 2, 4);
		printResult(new int[]{109, 1, 1, 1, 1, 1, 108}, 108, 109);
		printResult(new int[]{1, 3, 5, 7}, 3, 5);
		printResult(new int[]{2, 1, 4, 1, 2, 3, 1, 1, 4}, 2, 4);
	}
	
	public static void printResult(int[] A, int L, int R) {
		System.out.println("Array: " + Arrays.toString(A) + ", Left: " + L + ", Right: " + R);
		System.out.println("Result: " + Solution.solution(A, L, R));
		System.out.println();
	}
}

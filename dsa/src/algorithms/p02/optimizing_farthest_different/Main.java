package algorithms.p02.optimizing_farthest_different;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		printResult(new int[]{0, 1, 2, 3, 4, 5, 6});
		printResult(new int[]{4, 6, 2, 2, 6, 6, 4});
		printResult(new int[]{4, 4, 6, 2, 6, 4, 4, 4});
	}
	
	public static void printResult(int[] A) {
		System.out.println("Array: " + Arrays.toString(A));
		System.out.println("Original result: " + Solution.orgSolution(A));
		System.out.println("Optimized result: " + Solution.solution(A));
		System.out.println();
	}
}
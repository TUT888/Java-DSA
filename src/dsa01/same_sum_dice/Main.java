package dsa01.same_sum_dice;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nTest 1");
		int[] A1 = {5};
		int[] B1 = {1, 1, 6};
		System.out.println("Array A: " + Arrays.toString(A1));
		System.out.println("Array B: " + Arrays.toString(B1));
		System.out.println("Result: " + Solution.orgSolution(A1, B1));
		System.out.println("Result: " + Solution.solution(A1, B1));

		System.out.println("\nTest 2");
		int[] A2 = {2, 3, 1, 1, 2};
		int[] B2 = {5, 4, 6};
		System.out.println("Array A: " + Arrays.toString(A2));
		System.out.println("Array B: " + Arrays.toString(B2));
		System.out.println("Result: " + Solution.orgSolution(A2, B2));
		System.out.println("Result: " + Solution.solution(A2, B2));

		System.out.println("\nTest 3");
		int[] A3 = {5, 4, 1, 2, 6, 5};
		int[] B3 = {2};
		System.out.println("Array A: " + Arrays.toString(A3));
		System.out.println("Array B: " + Arrays.toString(B3));
		System.out.println("Result: " + Solution.orgSolution(A3, B3));
		System.out.println("Result: " + Solution.solution(A3, B3));

		System.out.println("\nTest 4");
		int[] A4 = {1, 2, 3, 4, 3, 2, 1};
		int[] B4 = {6};
		System.out.println("Array A: " + Arrays.toString(A4));
		System.out.println("Array B: " + Arrays.toString(B4));
		System.out.println("Result: " + Solution.orgSolution(A4, B4));
		System.out.println("Result: " + Solution.solution(A4, B4));
	}
}

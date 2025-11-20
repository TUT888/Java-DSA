package algorithms.p01.same_sum_dice;

import java.util.Arrays;

public class Solution {
	public static int solution(int[] A, int[] B) {
		int N = A.length;
		int M = B.length;
		
		// Check the boundaries
		int leftBound = N > M ? N : M;
		int rightBound = N < M ? N * 6 : M * 6;
		if (leftBound > rightBound) return -1;
		
		// Calculate sum for each array
		int sumA = 0, sumB = 0;
		for (int n : A) { sumA += n; }
		for (int m : B) { sumB += m; }
		if (sumA == sumB) return 0;

		// Check the remaining array, count the total changes
		int[] smallerSumArray, biggerSumArray;
		if (sumA < sumB) {
			smallerSumArray = A;
			biggerSumArray = B;
		} else {
			smallerSumArray = B;
			biggerSumArray = A;
		}
		
		// Calculate differences
		int remainingDiff = Math.abs(sumA - sumB);
		int[] countChangeable = new int[6];
		for (int n : smallerSumArray) {
			countChangeable[6-n] += 1; // can increase
		}
		for (int n : biggerSumArray) {
			countChangeable[n-1] += 1; // can decrease
		}
		
		int totalChanges = 0;
		for (int val=5; val>0; val--) {
			if (remainingDiff < val) {
				totalChanges += 1;
				remainingDiff = 0;
			} else {
				int num = Math.min(remainingDiff / val, countChangeable[val]);
				remainingDiff -= num * val;
				totalChanges += num;
			}
			if (remainingDiff <= 0) break;
		}
		return totalChanges;
	}
	
	// Original solution
	public static int orgSolution(int[] A, int[] B) {
		int N = A.length;
		int M = B.length;
		
		// Check the boundaries
		int leftBound = A.length > B.length ? A.length : B.length;
		int rightBound = A.length < B.length ? A.length * 6 : B.length * 6;
		
		if (leftBound > rightBound) {
			return -1;
		}
		
		// Calculate sum for each array
		// Time complexity of below group of code: O(N) or O(M)
		int sumA = 0;
		int sumB = 0;
		int n = 0;
		int m = 0;
		do {
			if (sumA <= sumB) {
				sumA += A[n];
				n += 1;
			} else {
				sumB += B[m];
				m += 1;
			}
		} while (n < N && m < M);

		// Check the remaining array, count the total changes
		// Time complexity of below group of code: depends on Arrays.sort()
		int[] arr;
		int targetSum;
		if (n == N) {
			arr = B;
			targetSum = sumA;
		} else {
			arr = A;
			targetSum = sumB;
		}
		
		Arrays.sort(arr);
		int i = 0;
		while (i < arr.length) {
			int remainingSum = targetSum - arr[i];
			if (remainingSum < arr.length-i-1) {
				// The value of remaining element in shorted array should be reduced to match the target sum
				break;
			}
			targetSum = remainingSum;
			i += 1;
		}
		
		return arr.length - i;
	}
}

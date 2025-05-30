package same_sum_dice;

import java.util.Arrays;

public class Solution {
	public static int solution(int[] A, int[] B) {
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

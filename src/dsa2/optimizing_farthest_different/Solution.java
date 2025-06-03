package dsa2.optimizing_farthest_different;

public class Solution {
	// Optimized solution: O(n)
	public static int solution(int[] A) {		
		int farthest = 0;
		
		// Forward
		int i = 0;
		while (i < A.length-1) {
			if (A[i] != A[A.length-1]) {
				farthest = A.length - 1 - i;
				break;
			}
			i++;
		}
		
		// Backward
		i = A.length-1;
		while (i > 0) {
			if (A[0] != A[i]) {
				farthest = Math.max(farthest, i);
				break;
			}
			i--;
		}
		
		return farthest;
	}
	
	// Original solution: O(n^2)
	public static int orgSolution(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (A[i]!=A[j]) {
					result = Math.max(result, j-i);
				}
			}
		}
		return result;
	}
}

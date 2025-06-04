package dsa2.optimizing_farthest_different;

public class Solution {
	// Time complexity: O(N)
	// Space complexity: O(N)
	// Additional space: O(1)
	public static int solution(int[] A) {		
		int farthest = 0;
		
		// Forward
		for (int i=0; i<A.length-1; i++) {
			if (A[i] != A[A.length-1]) {
				farthest = A.length - 1 - i;
				break;
			}
		}
		
		// Backward
		for (int i=A.length-1; i>0; i--) {
			if (A[0] != A[i]) {
				farthest = Math.max(farthest, i);
				break;
			}
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

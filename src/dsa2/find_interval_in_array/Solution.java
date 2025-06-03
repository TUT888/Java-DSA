package dsa2.find_interval_in_array;

public class Solution {
	public static int solution(int[] A, int L, int R) {
		// boolean[] checkArray: Check the seen value from L to R
		// checkArray[i] should check value L
		// checkArray[i+1] should check value L+1
		boolean[] checkArray = new boolean[R-L+1]; 
		int minCount = 1000001;
		
		int i = 0;
		int startIndex = i;
		int count = 0;
		int nextIndex = -1;
		
		while (i < A.length) {
			// If not in required range -> continue next loop
			if (A[i] < L || A[i] > R) {
				i += 1;
				continue;
			}
			
			// Check the value
			int idx = A[i] - L;
			if (!checkArray[idx]) {
				count += 1;
				checkArray[idx] = true;
			}
			
			if (count == 2) {
				// Mark the second seen index as the start index for next count
				nextIndex = i;
			}
			if (nextIndex > 0 && count == checkArray.length) {
				// Update min count
				minCount = Math.min(minCount, i-startIndex+1);
				
				// Restart the count and start from marked index
				count = 0;
				checkArray = new boolean[R-L+1];
				i = nextIndex;
				startIndex = nextIndex;
				continue;
			}
			i += 1;
		}
		
		if (minCount == 1000001) {
			return -1;
		}
		return minCount;
	}
}

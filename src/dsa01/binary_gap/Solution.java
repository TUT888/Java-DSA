package dsa01.binary_gap;

public class Solution {
	// Time complexity: O(log(N))
	public static int solution(int N) {
		int maxGap = 0;
		int prev = -1;
		int i = 0;
		do {
			int r = N%2;
			
			if (r==1) {
				if (prev!=-1) {
					int gap = i - prev - 1;
					maxGap = (prev>=0 && gap>maxGap) ? gap : maxGap;
				}
				prev = i;
			}
			
			N /= 2;
			i += 1;
		} while (N > 0);
		
		return maxGap;
	}
}
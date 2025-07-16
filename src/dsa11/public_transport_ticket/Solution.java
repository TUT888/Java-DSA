package dsa11.public_transport_ticket;

public class Solution {
	public static int solution(int[] A) {
		int minimumCost = 0;
		
		int start = 0;
		int end = 0;
		while (end < A.length) {
			if (end != A.length-1 && A[end+1] - A[start] <= 6) {
				end += 1;
				continue;
			}
			
			// If date between more than or equals to 3 (>= 4 days) => Buying 7-day ticket is more efficient
			if (end - start >= 3) minimumCost += 7; 
			// Otherwise (< 4 days) => Buying 1-day ticket for each day is more efficient
			else minimumCost += 2 * (end - start + 1);

			end += 1;
			start = end;
		}
		
		// If cost > 25, using 30-day ticket is more efficient
		if (minimumCost > 25) return 25;
		
		return minimumCost;
	}
}
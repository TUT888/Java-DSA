package dsa11.public_transport_ticket;

public class Solution {
	public static int minCost(int[] A) {
		return dynamicSolution(0, A, new int[A.length]);
	}
	
	public static int dynamicSolution(int dateIndex, int[] A, int[] memo) {
		if (dateIndex == A.length) return 0;
		if (memo[dateIndex] != 0) return memo[dateIndex];
		
		int currentDay = A[dateIndex];
		
		// Opt 1: Use 1-day ticket
		int costFor1DayTicket = 2 + dynamicSolution(dateIndex+1, A, memo);
		
		// Opt 2: Use 7-day ticket
		int next7dayIndex = dateIndex + 1;
		while (next7dayIndex < A.length && A[next7dayIndex] <= currentDay + 6) {
			next7dayIndex += 1;
		}
		int costFor7dayTicket = 7 + dynamicSolution(next7dayIndex, A, memo);
		
		// Opt 3: Use 30-day ticket
		int next30dayIndex = dateIndex + 1;
		while (next30dayIndex < A.length && A[next30dayIndex] <= currentDay + 29) {
			next30dayIndex += 1;
		}
		int costFor30dayTicket = 25 + dynamicSolution(next30dayIndex, A, memo);
		
		// Find minimum cost
		int currentMinCost = Math.min(Math.min(costFor1DayTicket, costFor7dayTicket), costFor30dayTicket);
		memo[dateIndex] = currentMinCost;
		return currentMinCost;
	}
	
	// !!! Greedy but not always right
	public static int greedySolution(int[] A) {
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
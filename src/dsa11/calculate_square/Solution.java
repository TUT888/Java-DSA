package dsa11.calculate_square;

public class Solution {
	public static int solution(int A, int B) {
		int count = 0;
		
		// Perform square root operation on two boundaries (A & B)
		// Continuously until B <= A
		do {
			A = (int) Math.ceil(Math.sqrt(A));
			B = (int) Math.floor(Math.sqrt(B));
			if (B - A >= 0) count += 1;
		} while (B > A);
		
		// B < A, return count result
		if (B - A == -1) return count; 
		
		// When A == B, count remaining possible square root
		double sqrtVal = Math.sqrt(A);
		while (sqrtVal - Math.floor(sqrtVal) == 0) {
			count += 1;
			sqrtVal = Math.sqrt(sqrtVal);
		}
		
		return count;
	}
}

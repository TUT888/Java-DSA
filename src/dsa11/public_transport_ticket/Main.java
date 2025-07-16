package dsa11.public_transport_ticket;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = new int[]{1, 2, 4, 5, 7, 29, 30};
		System.out.println("A = " + Arrays.toString(A) + " => " + Solution.solution(A));
		System.out.println();
		
		A = new int[]{1, 3, 5, 9, 11, 15, 16, 20, 27};
		System.out.println("A = " + Arrays.toString(A) + " => " + Solution.solution(A));
		System.out.println();
		
		A = new int[]{1, 3, 5, 7, 8, 9, 11, 13, 14, 16, 18};
		System.out.println("A = " + Arrays.toString(A) + " => " + Solution.solution(A));
		System.out.println();
		
		A = new int[]{1, 3, 6, 8, 9, 11, 15};
		System.out.println("A = " + Arrays.toString(A) + " => " + Solution.solution(A));
	}
}

package dsa01.binary_gap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int N = sc.nextInt();
		
		System.out.println("N = " + N + " => binary gap = " + Solution.solution(N));
		
		sc.close();
	}
}

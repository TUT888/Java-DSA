package algorithms.p04.calculate_square;

public class Main {
	public static void main(String[] args) {
		int A, B;
		
		A = 10; B = 20;
		System.out.println("A = " + A + ", B = " + B + " => " + Solution.solution(A, B));
		
		A = 6000; B = 7000;
		System.out.println("A = " + A + ", B = " + B + " => " + Solution.solution(A, B));
		
		A = 12; B = 40;
		System.out.println("A = " + A + ", B = " + B + " => " + Solution.solution(A, B));
		
		A = 273; B = 287;
		System.out.println("A = " + A + ", B = " + B + " => " + Solution.solution(A, B));
		
		A = 256; B = 287;
		System.out.println("A = " + A + ", B = " + B + " => " + Solution.solution(A, B));
	}
}

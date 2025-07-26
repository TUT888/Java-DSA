package dsa11.six_digits;

public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.solution(1, 8, 3, 2, 6, 4)); // 12:36:48
		System.out.println(Solution.solution(0, 0, 0, 0, 0, 0)); // 00:00:00
		System.out.println(Solution.solution(0, 0, 0, 7, 8, 9)); // 07:08:09
		System.out.println(Solution.solution(2, 4, 5, 9, 5, 9)); // NOT POSSIBLE
		System.out.println(Solution.solution(2, 4, 6, 1, 5, 7)); // 12:46:57
		
		System.out.println(Solution.solution(1, 3, 5, 8, 8, 9)); // 18:38:59
		System.out.println(Solution.solution(2, 3, 4, 5, 6, 6)); // 23:46:56
		System.out.println(Solution.solution(2, 3, 5, 5, 9, 9)); // 23:59:59
		System.out.println(Solution.solution(1, 3, 4, 7, 8, 9)); // 17:38:49
		
		System.out.println(Solution.solution(2, 3, 1, 0, 5, 6)); // 01:23:56
		System.out.println(Solution.solution(1, 2, 4, 5, 6, 9)); // 12:46:59
		System.out.println(Solution.solution(2, 4, 5, 9, 5, 9)); // NOT POSSIBLE
		
		System.out.println(Solution.solution(1, 2, 3, 4, 5, 6)); // 12:34:56
		System.out.println(Solution.solution(2, 4, 5, 9, 5, 9)); // NOT POSSIBLE
		System.out.println(Solution.solution(0, 1, 2, 3, 4, 5)); // 01:23:45
		System.out.println(Solution.solution(9, 9, 9, 9, 9, 9)); // NOT POSSIBLE
		System.out.println(Solution.solution(2, 3, 5, 6, 7, 8)); // NOT POSSIBLE
		System.out.println(Solution.solution(2, 3, 5, 5, 5, 5)); // 23:55:55
		System.out.println(Solution.solution(0, 1, 0, 2, 0, 3)); // 00:01:23
		System.out.println(Solution.solution(1, 1, 2, 2, 5, 9)); // 11:22:59
		System.out.println(Solution.solution(0, 6, 7, 8, 9, 9)); // NOT POSSIBLE
	}
}

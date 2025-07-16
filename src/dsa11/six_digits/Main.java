package dsa11.six_digits;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 8, 3, 2, 6, 4};
		System.out.println(Solution.solution(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));

		arr = new int[] {0, 0, 0, 0, 0, 0};
		System.out.println(Solution.solution(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));

		arr = new int[] {0, 0, 0, 7, 8, 9};
		System.out.println(Solution.solution(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
		
		arr = new int[] {2, 4, 5, 9, 5, 9};
		System.out.println(Solution.solution(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
	}
}

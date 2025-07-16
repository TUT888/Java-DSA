package dsa11.six_digits;

public class Solution {
	public static String solution(int A, int B, int C, int D, int E, int F) {
		// Place digit into a sorted array
		int[] countDigit = new int[10];
		countDigit[A] += 1;
		countDigit[B] += 1;
		countDigit[C] += 1;
		countDigit[D] += 1;
		countDigit[E] += 1;
		countDigit[F] += 1;
		
		int[] arr = new int[6];
		int index = 0;
		for (int digit=0; digit<countDigit.length; digit++) {
			// Put available digits to array (until count = 0)
			while (countDigit[digit] > 0) {
				arr[index] = digit;
				index += 1;
				countDigit[digit] -= 1;
			}
		}

		// Check and fix invalid value by looping array from end to start
		// Each loop has step = 2 to check invalid HH/MM/SS pairs by using i-1 and i
		for (int i=arr.length-1; i>=0; i-=2) {
			int limit = i / 2 > 0 ? 59 : 23;
			
			int value = arr[i-1] * 10 + arr[i];
			if (value <= limit) continue;
			
			// For each HH or MM or SS, min value must be stay at first position
			if (arr[i-1] > arr[i]) swap(arr, i, i-1);
			// Find position to swap with arr[i-1]
			boolean isValid = false;
			for (int j=i-2; j>=0; j--) {
				if ((arr[j] * 10 + arr[i]) <= limit) {
					swap(arr, j, i-1);
					isValid = true;
					break;
				}
			}
			if (!isValid) return "NOT POSSIBLE";
		}
		
		// Return HH:MM:SS string
		return "" + arr[0] + arr[1] + ":" + arr[2] + arr[3] + ":" + arr[4] + arr[5];
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}

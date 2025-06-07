package dsa3.change_money;

public class Solution {
	// Time complexity: O(1)
	// Space complexity: O(1)
	public static int solution(int money) {
		int[] choices = {1, 2, 5, 10, 20, 50, 100, 200, 500};
		int count = 0;
		for (int i=choices.length-1; i>=0; i--) {
			int number = money / choices[i];
			money = money - choices[i]*number;
			count += number;
		}
		return count;
	}
}

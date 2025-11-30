package algorithms.p06.two_sum;

import java.util.HashMap;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i=0; i < nums.length; i++) {
			if (hm.containsKey(nums[i]))
				return new int[] { hm.get(nums[i]), i };

			hm.put(target - nums[i], i);
		}
		return new int[2];
	}
}

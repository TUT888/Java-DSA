package algorithms.p06.contains_duplicate;

import java.util.HashSet;

public class Solution {
	public static boolean hasDuplicate(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int n : nums) {
			if (hs.contains(n)) {
				return true;
			}
			hs.add(n);
		}
		return false;
	}
}

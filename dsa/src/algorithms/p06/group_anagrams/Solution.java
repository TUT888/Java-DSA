package algorithms.p06.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

		for (String s : strs) {
			char[] charArr = new char[26];
			for (char c : s.toCharArray()) {
				charArr[c - 'a']++;
			}
			String key = Arrays.toString(charArr);

			if (!hm.containsKey(key))
				hm.put(key, new ArrayList<String>());
			hm.get(key).add(s);
		}

		return new ArrayList<>(hm.values());
	}
}

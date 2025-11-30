package algorithms.p06.valid_anagram;

import java.util.HashMap;

public class Solution {
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int val = 0;
			if (hm.get(c) == null) {
				return false;
			} else {
				val = hm.get(c);
			}
			
			if (val == 1) {
				hm.remove(c);
			} else {
				hm.put(c, val - 1);
			}
		}
		
		return hm.size() == 0;
	}
	
	public static boolean efficientIsAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Integer> countS = new HashMap<>();
		HashMap<Character, Integer> countT = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
			countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
		}
		return countS.equals(countT);
	}
}

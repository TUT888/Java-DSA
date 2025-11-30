package algorithms.p06.group_anagrams;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] strs;
		
		strs = new String[] {"act", "pots", "tops", "cat", "stop", "hat"};
		System.out.println("Array: " + Arrays.toString(strs) + " -> " + Solution.groupAnagrams(strs));
		
		strs = new String[] {"x"};
		System.out.println("Array: " + Arrays.toString(strs) + " -> " + Solution.groupAnagrams(strs));
		
		strs = new String[] {""};
		System.out.println("Array: " + Arrays.toString(strs) + " -> " + Solution.groupAnagrams(strs));
	}
}

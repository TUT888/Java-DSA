package algorithms.p06.valid_anagram;

public class Main {
	public static void main(String[] args) {
		String s, t;
		
		s = "apple";
		t = "banana";
		System.out.println("S: " + s);
		System.out.println("T: " + t);
		System.out.println("-> " + Solution.efficientIsAnagram(s, t) + "\n");

		s = "lived";
		t = "devil";
		System.out.println("S: " + s);
		System.out.println("T: " + t);
		System.out.println("-> " + Solution.efficientIsAnagram(s, t) + "\n");
	}
}

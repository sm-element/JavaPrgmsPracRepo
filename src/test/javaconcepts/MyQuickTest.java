package test.javaconcepts;

import java.util.HashSet;

public class MyQuickTest {

	public static boolean duplicatecheck(String str) {

		HashSet<Character> chars = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (chars.contains(str.charAt(i))) {
				return true;
			}
			chars.add(str.charAt(i));
		}
		return false;

		// examples -
		// should return true if str is "aabc".
		// should return true if str is "abca".
		// should return false if str is "abc".
	}

	public static void main(String args[]) {
		System.out.println(duplicatecheck("abca"));
	}
}

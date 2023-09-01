package test.InterviewProgramQuestions;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StrOccurenceCountAndRemoveDuplicate_IMP {

	public static void main(String args[]) {
		//String str = "Anything is possible if we belive in ourselves it is important to be confident in this world";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		CountOccurenceOfRepeatedString(str);
		RemoveOccurenceOfRepeatedStrings(str);
		method3();
	}



	public static void CountOccurenceOfRepeatedString(String str) {

		String[] strArr = str.split(" ");
		List<String> lst = Arrays.asList(strArr);
		String repeatedStr = "is";
		int counter = 0;
		System.out.println("The original string:" + str);

		// Approach 1 - Loop way
		for (int num = 0; num < strArr.length; num++) {
			if (strArr[num].equals(repeatedStr))
				counter++;

		}
		System.out.println(" the word " + repeatedStr + "occurs " + counter + " times in the String");

		// Approach 2 - Streams and Filter way - matches any word and not the whole word
		// ***NOT RIGHT******
		/*
		 * long cnt = lst.stream().filter(s -> s.contains(repeatedStr)).count();
		 * System.out.println(" the word " + repeatedStr + "occurs " + cnt +
		 * " times in the String");
		 */

	}

	/*
	 * This method removes the repeated words within the string. It works for all
	 * repeating words.
	 */
	public static void RemoveOccurenceOfRepeatedStrings(String str) {

		String temp[] = str.split("[. ]+");
		List<String> lst = Arrays.asList(temp);

		// To remove the repeated word
		// long cnt = al.stream().filter(matchword::contains).count();
		List<String> distinctItems = lst.stream().distinct().collect(Collectors.toList());

		String result = distinctItems.stream().map(Object::toString).collect(Collectors.joining(" "));

		System.out.println("After removal of repeated words::" + result);
	}

	public static void method3() {

		String word = "is";
		List<String> matchword = Arrays.asList(word);
	}

}

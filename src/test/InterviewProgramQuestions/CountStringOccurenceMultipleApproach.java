package test.InterviewProgramQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountStringOccurenceMultipleApproach {

	public static void main(String args[]) {
		String string = "Spring is beautiful but so is winter.Also it is Spring not a wonderful climate.is it not ";
		String word = "is";
		

		// Multiple spilt conditions like space(" ") and dot (.)
		String temp[] = string.split("[. ]+");
		System.out.println("temp array with more split condition::" + temp.length);

		// Single Split condition like space(" ")
		String temp1[] = string.split(" ");

		System.out.println("temp1 array with one split condition::" + temp1.length);

		// Approach 1 - Normal way

		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (word.equals(temp[i]))
				count++;
		}
		System.out.println("The string is: " + string);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");

		// Approach 2 - Using streams

		// List<String> al = Arrays.asList("Spring is beautiful but so is winter.Also is
		// Spring not a wonderful climate.is ");
		List<String> al = Arrays.asList(temp);

		List<String> matchword = Arrays.asList(word);

		long cnt = al.stream().filter(matchword::contains).count();
		System.out.println("Streams way::: The string is: " + string);
		System.out.println("Streams way::: The word " + word + " occurs " + cnt + " times in the above string");
		
		// Approach 3 - Using Collections
		int wordCount = Collections.frequency(Arrays.asList(string.split(" ")), word);
		System.out.println("Collections way::: The string is: " + string);
		System.out.println("Collections way::: The word " + word + " occurs " + cnt + " times in the above string");
		
	}
}

package test.InterviewProgramQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateStringRemoval {
	
	public static void main(String args[])
	{
		DuplStrRemovalWithoutCaseSensitivity();
		
		//Todo
		//DuplStrRemovalWithCaseSensitivity();
		DuplCharRemoval();
		
		
	}
	public static void DuplStrRemovalWithoutCaseSensitivity()
	{
	 String sentence =" i am a good girl I am a barbie girl";
	 
	 String[] sen  = sentence.split("[. ]+");
	 
	 // Option 1
	 //List<String> list = Arrays.asList(sen);
	 
	 // Option 2
	 List<String> list = new ArrayList<String>();
	 
	 for (String s: sen)
	 {
		 list.add(s);
	 }
	 
	 System.out.println("valiues of list:::"+ list);
		//List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

		// Get list without duplicates
		List<String> distinctItems = list.stream()
		                                    .distinct()
		                                    .collect(Collectors.toList());

		// to convert the list of string to string in java streams
		String finalChar = distinctItems.stream().map(Object::toString).collect(Collectors.joining(" "));
		
		// Let's verify distinct elements
		System.out.println("string array"+finalChar);
	}
	public static void DuplCharRemoval()
	{
		String str = "abcbcd";
		
		
		
		List<Character> charsLst = new ArrayList<Character>();
		  
        for (char ch : str.toCharArray()) {
  
        	charsLst.add(ch);
        }
  

		// Get list without duplicates
		List<Character> distinctItems = charsLst.stream()
		                                    .distinct()
		                                    .collect(Collectors.toList());
		
		// to convert the list of string to string in java streams
		String finalChar = distinctItems.stream().map(Object::toString).collect(Collectors.joining(" "));

		// Let's verify distinct elements
		System.out.println("character array::"+finalChar);
	}
}

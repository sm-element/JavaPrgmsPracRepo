package test.InterviewProgramQuestions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseEachWord {
	
	    public static void main(String[] args) {

	    	
	    	// Approach 1
	        reverseEachWord("java guides");

	        reverseEachWord("I am string not reversed");

	        reverseEachWord("Reverse Me");

	        // Approach 2
	        //String origi = "I am the string to be reversed";
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the string");
			String origi = in.nextLine();
	        System.out.println("String Original:: "+origi);
	       String resultStr =  reverseWord(origi);
	       System.out.println("String Reversed:: "+resultStr);
	    }

	    private static String reverseEachWord(String originalStr) {

	        // split the sentence by words using split method
	        String[] words = originalStr.split(" ");

	        String reverseStr = "";

	        // Iterate over String array
	        for (String word: words) {
	            // reverse each word by calling reverseWithStringConcat method
	            reverseStr = reverseStr + reverseWithStringConcat(word) + " ";
	        }

	        display(originalStr, reverseStr);
	        return reverseStr;
	    }

	    private static final void display(String original, String reverse) {
	        System.out.println(original);
	        System.out.println(reverse);
	        System.out.println("----------------------------");
	    }
	    private static final String reverseWithStringConcat(String string) {
	        String reverseWord = "";
	        for (int i = (string.length() - 1); i >= 0; i--) {
	            reverseWord = reverseWord + string.charAt(i);
	        }
	        return reverseWord;
	    }
	    
	    //method that returns reverse words   
        public static String reverseWord(String str){  
      
            StringBuilder result=new StringBuilder();  
            StringTokenizer tokenizer=new StringTokenizer(str," ");  
      
            while(tokenizer.hasMoreTokens()){  
            StringBuilder sb=new StringBuilder();  
            sb.append(tokenizer.nextToken());  
            sb.reverse();  
      
            result.append(sb);  
            result.append(" ");  
            }  
            return result.toString();  
        }  
	}


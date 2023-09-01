package test.InterviewProgramQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	   public static void main(String[] args) { 
		   	
		   // reversing an integer number
		   		int number =12787;
		   		
		   		
		   		String string = String.valueOf(number);
		   	 // reversing a string
	          //String string = "Dream";    
		   		
		   		
		   		
	          //Stores the reverse of given string    
	          String reversedStr = "";    
	          
	          // Approach 1 
	          //Iterate through the string from last and add each character to variable reversedStr    
	          for(int i = string.length()-1; i >= 0; i--){    
	              reversedStr = reversedStr + string.charAt(i);    
	          }    
	              
	          System.out.println("Original string: " + string);    
	          //Displays the reverse of given string    
	          System.out.println("Reverse of given string: " + reversedStr); 
	          
	          // Approach 2 - Stringbuilder    
	          String reverseStr = new StringBuilder(string).reverse().toString();
	          System.out.println("Stringbuilder way::: Reverse of given string: " + reversedStr); 
	          
	          // Approach 3 - Streams way

	          System.out.println("Stream way::::" + Stream.of(string)
	            .map(s -> new StringBuilder(string).reverse())
	            .collect(Collectors.joining()));
	          
	
	          
	   }
	          
	         
	      }    
	   
	   
	   


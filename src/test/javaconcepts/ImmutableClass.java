package test.javaconcepts;

import test.javaconcepts.EmployeeTest;

public class ImmutableClass  
		{  
		public static void main(String ar[])  
		{  
		EmployeeTest e = new EmployeeTest("ABC123");  
		String s1 = e.getPancardNumber();  
		System.out.println("Pancard Number: " + s1);  
		}  
		 
	}



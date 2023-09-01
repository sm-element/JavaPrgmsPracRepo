package test.InterviewProgramQuestions;

class AddStringsWithoutInbuilt {
    
	
	
	// add strings without in built functions
	public static String addStrings(String num1, String num2) {
         String result = num1+num2;
        return result;
    }
     public static void main(String[] args)
    {
    	 String res = addStrings("9","10");
    	 System.out.println("Result is::"+res);
    }
}
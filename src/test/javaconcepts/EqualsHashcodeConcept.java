package test.javaconcepts;

public class EqualsHashcodeConcept {
	
	public static void main(String args[])
	{
		
		String s1 = new String("A");
		String s2 = new String("A");
		
		
		if(s1==s2)
		{
			System.out.println("references equal");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("objects equal");
		}
		
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		
		if(s3==s4)
		{
			System.out.println("s3/s4 references equal");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("s3/s4 objects equal");
		}
		
	}

}

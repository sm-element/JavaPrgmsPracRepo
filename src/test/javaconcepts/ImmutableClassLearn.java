package test.javaconcepts;

// final class hence no subclassing, final variables hence cannot be modified, no setter method. But many instances can be created.
//hence immutable class is not singleton.
final class Employee10
{    
final String pancardNumber;    
public Employee10(String pancardNumber)  
{    
this.pancardNumber=pancardNumber;    
}  
public String getPancardNumber(){    
return pancardNumber;    
}    
}
	public class ImmutableClassLearn  
	{  
	public static void main(String ar[])  
	{  
	Employee10 e = new Employee10("ABC123");  
	String s1 = e.getPancardNumber();  
	System.out.println("Pancard Number::s1::: " + s1);  
	// demo that many instances can be created
	Employee10 e1 = new Employee10("ABC124");  
	String s2 = e1.getPancardNumber(); 
	System.out.println("Pancard Number::s2::: " + s2);  
	}  
	
	
	

}

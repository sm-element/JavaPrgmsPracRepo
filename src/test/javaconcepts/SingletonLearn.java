package test.javaconcepts;

public class SingletonLearn {
	
	
	// one instance of the class per jvm, setter methods can be used. Hence it is not immutable.
	
	private static SingletonLearn instance = null;
	String str;
	
	private SingletonLearn()
	{
		
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	

	public static SingletonLearn getInstance()
	{
		if(instance==null)
		{
			instance = new SingletonLearn();
		}
		return instance;
	}

public static void main(String args[])
{
	SingletonLearn s1 = SingletonLearn.getInstance() ;
	s1.str = "Hi first instance";
	
	s1.setStr("hello");
	
	SingletonLearn s2 = SingletonLearn.getInstance() ;
	s2.str = "Hi second instance";
		
	SingletonLearn s3 = SingletonLearn.getInstance() ;
	s3.str = "Hi third instance";
	
	s3.setStr("Hello third instance");
	
	System.out.println("Value of s1"+s1.str);
	System.out.println("Value of s2"+s2.str);
	System.out.println("Value of s3"+s3.str);
}

}

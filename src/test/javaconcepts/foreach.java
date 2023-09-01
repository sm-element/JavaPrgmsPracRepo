package test.javaconcepts;


import java.util.ArrayList;

public class foreach {

	 public static void main(String args[])
	    {
	        ArrayList<String> al = new ArrayList<String>() ;
	            

	        al.add("3");
	        al.add("5");
	        al.add("7");
	        al.add("10");
	        // using lambda
	        al.stream().forEach(s->System.out.println(s));
	        // method reference
	        al.stream().forEach(System.out::println);


	    }
}

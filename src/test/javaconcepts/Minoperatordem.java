package test.javaconcepts;

import java.util.ArrayList;
import java.util.Optional;

public class Minoperatordem {
	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(5);
		al.add(8);
		al.add(9);
		
		// one way
		Optional<Integer> minmax = al.stream().max((i1,i2)->i1.compareTo(i2));
		System.out.println("min/max value" +minmax);
		
		// two way - min
		Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min value" +min);
		
		// two way - max
		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min value" +max);
	}

}

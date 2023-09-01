package test.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMinandMaxElement {
	public static void main(String args[]) throws Exception
	{
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(100);
		lst.add(20);
		lst.add(2);
		lst.add(5);
		lst.add(1);
		
		System.out.println("the original list is :"+lst);
		
		int minelement = Collections.min(lst);
		
		System.out.println("the min element is :"+minelement);
		
		int maxelement = Collections.max(lst);
		
		System.out.println("the max element is :"+maxelement);
	}
}

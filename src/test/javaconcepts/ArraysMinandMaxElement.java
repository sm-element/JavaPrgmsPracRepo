package test.javaconcepts;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysMinandMaxElement {

	public static void main(String args[]) throws Exception
	{
		Integer arr[] = {100, 7, 5,3 ,4,2,1};
		
		System.out.println("the original array is :"+Arrays.toString(arr));
		
		int minelement = Collections.min(Arrays.asList(arr));
		
		System.out.println("the min array is :"+minelement);
		
		int maxelement = Collections.max(Arrays.asList(arr));
		
		System.out.println("the max array is :"+maxelement);
	}
}

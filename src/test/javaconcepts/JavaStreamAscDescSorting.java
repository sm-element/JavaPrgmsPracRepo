package test.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//import org.apache.commons.lang.ArrayUtils;



public class JavaStreamAscDescSorting {
	
	public static void main(String args[])
	{
	
	int arr[] = { 4,3,0,-1,6,7,1,5,10,9};
	
	// Option 1:: to put array into a list
	//List<Integer> al = Arrays.asList(4,3,0,-1,6,7,1,5,10,9);
	
	
	// Option 2: More efficient
	List<Integer> al = new ArrayList<Integer>();
	
	for(int j : arr)
	{
		al.add(j);
	}
	
	System.out.println("Array List Size::" +al.size());
	
	//List<Integer> al = Arrays.asList(ArrayUtils.toObject(arr));
	
	methodAscSortviaStreams(al);
	methodDescSortviaStreams(al);
	
	}
	
	public static void methodAscSortviaStreams(List<Integer> a)
	{
		List ascList = a.stream().filter(i->i<5).sorted().collect(Collectors.toList());
		System.out.println("Ascendinglist::");
		ascList.forEach(System.out::println);
	}
	public static void methodDescSortviaStreams(List<Integer> a)
	{
		List descList = a.stream().filter(i->i>5).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descendinglist::");
		descList.forEach(System.out::println);
	}
	
}

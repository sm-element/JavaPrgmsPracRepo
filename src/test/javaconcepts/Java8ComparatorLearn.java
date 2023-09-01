package test.javaconcepts;

import java.util.*;
import java.io.*;


class Student1{
	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

class AgeComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
	/*
	 * @Override public int compare(Object o1, Object o2) { // TODO Auto-generated
	 * method stub return 0; }
	 */

	
}

class NameComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.name.compareTo(s2.name);
	}

}

class Java8ComparatorLearn {
	public static void main(String args[]) {
		ArrayList<Student1> arr = new ArrayList<Student1>();

		arr.add(new Student1(101, "Prakash", 20));
		arr.add(new Student1(103, "Rohan", 25));
		arr.add(new Student1(102, "suresh", 21));
		
		System.out.println("Sorting by Name");
		Collections.sort(arr, new NameComparator());
		for (Student1 st : arr) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		// using   lamda  way
		/*
		 * for (Student1 st : arr) { System.out.println(arr.sort((s1, s2) ->
		 * s1.name.compareTo(s2.name))); }
		 */
		
		System.out.println("sorting by Age");
		Collections.sort(arr, new AgeComparator());
		for (Student1 st : arr) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}

package test.javaconcepts;

import java.util.ArrayList;
import java.util.Collections;



class Student implements Comparable<Student>{
	int rollno;
	int age;
	String name;

	Student(int rollno, int age, String name) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}

	public int compareTo(Student s) {
		if (age == s.age)
			return 0;
		else if (age > s.age)
			return 1;
		else
			return -1;
	}

	
	
}
public class JavaComparableLearn {
	public static void main(String args[]){
		ArrayList<Student> arr=new ArrayList<Student> ();
		
		arr.add(new Student (1, 30, "test1"));
		arr.add(new Student (2, 10, "test2"));
		arr.add(new Student (3, 20, "test3"));
		

		Collections.sort(arr);
		
		
		for(Student s:arr){
		System.out.println(s.rollno+""+s.age+""+s.name);
		}
		}
}


package test.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import test.javaconcepts.Student12;





@SuppressWarnings("unused")
public class Java8ComparatorLearnUsingLambda {
	
	/*static List<Student> arr =  Arrays.asList(new Student(101, "Prakash", 20),
											  new Student(103, "Rohan", 25),
											  new Student(102, "suresh", 21)); */
		
	
	public static void main(String args[]) {
		
		List<Student12> arr =  new ArrayList<Student12>();	

		arr.add(new Student12(100,"Prakash Partier", 22));
		arr.add(new Student12(101, "Prakash Partier", 20));
		arr.add(new Student12(103, "Rohan Roasted", 25));
		arr.add(new Student12(102, "suresh Smily", 21));
		
		
			//Using lambda - Sorting by name
			
			Comparator<Student12> nameComparator = (Student12 s1, Student12 s2) -> {return s1.name.compareTo(s2.name);};
			
			System.out.println("Sorting by Name");
			Collections.sort(arr, nameComparator);
			arr.forEach(System.out::println);

			// Using Lambda - Sorting by age
			Comparator<Student12> ageComparator = Comparator.comparing(Student12::getAge);
			
			System.out.println("Sorting by age");
			Collections.sort(arr, ageComparator);
			arr.forEach(System.out::println);
			
			// Using Lambda - Sorting by name and then age
			Comparator<Student12> nameAgeComparator = Comparator.comparing(Student12::getName).thenComparing(Student12::getAge);
						
			System.out.println("Sorting by name and then age");
			Collections.sort(arr, nameAgeComparator);
			arr.forEach(System.out::println);
			
			
			// Using Lambda - Sorting by name reversed
			Comparator<Student12> nameReversedComparator = Comparator.comparing(Student12::getName).reversed();
						
			System.out.println("Sorting by name reversed");
			Collections.sort(arr, nameReversedComparator);
			arr.forEach(System.out::println);
		}
	}




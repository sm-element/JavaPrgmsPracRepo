package test.javaconcepts;

//importing classes  
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//creating FailFastIterator.java class   
public class FailFastIterator {

	// main() method starts
	public static void main(String[] args) {
		// creating map
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(101, "Emma");
		students.put(102, "Paul");
		students.put(103, "Walker");

		// creating an instance of the Iterator class
		Iterator itr = students.keySet().iterator();

		// iterating map using Iterator
		while (itr.hasNext()) {
			// printing elements of Map
			System.out.println(students.get(itr.next())); 
			// here modcount (internal flag) is referred it is modified, hence throws concurrent modification exception
			// terminates operation possible that are exposing failures
			
			// adding an element to Map
			students.put(104, "Rubby"); // on the next call of  () method, exception will be thrown.
		}
	}
}

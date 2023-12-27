package test.javaconcepts;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Employee {
	
int empId;
String empname;

Employee(int empid, String name){
this.empId=empid;
this.empname=name;
	
}
}



class trying{
	
	public static void main(String args[])
	{
		Sytem.out.println("Editing from develop branch to test merge conflict case");
		System.out.println("Inside main method");
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee(1,"firs"));
		l1.add(new Employee(2,"sec"));
		l1.add(new Employee(3,"third"));
		ArrayList<Employee> l2 = new ArrayList<Employee>();
		l2.add(new Employee(11,"fgr"));
		l2.add(new Employee(21,"segfc"));
		l2.add(new Employee(31,"third"));
		
		//ArrayList<Employee> emplst = l1.stream().anyMatch(Employee::empname).collect(Collectors.toList());
	}
	
}

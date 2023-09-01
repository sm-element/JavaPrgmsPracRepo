package test.javaconcepts;

public class EmployeeThread implements Runnable {
	
	int age;
	int empid;
	String name;
	
	public EmployeeThread(int age, int empid, String name) {
		super();
		this.age = age;
		this.empid = empid;
		this.name = name;
	}
	public EmployeeThread() {
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

package test.javaconcepts;

import test.javaconcepts.Student12;

public class MultiThreading_Demo extends Thread{
	
	
	static EmployeeThread empThread = new EmployeeThread();
	
	
	public static void main(String args[])
	{
		
	
		Thread t1 = new Thread(empThread);
		
		Thread t2 = new Thread(empThread);
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		empThread.setAge(55);
		System.out.println("Age first set:" + empThread.getAge());
		
		//System.out.println((empThread.age==65);
	}

	public void run()
	{
			empThread.setAge(65);
			System.out.println("Age later set:" + empThread.getAge());
	}


}

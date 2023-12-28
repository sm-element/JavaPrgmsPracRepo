package test.javaconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadDemo {

	public static void main(String args[])
	{
		
		System.out.println("Inside ExecutorThreadDemo class - test for pulling latest code");
		singlethreaddemo();
		fixedthreadpooldemo();		
	}
	
	public static void singlethreaddemo()
	{
		ExecutorService et = Executors.newSingleThreadExecutor();
		
		et.execute(new Runnable(){
			
			public void run()
			{
				System.out.println("Sinlethreadexecutor::Executor class dem");
			}
		});
		
		et.shutdown();
	}
	
	public static void fixedthreadpooldemo()
	{
		ExecutorService et = Executors.newFixedThreadPool(5);
		
		et.execute(new Runnable(){
			
			public void run()
			{
				System.out.println("fixedthreadpool:::Executor class dem");
			}
		});
		
		et.shutdown();
	}
}

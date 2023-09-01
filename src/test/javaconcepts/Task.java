package test.javaconcepts;


	
	class Task implements Runnable { 
		  private int taskId; 
		  
		  public Task(int id) { this.taskId = id; } 
		  
		  public Task(String string) {
			// TODO Auto-generated constructor stub
		}

		public void run() { 
		    System.out.println("Starting task " + taskId); 
		    try { 
		      Thread.sleep(100); 
		    } 
		    catch (InterruptedException e) { 
		      e.printStackTrace(); 
		    } 
		    
		    System.out.println("Finishing task " + taskId); 
		  } 

}

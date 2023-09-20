package prj_Thread_v1;

public class Thread_v1 extends Thread {

	
	   public void run() {
	
			  System.out.println("Inside Thread-Class and in the run-method().");
	  }
	  
	  
	  
	  
	public static void main(String[] args) {
		System.out.println("Introduction Threads");

		
		
		Thread_v1 thread = new Thread_v1();
		thread.start();
		
		
		//thread.run();
		
	}

}

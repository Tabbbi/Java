package prj_Thread_v2;

public class Thread_v2 implements Runnable {

	public static void main(String[] args) {
		Thread_v2 obj = new Thread_v2();
		    Thread thread = new Thread(obj);
		    thread.start();
		    System.out.println("This code is outside of the thread");

	}

	@Override
	public void run() {
		  System.out.println("Inside Thread-Class and in the run-method()  from Runnable.");
		
	}

}

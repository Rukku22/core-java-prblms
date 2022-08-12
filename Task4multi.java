package com.techouts.project;

public class Task4multi  implements Runnable  {
	
	public void run() {
		System.out.println("runnable interface");

			try {
				
		Thread.sleep(100);
	}
	catch(InterruptedException e) {
		

	}
	
	System.out.println("runnable interface");
}
	public static void main(String[] args) {
	Task4multi t1=new Task4multi();
		Thread t2=new Thread( t1);
		t2.start();
		
 	}

}

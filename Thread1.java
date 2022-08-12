package com.techouts.project;

public class Thread1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
		   Thread.sleep(2500);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().isDaemon());

	}
}

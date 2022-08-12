package com.techouts.project;

public class Thread2 extends Thread {
	int id;
public 	Thread2(int id) {
	this.id=id;
}
	public void run() {
		try {
			Thread.sleep(3000);
		
				System.out.println("ruksana id no="+id);
		}
		catch(InterruptedException e) {
		}
	}
		}

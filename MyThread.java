package com.techouts.project;

public class MyThread extends Thread{
	String name;
	
	public MyThread(String name) {
		super();
		this.name = name;
	}

	 synchronized	public void run() {
		
 			try {
				Thread.sleep(3500);
				System.out.println("JAva is "+name);

		}
			catch(InterruptedException x ) {
				x.printStackTrace();
			}
	 }
		}
		
	



package com.techouts.project;

public class Hot extends Thread{
	String name;
	
	public Hot(String name) {
		super();
		this.name = name;
	}

	 synchronized public void run() {
		
 			try {
				Thread.sleep(2500);
				System.out.println("java is "+ name);

		}
			catch( InterruptedException x ) {
				x.printStackTrace();
			}
	}
}

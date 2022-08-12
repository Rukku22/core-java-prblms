package com.techouts.project;

public class Multi2 extends Thread{
	String name;
	

	 public Multi2(String name) {
		super();
		this.name = name;
	}


  synchronized	public  void run() {
		
 			try {
				Thread.sleep(3000);
				System.out.println("JAva is "+name);

		}
			catch(InterruptedException x ) {
				x.printStackTrace();
			}
	 }



}

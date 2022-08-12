package com.techouts.project;

import java.util.Scanner;

public class Multi1 implements Runnable {
	  
	  public void run() {
		  
		  System.out.println("umbrella");
	  
	  }
		  
	  
public static void main(String args[]) throws InterruptedException {
	Multi1 t=new Multi1();
	Thread t1=new Thread(t);
	t1.start();
	t1.join();
}
}

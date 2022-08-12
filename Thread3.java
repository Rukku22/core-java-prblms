package com.techouts.project;

public class Thread3 {
public static void main(String args[]) throws InterruptedException {
	Thread1 k=new Thread1();
	k.setName("ruksana");
	k.setDaemon( true);
	k.start();
	Thread2 th=new Thread2(5);
    

	th.start();
}

}

package com.techouts.project;

public class MultiDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		Hot t1=new Hot("hot");
		t1.start();
 		
        Multi2 t2=new Multi2("aromatic");
		t2.start();
		
		MyThread mt=new MyThread("invigorating to console window");
		mt.start();
	}

}

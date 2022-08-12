package com.techouts.project;

public class AverageThread extends Thread{
	int a=2;
	int b=3;
	double c=5;
	double d=7;
public void run() {
	System.out.println((a+b+c+d)/4);
}
}

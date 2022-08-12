package com.techouts.project;

import java.util.Scanner;

public class Addthread extends Thread{
 int a=5;
 int b=6;
public void run() {
	System.out.println(a+b);
}
}
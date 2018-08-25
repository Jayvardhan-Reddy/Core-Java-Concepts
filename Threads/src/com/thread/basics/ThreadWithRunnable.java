package com.thread.basics;

public class ThreadWithRunnable {

	public static void main(String[] args) {
		
		RunThread t = new RunThread();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("inside main metod");
	}
}

class RunThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run method");
	}
	
}
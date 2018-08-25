package com.deadlock;

public class B {

	public synchronized void d2(A a) {

		System.out.println("Thread 2 starts execution of d2() method");
		
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException ie) {
			System.out.println("Thread interrupted");
		}
		
		System.out.println("Thread 2 trying to call A's last method");
		a.last();
	}

	public synchronized void last() {

		System.out.println("Inside B, this is last() method");
	}
}

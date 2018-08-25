package com.thread.synchronize;

/*
When a thread is executing synchronized method on a given Object i.e Object level lock 
is obtained in this case, the remaining threads are not allowed to execute any synchronized
method simultaneously on the same Object . But remaining  threads are allowed to execute 
non-synchronized method simultaneously. 
*/
public class SynchronizedObjectLevelLock {

	public static void main(String[] args) {
		
		Display d = new Display();
	//	Display d1 = new Display();	// Irregular output as different object
		MyThread t1 = new MyThread(d ,"john");
		MyThread t2 = new MyThread(d ,"cena");
	//	MyThread t3 = new MyThread(d1 ,"cena");	// Irregular output as different object
		t1.start();
		t2.start();
	//	t3.start(); // Irregular output as different object
	}

}

package com.concurrent.lock;

public class ReplacingSynchronizeWithReentrantLock {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread t1 = new MyThread(d, "Rock");
		MyThread t2 = new MyThread(d, "Kane");
		t1.start();
		t2.start();
	}

}

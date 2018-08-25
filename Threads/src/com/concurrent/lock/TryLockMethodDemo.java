package com.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockMethodDemo {

	public static void main(String[] args) {

		MyTryLockThread t1 = new MyTryLockThread("First Thread");
		MyTryLockThread t2 = new MyTryLockThread("Second Thread");
		t1.start();
		t2.start();
	}

}

class MyTryLockThread extends Thread {

	static ReentrantLock l = new ReentrantLock();

	MyTryLockThread(String name) {
		super(name);
	}

	@Override
	public void run() {

		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "...got lock and performing operations");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + "...Unable to acquire lock and "
					+ "performing alternate operations");
		}
	}
}
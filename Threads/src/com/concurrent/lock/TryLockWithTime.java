package com.concurrent.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockWithTime {

	public static void main(String[] args) {
		
		MyThreadLockTime t1 = new MyThreadLockTime("First Thread");
		MyThreadLockTime t2 = new MyThreadLockTime("Second Thread");
		t1.start();
		t2.start();
	}

}

class MyThreadLockTime extends Thread {

	static ReentrantLock l = new ReentrantLock();

	MyThreadLockTime(String name) {
		super(name);
	}

	@Override
	public void run() {

		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "..got lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + "..releases lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "..Unable to get lock" + " will try again");
				}
			} catch (InterruptedException ie) {

			}
		} while (true);
	}
}
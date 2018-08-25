package com.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/*ReEntrant classs is the implemetation class of Lock interface and the direct child of Object class
It is used to obtain a lock more than once on the same thread. I increases the hold count for 
every lock aquired.
For every unlock the hold count decreases and when reaches zero the lock is released for a thread
*/

public class ReentrantDemo {

	public static void main(String[] args) {

		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();

		System.out.println(l.getHoldCount());
		System.out.println(l.isLocked());
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.getQueueLength());

		l.unlock();
		System.out.println(l.getHoldCount());
		System.out.println(l.isLocked());

		l.unlock();
		System.out.println(l.isLocked());
		System.out.println(l.isFair());
	}
}

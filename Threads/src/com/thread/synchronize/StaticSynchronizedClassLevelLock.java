package com.thread.synchronize;
/*
Every class in Java has a Unique lock which is also known as Class level Lock.
When a thread wants to execute static synchronized method then it requires class level lock.
Once it obtains the class level lock then it is allowed to execute any static synchronized method
of that class.
Once method is completed then thread releases the lock automatically.

When Class level lock is acquired  by a thread simultaneously another threads can execute 
object level lock
*/ 
public class StaticSynchronizedClassLevelLock {
	
	public static void main(String[] args) {
		
		DisplayClassLevelLock dc = new DisplayClassLevelLock();
		MyThreadNumber	mtn = new MyThreadNumber(dc);
		MyThreadCharacter	mtc	=	new MyThreadCharacter(dc);
		mtn.start();
		mtc.start();
		
	}

}

package com.thread.synchronize;

/*
If a thread gets the lock of current object then only it is allowed to execute synchronized block
3 ways to get lock
	synchronize block to lock a Object level eg : synchronize(this) {}
	synchronize block to lock a particular Object level eg : synchronize(object) {}
	synchronize block to lock a class level eg : synchronize(Classname.class) {}
	
	Diff b/w class level vs object level lock
	class level for static methods
	object level for instance methods
	
	Note : Thread can obtain more than one lock simultaneously from different objects
*/
public class SynchronizedBlock {
	
	SynchronizedObjectLevelLock sol = new SynchronizedObjectLevelLock();

	public void displayNum() {
		
		for (int i = 65; i < 71; i++) 
		{
			System.out.println("Inside Display Number block");
			synchronized (this) 
			{
				System.out.println("Inside synchronized block");
				System.out.println((char) i);
			}
		}
	}

	public void Objectspecific() {
		System.out.println("Calling synchronized block using specific object");
		synchronized(sol) {
			System.out.println("Will display bcoz called using SynchronizedObjectLevelLock Object");
		}
	}
	
	public void Classspecific() {
		System.out.println("Calling synchronized block using specific object");
		synchronized(SynchronizedBlockInstantiator.class) {
			System.out.println("Will display bcoz called using SynchronizedBlockInstantiator class" );
		}
	}
	
}

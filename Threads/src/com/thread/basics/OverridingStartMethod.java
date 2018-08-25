package com.thread.basics;
/*
On overriding start method it acts as a ordinary method and does not create any new thread 
for execution.
If u call super.start method in overriden start method then it will create new Thread
*/
public class OverridingStartMethod {

	public static void main(String[] args) {

		ThreadStartOverride t = new ThreadStartOverride();
		t.start();
		System.out.println("main thread");
	}

}

class ThreadStartOverride extends Thread{
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("Start method of Thread class is overridden");
	}
	
	@Override
	public void run() {
//		super.run();
		System.out.println("Run method");
	}
}

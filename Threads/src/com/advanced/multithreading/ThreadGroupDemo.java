package com.advanced.multithreading;

/*
 *  System thread is the parent of every thread group like Object for classes
 Finalizer, Reference Handler, Signal Dispatcher, Attach Listener etc are system level threads
 
 Thread group is a java class present in lang package and is direct child class of Object
*/

public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//Example 1
		
		/*System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());*/
		
		//Example 2
		
		/*ThreadGroup g1 = new ThreadGroup("g1");
		Thread t1 = new Thread(g1,"Thread1");
		Thread t2 = new Thread(g1,"Thread2");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1,"Thread3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());*/
		
		//Example 3
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");
		MyThread t1 = new MyThread(pg, "ChildThread1");
		MyThread t2 = new MyThread(pg, "ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
	}
}

class MyThread extends Thread {
	
	MyThread(ThreadGroup g, String name){
		super(g,name);
	}
	
	@Override
	public void run() {
		System.out.println("Child thread");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie) {
			
		}
	}
}

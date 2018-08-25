package com.thread.basics;

/*
 1-10 is the Thread priority with 10 as the highest priority
Main Thread default priority is 5 and for remaining threads priority will be inherited from Parent
*/
public class SettingThreadPriority {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(8); // Here we are changing priority of Main to 10

		MyThreadPriority t = new MyThreadPriority();
		System.out.println(t.getPriority()); // Here priority is inherited of parent Thread i.e Main Thread in this case
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
	}

}

class MyThreadPriority extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++)
			System.out.println("Child executed due to high priority");
	}
}

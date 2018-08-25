package com.thread.basics;

public class ChangeThreadName {

	public static void main(String[] args) {

		Thread t = new Thread();
		System.out.println("Before changing name for Main thread: "+t.currentThread().getName() +" "+ t.getName());
		t.setName("Crap");
		System.out.println("After changing name for Main thread: "+t.currentThread().getName() +" "+ t.getName());
		
		NameTest nt = new NameTest();
		nt.setName("Rock");
		System.out.println("Before changing name for NameTest thread: "+nt.currentThread().getName() +" "+ nt.getName());
		nt.start();
		System.out.println("End of main method");
	}

}

class NameTest extends Thread {
	
	@Override
	public void run() {
		//setName("Name Changed");
		System.out.println("After changing name for NameTest thread: "+ getName() );
	}
}
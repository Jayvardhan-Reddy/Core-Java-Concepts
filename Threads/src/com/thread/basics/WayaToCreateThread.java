package com.thread.basics;

import java.util.LinkedHashMap;
/*
The difference between by start and run method.
Start begins a new thread and executes in this example main and MyThread totally 2 threads
Run method works as a normal method i.e no new thread will be created i.e here only one thread will perfom all operations

 If we call 2 times start method for same thread then we will get illegal state exception
*/
public class WayaToCreateThread {

	public static void main(String[] args) {

		MyThread t = new MyThread();	// Instantiates a thread
		t.start(); // Statring of a Thread
		//t.run();
		for(int i=0;i<10;i++)
			System.out.println("Inside Main thread");
		t.start();
	}

}

class ByRunnableInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class MyThread extends Thread
{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Inside child thread");
	}
}
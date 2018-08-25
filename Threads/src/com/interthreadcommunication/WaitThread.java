package com.interthreadcommunication;

//This is an example of Producer - Consumer  

public class WaitThread {

	public static void main(String[] args) throws InterruptedException {

		NotifyThread nt = new NotifyThread();
		nt.start();
		synchronized (nt) {
			System.out.println("Waiting for NotifyThread to complete operation");
			nt.wait();
			System.out.println("Wait operaion is complete");
			System.out.println("The value is " + nt.sum);
		}
	}
}

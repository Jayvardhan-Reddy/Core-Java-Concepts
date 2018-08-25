package com.thread.preventthreadexecution;

/*
 If a thread doesn't want to perform any operation for a particular amount of time then sleep is used
*/
public class SleepDemo {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Inside Main Thread");
			Thread.sleep(2000);
		}
	}

}

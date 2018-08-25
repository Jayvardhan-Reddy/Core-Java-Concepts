package com.thread.preventthreadexecution;

/*
 A Thread can be intterupted when it is in either sleep or wait state
 * */
public class InterruptDemo {

	public static void main(String[] args) {

		GettingInterruptDemo gi = new GettingInterruptDemo();
		gi.start();
		gi.interrupt();
		System.out.println("End of main method");
	}

}

class GettingInterruptDemo extends Thread {

	public void run() {
		
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Inside Main Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Inside GettingInterruptDemo catch block");
		}
	}
}

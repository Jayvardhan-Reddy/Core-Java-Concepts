package com.thread.synchronize;

public class DisplayClassLevelLock {

	public static synchronized void displaynum() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

	public static synchronized void displaychar() {
		for (int i = 65; i < 69; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	
}

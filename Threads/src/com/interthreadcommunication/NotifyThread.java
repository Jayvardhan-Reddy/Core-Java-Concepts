package com.interthreadcommunication;

public class NotifyThread extends Thread {

	int sum = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				sum = i + sum;
			}
			System.out.println("Operation inside notify method compeleted and seding notification");
			this.notify();
		}
	}
}

package com.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

 class Display {

	ReentrantLock l = new ReentrantLock();
	
	public void wishname(String name) {
		
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("the name is ");
			try {
				Thread.sleep(1000);
				System.out.print(name + "\n");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		l.unlock();
	}
}

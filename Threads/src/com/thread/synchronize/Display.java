package com.thread.synchronize;

public class Display {

	public synchronized void wishname(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.print("the name is ");
			try {
				Thread.sleep(150);
				System.out.print(name + "\n");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

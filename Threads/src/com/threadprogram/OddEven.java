package com.threadprogram;

public class OddEven {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("Creep");
		t1.start();
		t2.setName("Knock");
		t2.start();
		
	}
}

class MyThread extends Thread {
	public static Object lock = new Object();

	@Override
	public void run() {
		even();
		odd();
	}

	public void even() {
		synchronized (lock) {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					try {
						System.out.println("Thread-1 even " + i);
						lock.wait();
						lock.notifyAll();
						wait();
					} catch (InterruptedException e) {
						System.out.println("Inside even catch");
						e.printStackTrace();
					}
				}

			}
		}
	}

	public void odd() {
		synchronized (lock) {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 != 0) {
					System.out.println("Thread-2 odd  " + i);
					try {
						lock.notifyAll();
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("Inside even catch");
						e.printStackTrace();
					}
				}

			}
		}
	}
}

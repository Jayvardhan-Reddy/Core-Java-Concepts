package com.thread.preventthreadexecution;

//DeadLock situation created

public class JoinToExecuteMainFirst {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setName("----------------Main Thread-------------");
		JoinPaused.mainThreadReference = Thread.currentThread();
		JoinPaused jp = new JoinPaused();
		jp.start();
		 jp.join();
		for (int i = 0; i < 3; i++)
			System.out.println("Inside Main Thread");
	}

}

class JoinPaused extends Thread {

	static Thread mainThreadReference;

	@Override
	public void run() {
		try {
			currentThread().setName("-------------Child Thread--------");
			mainThreadReference.join();	//Use time to parameter to resume execution as normal prog
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 3; i++)
			System.out.println("Inside Child Thread");
	}
}
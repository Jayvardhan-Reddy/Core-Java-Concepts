package com.thread.preventthreadexecution;
/*
When one Thread requires output of other thread as input to perform operation then we make use
of Join
Every Join method throws InterruptedException
*/

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		JoinTriggered jt = new JoinTriggered();
		jt.start();
		jt.join();
		for(int i=0;i<4;i++)
			System.out.println("Inside main thread");
	}

}

class JoinTriggered extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Inside child Thread");
			try {
				sleep(200);
			}
			catch(InterruptedException e) {
				System.out.println("Inside excception");
			}
		}
	}
}
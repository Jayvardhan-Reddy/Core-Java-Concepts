package com.thread.preventthreadexecution;
/*
 Here child thread calls yeild method ,
due to this main thread will execute more no of times
Ex: A person making call via telephone booth for a long time
*/ 
public class YeildDemo {

	public static void main(String[] args) {
		
		YeildWait y = new YeildWait();
		y.start();
		for(int i=0;i<5;i++)
			System.out.println("The Main method is executing due to yeild ");
	}

}

class YeildWait extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Child Thread");
			yield();
		}
	}

}
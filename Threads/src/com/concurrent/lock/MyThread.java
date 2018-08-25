package com.concurrent.lock;

public class MyThread extends Thread{

	String name;
	Display d;
	
	MyThread(Display d,String name){
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wishname(name);
	}
}

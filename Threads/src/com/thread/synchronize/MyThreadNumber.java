package com.thread.synchronize;

public class MyThreadNumber extends Thread {

	DisplayClassLevelLock dcl;

	MyThreadNumber(DisplayClassLevelLock dcl)
	{
		this.dcl =dcl;
	}
	
	@Override
	public void run() {
		dcl.displaynum();
	}
}

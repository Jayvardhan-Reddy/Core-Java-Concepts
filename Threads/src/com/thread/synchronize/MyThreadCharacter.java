package com.thread.synchronize;

public class MyThreadCharacter extends Thread {

	DisplayClassLevelLock dcl;

	MyThreadCharacter(DisplayClassLevelLock dcl)
	{
		this.dcl =dcl;
	}

	@Override
	public void run() {
		dcl.displaychar();
	}
}

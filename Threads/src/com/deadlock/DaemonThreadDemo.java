package com.deadlock;

/*	
 * All Background process or threads running are daemon threads 
	By default main method is always non-daemon thread and is instantiated by JVM.
	Once the last non-daemon thread terminates the daemon thread also terminates
*/

public class DaemonThreadDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());
		MyThread t = new MyThread();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		t.start();
		System.out.println("End of main thread");
	}

}

class MyThread extends Thread	{
	
	@Override
	public void run() {

		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
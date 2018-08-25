package com.threadpool.multithreading;

class CustomerThread extends Thread	{
	
	static Integer custId = 0;
	private static ThreadLocal t  = new ThreadLocal<Integer>()
			{
				protected Integer initialValue()
				{
					return ++custId;
				}
			};
			CustomerThread(String name)
			{
				super(name);
			}
			@Override
			public void run() {
				
				System.out.println(Thread.currentThread().getName() 
						+ "  Executing with customer id " + t.get());
			}
}



public class ThreadLocalDemo1 {

	public static void main(String[] args) {

		CustomerThread c1 = new CustomerThread("Customer Thread-1");
		CustomerThread c2 = new CustomerThread("Customer Thread-2");
		CustomerThread c3 = new CustomerThread("Customer Thread-3");
		CustomerThread c4 = new CustomerThread("Customer Thread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}

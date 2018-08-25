package com.threadpool.multithreading;

/*
ThreadLocal class provides thread local variables, Thread local class maintains values per Thread basis
Each Thread local Object maintains a separate value like userId, transactionId, etc.. for each
thread that accesses that Object.
Thread can access it's local value and can manipulate it's value and even remove it's value
In every part of the code which is executed by the thread acts as its local variable.
Threadlocal can be associated with thread scope. total code executed by the thread has access to the
corresponding variables.
Once the thread is dead, all it's local variable are eligible for garbage collection.
eg to create Thread local variable
ThreadLocal t = new ThreadLocal<>();
*/

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		ThreadLocal t = new ThreadLocal()
		{									// 	Anonymous Inner class to set default value of - 
			public Object initialValue()	// - Thread local variable
			{
				return "kane";
				}
		};
		System.out.println(t.get());	// Default value of threadlocal variable
		t.set("Rock");
		System.out.println(t.get()); 	// After setting value to ThreadLocal
		t.remove();
		System.out.println(t.get()); 	//	it will internally call default value i.e null
	}
}

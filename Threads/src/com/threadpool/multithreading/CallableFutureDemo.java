package com.threadpool.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*In the case of runnable job Thread will not return anything after completing the job.abstract
 If a thread is required to give some result aftr execution hen we shud go for callable
Callable interface contains only one method "public object call() throws Exception"
*/

class MyCallable implements Callable
{
	int num;
	public MyCallable(int num) {
		this.num = num;
	}
	@Override
	public Object call() throws Exception {
System.out.println(Thread.currentThread().getName()+ " is...."
		+ " responsible to find sum of first "+ num + "numbers");
	int sum = 0;
	for(int i=0; i<=num;i++) {
		sum = sum + i;
	}
	return sum;
	}
}

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] jobs = { 
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50)
		};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable job:jobs) {
			Future f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}

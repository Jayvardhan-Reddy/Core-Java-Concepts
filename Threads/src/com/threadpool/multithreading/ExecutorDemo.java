package com.threadpool.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*ThreadPool is a already created pool of threads ready to do our job. Java 1.5 v introduces
threadpool framework to implement threadpool. Threadpooll framework also known as Executor framework
*/

public class ExecutorDemo {

	public static void main(String[] args) {

		PrintJob[] jobs = { new PrintJob("rock"), new PrintJob("kane"), new PrintJob("undertaker"),
				new PrintJob("Triple H"), new PrintJob("rikishi"), new PrintJob("momoto") };

		ExecutorService service = Executors.newFixedThreadPool(3); // no of threads created are 3 as part of the pool

		for(PrintJob job:jobs) {
			service.execute(job);
		}
		service.shutdown();
	}

}

class PrintJob implements Runnable {

	private String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name + "...Job started by Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "....Job completed by Thread: " + Thread.currentThread().getName());

	}

}
package com.threadpool.multithreading;

/*To access value of the parent thread by using child thread
Parent threads threadlocal variable by default not available to the child thread. If we want
to make parent threads threadlocal value available to the child thread then we should go for 
InheritableThreadLocal class.
By default child thread val is exactly same as parent threads val, but we can provide customized 
val to child thread by overriding chil val method
*/

class ParentThread extends Thread {
	public static InheritableThreadLocal tl = new InheritableThreadLocal<>() {
		public Object childValue(Object p) {
			return "CC";
		}
	};

	@Override
	public void run() {

		tl.set("pp");
		System.out.println("Parent thread Value---" + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread value----" + ParentThread.tl.get());
	}
}

public class InheritableThreadLocalDemo {

	public static void main(String[] args) {

		ParentThread pt = new ParentThread();
		pt.start();
	}

}

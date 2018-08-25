package oops;

public class Overloadingconc {

	 void disp()
	{
		System.out.println("in parent calss");
	}
	 public static void main(String[] args) {
		System.out.println("main as req");
	}
}
class Child extends Overloadingconc
{
	public void disp(){
	}
	public static void main(String[] args) {
		Overloadingconc oc = new Overloadingconc();
		oc.disp();
	}
}

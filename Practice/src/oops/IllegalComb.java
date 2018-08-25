package oops;

public abstract class IllegalComb {

	 final static int a =10; //varaiable combination of final and volatile is illegal comb
	 
	 abstract  void disp(); //abstract method combination with final ,static,strictfp,native,synchronized,private are illigal
	 public void disp2()
	 {
		 System.out.println("abstract method");
	 }
	public static void main(String[] args) {
		System.out.println();
	}
}

class Imps extends IllegalComb
{
	void  disp()
	{
		System.out.println("implemented abstract disp");
	}
}

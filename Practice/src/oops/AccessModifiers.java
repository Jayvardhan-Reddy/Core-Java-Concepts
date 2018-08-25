package oops;

public class AccessModifiers {

	
public static abstract	interface A
	{
		public static void disp()
		{
			System.out.println(" interface inside a class can have the following access modifier /n");
			System.out.println("public,private,protected,static,abstract");
		}
	}
public static void main(String[] args) {
	System.out.println("Inside main method");
	AccessModifiers am = new AccessModifiers();
	//am.disp();
}
}

interface outside 
{
	interface out
	{
		public default void dispoutint()
		{
			System.out.println("interface inside interface are public and static");
		}
	}
}

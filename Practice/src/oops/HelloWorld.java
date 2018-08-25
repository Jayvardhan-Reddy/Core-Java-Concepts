package oops;

public class HelloWorld {
	private static boolean  a = true;
	private String crap= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	String	name = "sabj";
	System.out.println(a);
	a = true;
	//crap = "mock";
	HelloWorld hw = new HelloWorld();
	hw.disp();
	}
public void disp() {
	a= false;
	System.out.println(a);
}
}

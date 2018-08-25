package oops;

public class MainTest {

	static {
		System.out.println("in the static block ");
	}

	public static void main(String[] args) {

		System.out.println("in main");
		HelloWorld hw = new HelloWorld();
		Object hw1 = new HelloWorld();
		hw.disp();
		// HelloWorld.a;
		hw1 = null;
		try {
		if((boolean) hw1) {
			System.out.println("eded");
		}
		System.out.println("aftr try");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("inside catch");
		}
	

	}
}

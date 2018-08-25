package introduction.exception;

public class IllegalThreadStateExceptionType {

	public static void main(String[] args) {

		Thread t = new Thread();
		t.start();
		t.start();	// Exception in thread "main" java.lang.IllegalThreadStateException
	}

}

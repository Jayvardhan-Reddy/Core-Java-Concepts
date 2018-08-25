package introduction.exception;

public class IllegalTypeExceptionType {

	public static void main(String[] args) {

		Thread t = new Thread();
		t.setPriority(5);
		t.setPriority(15);	// Exception in thread "main" java.lang.IllegalArgumentException
	}

}

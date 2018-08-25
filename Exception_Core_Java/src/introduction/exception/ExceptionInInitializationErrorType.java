package introduction.exception;

public class ExceptionInInitializationErrorType {

	//static int x = 1/0;	// Exception in thread "main" java.lang.ExceptionInInitializerError
	
	static {
		String s = null;
		System.out.println(s.length());	// Exception in thread "main" java.lang.ExceptionInInitializerError
	}
	
	public static void main(String[] args) {
		
	}

}

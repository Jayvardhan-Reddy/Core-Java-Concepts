package introduction.exception;

public class NumberFormatExceptionType {

	public static void main(String[] args) {

		int x = Integer.parseInt("20");	//Integer value so executes fine
		int i = Integer.parseInt("wrong type");	// Exception in thread "main" java.lang.NumberFormatException: For input string: "wrong type"
	}

}

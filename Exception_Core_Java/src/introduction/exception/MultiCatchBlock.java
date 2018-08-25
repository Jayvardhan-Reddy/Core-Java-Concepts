package introduction.exception;

import java.io.IOException;

public class MultiCatchBlock {

	public static void main(String[] args) {

		try {
			//int a  = 10/0;
			String s = null;
			s.length();
			System.out.println("Inside try block");
		}
		//Parent-Child relation not possible in Multicatch block
		catch (ArithmeticException | NullPointerException e) {	// Multiple Catch declaration

			System.out.println(e);
		}
	}

}

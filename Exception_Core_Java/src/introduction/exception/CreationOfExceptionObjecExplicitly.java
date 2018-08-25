package introduction.exception;

//Throw keyword is used to Hand over the Object to the JVM explicitly
//Best use of throw keyword is for User defined or Customized exceptions

public class CreationOfExceptionObjecExplicitly {

	public static void main(String[] args) {

		// ExcpetionNPE(); //Case 1
		// ExcpetionAE(); //Case 2
		throw new ArithmeticException("Customised exception");
	}

	// Case1 : Throw e, if e refers null then we will get Null pointer
	// exception(NPE)
	static ArithmeticException e; // Here the reference value of e is null

	public static void ExcpetionNPE() {
		System.out.println("We will get Null pointer exception as static assignment value is null");
		throw e;
	}

	// case 2: Throw e1, throws arithmetic exception
	static ArithmeticException e1 = new ArithmeticException(); // Here the reference value of e is null

	public static void ExcpetionAE() {
		System.out.println("We will get Arithmetic exception as static value is creating Object and assigned to e1");
		throw e1;
	}

	// case 3: Cannot wirte statements after throw keyword, we will get compile time
	// exception
	public static void ExcpetionCompileTime() {
		System.out.println("Knock knock");
		throw e1;
		// System.out.println("Unreachable code CE error ");
	}

	// Case 4: Can throw only for Throwable type and not Objects
	public static void ExcpetionOnlyThrowableTypes() {
		System.out.println("We cannot throw Object so we get compile tie error");
		throw new CreationOfExceptionObjecExplicitly(); // No exception of type CreationOfExceptionObjecExplicitly can
														// be thrown; an exception type must be a subclass of Throwable
	}

}

// Case 5 : We create a class as subclass of Runtime exception which is valid
class SubClassType extends RuntimeException {

	public static void main(String[] args) {
		System.out.println("Exception in thread \"main\" introduction.exception.SubClassType");
		throw new SubClassType();
	}

}
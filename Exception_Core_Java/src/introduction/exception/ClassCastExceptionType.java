package introduction.exception;

public class ClassCastExceptionType {

	public static void main(String[] args) {

		Object o = new Object();
		String s = (String)o;	//Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.Object cannot be cast to java.base/java.lang.String
								//at introduction.exception.ClassCastExceptionType.main(ClassCastExceptionType.java:8)
		
		Object o1 = new String();
		String s1 = (String)o1;
		
		/*Object o2 = new String(); //Compile time error
		String s2 = (Object)o2;*/
		
		String o3 = new String();
		Object s3 = (Object)o3;
	}

}

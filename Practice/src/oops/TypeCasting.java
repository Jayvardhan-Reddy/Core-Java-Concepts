package oops;

//Parent refernece type can be used to hold child object
public class TypeCasting {

	public static void main(String[] args) {
		String s = new String("Rock");
		
		// 1. Can be casted to parent type that is Object in place of String
		Object o = (Object)s; 
		System.out.println("Typecasted value from string to Object is "+ o);
//2. Cannot cast to a different type without Parent-Child relation i.e Integer and String : RE
		Integer i = (Integer)o; //Runtime objec is String type
	 //3. Cannot cast using child that is char in place of String : CE error
//		char c = (char)s;
	}

}

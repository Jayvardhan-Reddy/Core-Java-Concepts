package Archive_service;

/*Final vs Immutable
Final applicable for variable and not for Object
Immutable applicable for Object and not for variable*/


public class Final_VS_Immutable {

	public static void main(String[] args) {

		final StringBuffer sb = new StringBuffer("Knock");
		sb.append("_Working");	//Can Append the value but not assign to it
		System.out.println(sb);
	//	sb = new StringBuffer("Cannot assign to final variable");	//Cannot perform assignment to reference variable
	}

}

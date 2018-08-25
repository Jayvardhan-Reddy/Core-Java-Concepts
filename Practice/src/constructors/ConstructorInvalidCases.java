package constructors;

import java.io.IOException;

//Recurrsive call to constructor cannot be made, it will throw compile time exception Recurrsive constructor invocation
public class ConstructorInvalidCases {

	//Case 1
	/*ConstructorInvalidCases(){
		this(0);
	}
	
ConstructorInvalidCases(int i){
		this();
	}*/
	
	//Case 2
	/*ConstructorInvalidCases(String i){
		
	}*/
	
	//Case 3
	//Default constructor cannot handle exception type IOException thrown by implicit super constructor. Must define an explicit constructor
	ConstructorInvalidCases() throws IOException{
	}
} 

//Implicit super constructor ConstructorInvalidCases() is undefined for default constructor. Must define an explicit constructor
class ChildConstructorInvalidCases extends ConstructorInvalidCases {
	
	//Case 2
	//Implicit super constructor ConstructorInvalidCases() is undefined. Must explicitly invoke another constructor
	/*ChildConstructorInvalidCases(int i){
	//	super("s");	// uncommen u will not get compile time error
	}*/
	
	
	//Case 3 
	//We cannot use try catch blcok as the first statement of constructor shud be super()  
	ChildConstructorInvalidCases() throws IOException,Exception {
		super();
	}
	
}
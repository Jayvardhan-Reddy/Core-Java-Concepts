package constructors;

//Constructor is used to initialize an Object and not to create it
//Other than initializing the Object if we want to perform any other activities for every object we use instance block 
//eg for instance block: To update DB for every object
//Both Constructor and Instance block will be executed for every Object creation but instance block is first followed by constructor next
//The only applicable modifiers for constructor is public, private, protected, default
// Compiler is responsible for executing Constructor and not JVM 
//Constructor is not applicable for Interface bcoz every variable is static in interface

public class ConstructorTest {

	static int count=0;
	{	
		count++;
		System.out.println("Count no of objects " + count);
	}
	
	ConstructorTest()
	{
	//	super(); // The first line of constructor must be super or this else we will get compile time error
		System.out.println("inside consructor");
	}
	
	ConstructorTest(int i)
	{
	//	this(); // The first line of constructor must be super or this else we will get compile time error
		System.out.println("inside consructor " + i);
	//	super(); // compile time error
	}
	
	public void msg()
	{
	//	super(); // super can be only used in constructor
		System.out.println("Inside msg method");
	}
	public static void main(String[] args) {
		ConstructorTest ct = new ConstructorTest(10);
		ConstructorTest ct1 = new ConstructorTest();
		
	}
}

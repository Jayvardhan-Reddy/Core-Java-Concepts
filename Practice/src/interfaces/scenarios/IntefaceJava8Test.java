package interfaces.scenarios;

public class IntefaceJava8Test implements InterfaceWithImplementation_Java_8{

	public static void main(String[] args) {
		
		IntefaceJava8Test ijt = new IntefaceJava8Test();
		ijt.display();  // Default implementation done inside interface using "default" keyword
	}

	@Override
	public void add() {
		System.out.println("Implementing add method");
		
	}

}

package interfaces.scenarios;

public interface InterfaceWithImplementation_Java_8 {

	public void add();
	
	default void display() {
		System.out.println("Default keyword introduced in JAVA-8, allows implementation inside Interface");
	}
}

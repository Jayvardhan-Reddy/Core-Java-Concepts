package introduction.exception;

//Final is a variable applicable for class, method and variable
/*If class is final then we cannot do inheritance
If a method is final then we cannot perform Overriding
If variable is final then we cant perform reassignment for it*/

/*Finally:
Finally block is always assciated with try catch to maintain clean up code
It will be executed always irrespective of whether exception is raised or not, whether handled or not handled
Clean up related to try block
*/

/*Finalize() - method
finallise method is called by garbage collector just before destroying the object to perform clean up activities.
Once the finalize method is execued immediatly destroys that Object
Clean up activities related to Object i.e whatever resources allocated with Object will be deallocated before destroying an Object by
using Finallize method
*/

public final class FinalModifier { // Cannot be Inherited

	final int i = 9; // Value cannot be Changed

	public static void main(String[] args) {

		try {
			System.out.println("Risky code Implementation");
		} catch (Exception e) {

			System.out.println("Handling code");
		} finally {
			System.out.println("Clean up code");
		}

	}

	public final void msg() { // Cannot be Overriden
		System.out.println("Inside FinalModifier");
	}
}

class ChildModifier extends FinalModifier { // Cannot be Inherited final class type

	public final void msg() { // Cannot be Overriden
		System.out.println("Inside FinalModifier");
	}
}

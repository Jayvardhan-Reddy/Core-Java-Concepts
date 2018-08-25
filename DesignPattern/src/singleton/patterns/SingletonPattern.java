package singleton.patterns;

/* 
For any java class if we allowed to create only one Object such type of class is called Singleton Class eg: Runtime, Business Delegate, Service Locator etc..
Advantage of Singleton Class
If several ppl have same requirement then it's not recommended to create a separate object for every requirement.We have to create
only one Object and we can reuse same Object for every similar requirement. So that performance and memory utilization will be improved.

Singleton class Objects we can creae Using Factory method Runtime r1  =  Runtime.getruntime();

TO CREATE SINGLETON
We hav to use private Constructor and private static variiable and public Factory method
Runtime class is implemented by using below approach.
*/

//Method 1 to create Singleton 
public class SingletonPattern {

	private static SingletonPattern sp = new SingletonPattern();

	private SingletonPattern() {

	}

	public static SingletonPattern getSingletonPattern() {
		return sp;
	}

}

class CallingSingletonPattern {
	SingletonPattern sp1 = SingletonPattern.getSingletonPattern(); // Singleton approach
}

// Method 2 to Create singleton

// At any point of time we can create only one object for SingletonPattern,
// hence this is Singleton class
/*
 * public class SingletonPattern {
 * 
 * private static SingletonPattern sp = null;
 * 
 * private SingletonPattern() {
 * 
 * }
 * 
 * public static SingletonPattern getSingletonPattern() { if(sp == null) sp =
 * new SingletonPattern(); return sp; }
 * 
 * }
 */

// Class is not Final but we are not allowed to create child classes. how can we
// do it?
// Declare every constructor as private
/*
 * class Parent { private Parent() {
 * 
 * } }
 * 
 * class Child extends Parent { child(){
 * 
 * } }
 */
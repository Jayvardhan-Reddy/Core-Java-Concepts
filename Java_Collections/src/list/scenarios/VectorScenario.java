package list.scenarios;

import java.util.Vector;

//new capacity = 2* old capacity	
public class VectorScenario {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("Default initial capacity is: " + v.capacity());
		for(int i=0;i<10;i++)
			v.addElement(i);;
		System.out.println("Capacity after adding 10 elements: " + v.capacity());
		v.addElement(12);
		System.out.println("After exceeding initial capacity is: " + v.capacity());
		System.out.println("Vector values are: "+ v);
	}
}

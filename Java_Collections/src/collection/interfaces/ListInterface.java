package collection.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		l.add(100);
		l.add(20);
		l.add(30);
		System.out.println("Arraylist values for add collection is: " + l.toString());

		List cl = new ArrayList<>();
		cl.add(50);
		cl.add(60);
		cl.add(45);
		cl.add(70);
		
		cl.add(4,10);
		cl.addAll(3, l);
		cl.add(9);
		cl.add(50);
		System.out.println("Get value of arraylist : "+ cl.get(3));
	
		System.out.println("Set value of arraylist : "+ cl.set(4, 50));
		System.out.println("last index value of 50 arraylist : "+ cl.lastIndexOf(50));
		
		Iterator i =  cl.iterator();
		System.out.print("Iterator values of arraylist cl is:");
		while(i.hasNext()) {
			System.out.print(" "+i.next());
		}
		
	}

}

package collection.interfaces;

import java.util.ArrayList;
import java.util.List;

// Does not contain any retrieve method like get in collection interface
public class CollectionInterfaceMethods {

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

		l.addAll(cl);
		System.out.println("Arraylist values for add all collection is: " + l.toString());

		l.remove(3);
		System.out.println("Arraylist values for removed object of index 3 is: " + l.toString());

		l.removeAll(cl);
		System.out.println("Arraylist values for remove all object from collection cl is: " + l.toString());

		l.addAll(cl);
		l.retainAll(cl);
		System.out.println("Arraylist values retaining object values from collection cl is: " + l.toString());

		System.out.println("Arraylist Containing bject values of a key: " + l.contains(70));
		System.out.println("Arraylist Containing bject values from collection cl is: " + l.contains(cl));

		System.out.println("To chk if arraylist is empty: " + l.isEmpty());

		System.out.println("To chk if arraylist size: " + l.size());
		// Object b[] = (Object[]) l.toArray(l);

		Object[] a = new Integer[l.size()];
		a = (Object[]) l.toArray();

		System.out.println("Coneverted value to array is " + a[0]);
	}

}

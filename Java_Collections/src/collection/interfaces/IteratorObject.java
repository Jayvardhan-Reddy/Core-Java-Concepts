package collection.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*Every collection class implements the iterator, List Iterator and enumerable within itself
as anonymous innerclass or as inner classes. Check the internal implementation of eg: ArrayList
In the below example, u can see the class frm wic we r getting iterator object.
Not: Iterator is a interface
*/


public class IteratorObject {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		Iterator i = l.iterator();
		ListIterator li = l.listIterator();
		
		System.out.println("Iterator class name is: " + i.getClass().getName());
		System.out.println("ListIterator class name is: " + li.getClass().getName());
		
	}

}

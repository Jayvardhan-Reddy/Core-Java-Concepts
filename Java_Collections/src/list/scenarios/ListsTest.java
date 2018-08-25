package list.scenarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {

	public static void main(String args[]) {
		int count = 10000000;
		List arrayList = new ArrayList();
		long time = addElements(arrayList, count);
		System.out.println("ArrayList with " + count + " elements: " + time + " ms.");
		List linkedList = new LinkedList();
		time = addElements(linkedList, count);
		System.out.println("LinkedList with " + count + " elements: " + time + " ms.");
		Collection c;
	}

	private static long addElements(List list, int number) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < number; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
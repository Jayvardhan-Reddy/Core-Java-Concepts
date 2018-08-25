package list.scenarios;

import java.util.LinkedList;

//Used if more no of operations performed on object is to add or delete and not retrieve.
// Used to develop Queue and Stack by using LinkedList methods addFirst, addLAst, RemoveFirst, removeLast
//Reserve, default capacity, initial capacity not applicable for this
public class LinkedListScenario {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		for(int i=0; i<10;i++)
			ll.add(i);
		System.out.println("Linked list values are: " +ll);
		ll.remove(3);
		ll.addLast(null);
		ll.set(2, "Crap");
		System.out.println("Post new operations: " + ll);
		
	}

}

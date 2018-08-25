package list.scenarios;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorScenario {

	public static void main(String[] args) {

		List l = new LinkedList<>();
		l.add("creep");
		l.add("shock");
		l.add("rock");
		l.add("Kane");
		
		System.out.println("Linked list values are: " + l);
		
		ListIterator li = l.listIterator();
		System.out.println("Iterator object derived from class " + li.getClass().getName());
		while(li.hasNext())
		{
			String s = (String)li.next();
			if(s.equals("rock"))
				li.remove();
			else if(s.equals("shock"))
				li.add("meep");
			else if(s.equals("creep"))
				li.set("knock");
			/*if(li.next().equals("rock"))
				System.out.println("inside list iterator");
			else if(li.next().equals("shock"))
				li.add("pain");
			else if(li.next().equals("Kane"))
				li.set("Knock");*/
		}
		
		System.out.println("Finall value after iteration modification is: " + l);
	}

}

package list.scenarios;

import java.util.Stack;

public class StackScenario {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(20);
		s.push(50);
		s.push(550);
		s.push(50);
		System.out.println(s);
		System.out.println("Size is = "+ s.size() +" Capacity is = " + s.capacity());
		System.out.println(s.search(50));
		System.out.println(s.search(80));
	}
}

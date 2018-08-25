package hashmap.scenarios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
write a class .. say Employee... and add it in hashmap... Employee object should be uniquely identify by it's id...
if already that object is present then update it and if not there then add it in hashmap*/


public class CustomHashMapEqualsHashCode {
	
	public static void main(String[] args) {
		HashMap<Employee, String> hm = new HashMap<>();
		Employee e1 = new Employee("Rock", "23");
		Employee e2 = new Employee("Kane", "24");
		Employee e3 = new Employee("Kenschen Rock", "23");
		Employee e4 = new Employee("Rock", "23");
		
		hm.put(e1, "Creep");
		hm.put(e2, "Sheep");
		hm.put(e3, "meep");
		hm.put(e4, "knock");
		
		Set<Entry<Employee, String>> i = hm.entrySet();
		Iterator it = i.iterator();
		while(it.hasNext()) {
			System.out.println("The values of hasmap are " + it.next());
		}
		
		
	}

}

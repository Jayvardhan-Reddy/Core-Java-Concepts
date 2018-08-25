package set.scenarios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

// HashSet Internally uses Hashmap 
/*Stores value given for set as key for Map and value for Map is a constant vlaue i.e a private static final Object PRESENT = new Object(); is stored
		Only one null value can be added at the begining and if added in between or more than once throws null pointer
		public boolean add(E e) {
			   return map.put(e, PRESENT)==null;
			}
			You cannot retrieve the value using get method. Only iteration is possible
			 public Iterator<E> iterator() {
        return map.keySet().iterator();	//Returns key on iterating that is the value of set wic is stored as key in HashMap
    }
*/

public class HashSetImpl {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		LinkedHashSet lhs;
		//hs.add(null);
		hs.add("Size");
		hs.add("Check");
		hs.add("Duplicate not allowed");
		hs.add("Duplicate not allowed");
		hs.add(null);
		Iterator iterSet = hs.iterator();
			while(iterSet.hasNext()) {
				System.out.println(iterSet.next());
			}
	}

}

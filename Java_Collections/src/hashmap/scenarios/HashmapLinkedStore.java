package hashmap.scenarios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapLinkedStore {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		hm.put("Tik", "Tok");	//forms a linked list
		hm.put("Tiko", "Toks");
		hm.put("Tik", "Tokr");
		hm.put("kit", "Tokr");	//forms a linked list
		
		 Set<Entry<String, String>> s = hm.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		 
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return 10;
	}
}

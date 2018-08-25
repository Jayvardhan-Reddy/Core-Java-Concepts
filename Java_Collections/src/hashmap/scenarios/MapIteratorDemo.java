package hashmap.scenarios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteratorDemo {

	public static void main(String[] args) {

		Map m = new HashMap();
		m.put(1, "Knock");
		m.put(2, "Knock");
		/*Iterator i = m.entrySet().iterator();
		while(i.hasNext()) {
			//m.put(3, "Fast-Fail");
			Map.Entry entry = (Entry) i.next();
			System.out.println(entry.getValue());
		}*/
		/*for (Map.Entry entry :  m.entrySet().iterator()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}*/
	}

}

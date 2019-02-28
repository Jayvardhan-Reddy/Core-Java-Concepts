package collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapOrder {

	public static void main(String[] args) {

		LinkedHashMap<String, String> testMap = new LinkedHashMap<>();
		    testMap.put("1", "One");
		    testMap.put("2", "Two");
		    testMap.put("3", "Three");
		    testMap.put("4", "Four");

		    int indexOfFourtyFour = -1;
		    System.out.println("Test Map before :: " + testMap);

		    Iterator<Entry<String, String>> itr = testMap.entrySet().iterator();
		    int index = 0;
		    while (itr.hasNext()) {
		        Map.Entry<String, String> entry = (Map.Entry<String, String>) itr.next();
		        if (entry.getKey().equals("3")) {
		            itr.remove();
		            indexOfFourtyFour = index;
		        }
		        index ++;
		    }
		    if (indexOfFourtyFour > -1) {
		        add(testMap, indexOfFourtyFour, "44", "FourFour");
		    }
		    System.out.println("Test Map after :: " + testMap);
		}

		public static <K, V> void add(Map<K, V> map, int index, K key, V value) {

		    int i = 0;
		    List<Entry<K, V>> rest = new ArrayList<Entry<K, V>>();
		    for (Entry<K, V> entry : map.entrySet()) {
		        if (i++ >= index) {
		            rest.add(entry);
		        }
		    }
		    map.put(key, value);
		    for (int j = 0; j < rest.size(); j++) {
		        Entry<K, V> entry = rest.get(j);
		        map.remove(entry.getKey());
		        map.put(entry.getKey(), entry.getValue());
		    }
	
	
}
}

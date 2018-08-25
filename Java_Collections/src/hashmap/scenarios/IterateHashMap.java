package hashmap.scenarios;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class IterateHashMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key24", "value2");
		map.put(null, null);
		map.put("key32", "value2");
		map.put(null, null);
		for (Map.Entry<String, String> entry : map.entrySet()) {
			/*int nbThreads =  Thread.getAllStackTraces().keySet().size();	// To get no of threads running
			System.out.println(nbThreads);*/
			
			int nbRunning = 0;
			for (Thread t : Thread.getAllStackTraces().keySet()) {
			    if (t.getState()==Thread.State.RUNNABLE) nbRunning++;
			}
			System.out.println("no of current threads runng is " + nbRunning);
			
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		HashSet hs = new HashSet<>();
		hs.addAll(map.entrySet());
		System.out.println("Hashset vales are " + hs.toString());
		ConcurrentHashMap  chm;
		Hashtable ht;
	}
}
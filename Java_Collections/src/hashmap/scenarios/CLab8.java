package hashmap.scenarios;
import java.util.*;
public class CLab8 {
public static void main(String[] args)
{
Map map1 = new LinkedHashMap();
System.out.println(map1);
System.out.println(map1.isEmpty());
System.out.println(map1.size());
map1.put("SID", new Integer(99));
map1.put("SNAME", "Dharmendra");
map1.put("Email", "dk@jlc.com");
map1.put("Email", "dharmendra@gmail.com");
map1.put("Phone", new Long(998765432));
map1.put("CITY1", "Samastipur");
map1.put("CITY2", "Samastipur");
map1.put("FEE", new Double(9999.0));

System.out.println(map1);
System.out.println(map1.isEmpty());
System.out.println(map1.size());

System.out.println("*Verifying Keys**");
System.out.println(map1.containsKey("SID"));
System.out.println(map1.containsKey("PIN"));

System.out.println("*Verifying Values**");
System.out.println(map1.containsValue("Dharmendra"));
System.out.println(map1.containsValue(new Long(998765432)));
System.out.println(map1.containsValue(new Integer(848131)));

System.out.println("*equals() and remove()**");
Map map2= new HashMap(map1);
System.out.println(map1);
System.out.println(map2);
System.out.println(map1.equals(map2));
System.out.println(map2.remove("CITY2"));
System.out.println(map2.remove("PIN"));
System.out.println(map1.equals(map2));

System.out.println("*get()**");
System.out.println(map1.get("PIN"));
System.out.println(map1.get("SNAME"));


System.out.println("*All Values**");
 Collection col=map1.values();
 System.out.println(col);
 for(Object ob:col)
	 System.out.println(ob);
 
 System.out.println("*All Keys**");
  Set keys=map1.keySet();
  System.out.println(keys);
  for(Object ob:keys)
		 System.out.println(ob);
 System.out.println("*All Key-Value using keySet()**");
 Set keys1=map1.keySet();
 Iterator it = keys1.iterator();
 while(it.hasNext())
 {
	 Object key=it.next();
	 Object value=map1.get(key);
	 System.out.println(key+"\t"+value);
 }
 System.out.println("*All Key-Value using entrySet()**");
 Set entries=map1.entrySet();
 Iterator entr=entries.iterator();
 while(entr.hasNext())
 {
	 Map.Entry entry=(Map.Entry)entr.next();
	 System.out.println(entry.getKey()+"\t"+entry.getValue());
 }
 
 
}
}
package list.scenarios;
import java.util.*;
public class CLab1 {
public static void main(String[] args) {
ArrayList al1=new ArrayList();
System.out.println(al1);
System.out.println(al1.size());
System.out.println(al1.isEmpty());

 al1.add("Srinivas");
 al1.add(new Integer(134));
 al1.add(99.0);//ok from java 5
 al1.add(new Boolean(true));
 al1.add("hello");
 al1.add(new Student());
 al1.add("Dharmendra");
 
 System.out.println(al1);
 System.out.println(al1.size());
 System.out.println(al1.isEmpty());
 
 System.out.println("***toArary()***");
Object ob[]=  al1.toArray();
for(int i=0;i<ob.length;i++)
	System.out.println(ob[i]);
 
System.out.println(al1.contains("Sri"));
System.out.println(al1.contains("Dk"));

ArrayList al2 = new ArrayList();
al2.add("aaa");al2.add("bbb");
al2.add("ccc");al2.add("ddd");
al2.add("eee");al2.add("fff");

ArrayList al3 = new ArrayList(al2);
System.out.println(al2);
System.out.println(al3);

System.out.println(al2.equals(al3));
System.out.println("remove :"+al2.remove("ddd"));
System.out.println("remove :"+al2.remove("zzz"));
System.out.println(al2);
System.out.println(al3);
System.out.println(al2.equals(al3));

System.out.println("----------");
ArrayList al4 = new ArrayList();
//al4.add(al3);
al4.addAll(al3);
al4.add("Dkumar");
System.out.println(al4.contains(al3));
System.out.println(al4.containsAll(al3));
System.out.println(al4.size());
System.out.println(al4);

System.out.println(al4.remove(al3));
//System.out.println(al4.removeAll(al3));
System.out.println(al4.retainAll(al3));
System.out.println(al3);
System.out.println(al4);
al3.clear();
System.out.println(al3);

System.out.println("*iterator()*");
Iterator it= al1.iterator();
while(it.hasNext())
{
 Object obj=it.next();
 if(obj instanceof String){
 String str=(String)obj;
 System.out.println(str+"\t"+str.length());
 }
 else if(obj instanceof Integer){
	 Integer str=(Integer)obj;
	 System.out.println(str+"\t"+Integer.toBinaryString(str));
 }
 else if(obj instanceof Student){
	 Student str=(Student)obj;
	 System.out.println(str+"\t"+str.getSid());
}
}


}
}
class Student{
	
	String getSid()
	{
		return "JLC-12345";
	}
}
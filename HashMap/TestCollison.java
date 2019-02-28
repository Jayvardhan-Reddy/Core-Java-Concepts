package collection.demo;
import java.util.*;
  class  TestCollison
   {
   	public static void main(String[] args) 
   	{
   		
   		HashMap map = new HashMap();
   		Person p1 = new Person(1,"ABC");
   		Person p2 = new Person(2,"DEF");
  		Person p3 = new Person(1,"XYZ");
  		Person p4 = new Person(1,"PQR");
  		Person p5 = new Person(1,"PQR");
  		System.out.println("Adding Entries ....");	
  		map.put(p1,"ONE");
  		map.put(p2,"TWO");
      	map.put(p3,"THREE");
  		map.put(p4,"FOUR");
  		map.put(p5,"FIVE");
  
  		System.out.println("\nComplete Map entries \n" + map);
  
  		System.out.println("\nAccessing non-collided key");	
  		System.out.println("Value = "+map.get(p2));
  		System.out.println("\nAccessing collided key");	
  		System.out.println("Value = " + map.get(p1));
  	}
  }
 
 
  class Person 
  {
  	private int id;
 	private String name;
 
 	public Person(int id, String name) { this.id = id; this.name = name;}
 
 	public String getName() { return name;}
 
 	public int getId() { return id;}
 
 	public void setId(int id) { this.id = id;}
 
 	public void setName (String name) { this.name = name; }
 
 	public int hashCode(){ 
 			System.out.println("called hashCode for ="+ id+"."+name);
 			return id; 
 		}
 
 	public boolean equals(Object obj ){ 
 		System.out.println("called equals on ="+ id+"."+name +  "  to compare with  = "+ ((Person)obj).getId() + "."+ ((Person)obj).getName());
 		boolean result = false;
 		if (obj instanceof Person)
 		{
 			if( ((Person)obj).getId() == id  && ((Person)obj).getName().equals(name) )
 				result = true;
  		}
  		return result;
  	}
  	public String toString() { return id+" - "+name;} 
  }

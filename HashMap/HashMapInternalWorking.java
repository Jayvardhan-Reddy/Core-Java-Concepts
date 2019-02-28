package collection.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalWorking {

	public static void main(String[] args) {
		Map<Student,String> map = new HashMap<>();
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(13);
		Student s4 = new Student(1);
		Student s5 = new Student(14);
		Student s6 = new Student(188);
		map.put(s1,"1");
		map.put(s2,"274");
		map.put(s3,"2");
		map.put(s4,"256");
		map.put(s5,"52");
		map.put(s6,"2sad");
		
		System.out.println(map.size() + map.get(s1));
	}
}

class Student{
	@Override
	public int hashCode() {
		final int prime = 31;
		/*int result = 1;
		result = prime * result + i;*/
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
 		if (obj instanceof Person)
 		{
 			if( ((Student)obj).getId() == id  )
 				result = true;
  		}
  		return result;
  		
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (i != other.i)
			return false;
		return true;*/
	}
	
	public int getId() { return id;}
	
	int id;
	Student(int id){
		this.id = id;
	}
}
package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class StreamingAPI {
	
	
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student(1, "Abhisek"));
		sList.add(new Student(2, "Milan"));
		sList.add(new Student(3, "Bibhu"));
		sList.add(new Student(4, "Ashok"));
		sList.add(new Student(5, "Subrat"));
		sList.add(new Student(6, "Jay"));
		sList.add(new Student(7, "Prem"));
		sList.add(new Student(8, "Situ"));
		sList.add(new Student(9, "Vikas"));
		sList.add(new Student(10, "Ranjit"));
		
		sList.forEach(student -> {
			System.out.println(student.getName());
		});
		
		List<String> nameList = sList
								.stream()
								.map(Student::getName)
								.filter(name->{
									return name.startsWith("A");
								})
								.limit(10)
								.collect(Collectors.toList());
		
		System.out.println("-------------*************-----------------");
		List<String> filterStr = sList.stream().map(Student::getName).filter(name->{
			if(name.endsWith("t")){
				return true;
			}else{
				return false;
			}
		}).limit(10).collect(Collectors.toList());
		
		filterStr.forEach(name -> {
			System.out.println(name);
		});
		System.out.println("-------------*************-----------------");
		
		nameList.forEach(e->{
			System.out.println("----"+e);
		});
		for(String s:nameList){
			System.out.println("----"+s);
		}
		
		
		List<Student> newList = sList
								.stream()
								.filter(ele->{
									return ele.name.startsWith("A");
								})
								.limit(10)
								.collect(Collectors.toList());
		
		
		int totalSum = sList.stream().map(Student::getId).filter(e->{
			if(e<4)
				return true;
			else
				return false;
		}).mapToInt(e->e).sum();
		System.out.println("-----------"+totalSum);
		
		newList.forEach(student -> {
			System.out.println(student.getName());
		});
		
	}
}

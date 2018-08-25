package hashmap.scenarios;

import java.util.HashMap;



public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>();
		Student s1 = new Student(1);
		//System.out.println(s1.hashCode());
		Student s2 = new Student(1);
		hm.put(s1, "51");
		System.out.println("Before adding s2 to list "+hm.get(s1));
		hm.put(s2,"21");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(hm.get(s1));
		System.out.println(hm.get(s2));
		System.out.println(hm.size());
		//Integer i;
	}

}

class Student {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (i != other.i)
			return false;
		return true;
	}

	private int i;

	Student(int i) {
		this.i = i;
	}
}
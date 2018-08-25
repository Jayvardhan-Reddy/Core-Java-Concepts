package hashmap.scenarios;

public class Employee {

	private String name;
	private String id;
	public Employee(String name,String id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		int unique = 20;
		int newHash = id.hashCode()+20;
		
		//return new Integer(this.id).intValue();
		
		return newHash;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id;
	}
}

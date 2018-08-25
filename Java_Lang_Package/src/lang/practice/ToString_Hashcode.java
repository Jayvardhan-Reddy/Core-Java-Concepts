package lang.practice;

public class ToString_Hashcode {

	private int i;
	private String name;
	
	ToString_Hashcode(int i, String name){
		this.i = i;
		this.name = name;
	}
	
	@Override
	public String toString() {

		return i +" is " + name ;
	}
	
	@Override
	public int hashCode() {
		return i;
	}
	
	public static void main(String[] args) {
		ToString_Hashcode sh = new ToString_Hashcode(10, "rock");
		ToString_Hashcode sh1 = new ToString_Hashcode(11, "kane");
		System.out.println(sh);
		System.out.println(sh1);
	}

}

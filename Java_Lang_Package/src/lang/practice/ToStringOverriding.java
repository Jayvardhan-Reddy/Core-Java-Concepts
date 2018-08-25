package lang.practice;

import java.util.ArrayList;

/*The Wrapper class, String, StringBuffer, StringBuiler, Collection have Overriden toString method and it is recommended
to Override for our class as well 
*/

/*Internal implementation of toString in Object class
public String toString() {
	return getClass().getName + "@" + Integer.toHexString(hashcode());
}*/


public class ToStringOverriding {

	private int num;
	private String name;
	ToStringOverriding(int num, String name){
		this.num = num;
		this.name = name;
	}
	public static void main(String[] args) {
		ToStringOverriding tso = new ToStringOverriding(1,"crap");
		ToStringOverriding tso1 = new ToStringOverriding(11,"shit");
		System.out.println(tso);
		System.out.println(tso1);
		
		String s = new String("Rock");
		System.out.println("toSring method internally overriden by String class "+ s);
		
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add("dssd");
		System.out.println("toSring method internally overriden by Collection "+al);
	}

	//Overriding toString method
	@Override
	public String toString() {
		
		return num+" the name is " + name;
	}
}

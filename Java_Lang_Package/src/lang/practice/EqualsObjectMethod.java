package lang.practice;

public class EqualsObjectMethod {

	private int i;
	private String name;

	EqualsObjectMethod(int i, String name){
		this.i = i;
		this.name = name;
	}
	
	public static void main(String[] args) {
		EqualsObjectMethod eom = new EqualsObjectMethod(1,"Lion");
		EqualsObjectMethod eom1 = new EqualsObjectMethod(2,"Tiger");
		EqualsObjectMethod eom2 = new EqualsObjectMethod(1,"Lion");
		System.out.println(eom.equals(eom1));
		System.out.println(eom.equals(eom2));
	}
	
	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}
}

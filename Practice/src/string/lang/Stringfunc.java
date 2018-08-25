package string.lang;

public class Stringfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ashk";
		s.concat("dfasd");
		System.out.println(s);
		String s1 = new String();
		s1 = "dkhsd";
		System.out.println("s1 before " + s1);
		s1 = "dsklnsdk";
		System.out.println("s1 after " + s1);
		s1.concat("jkasdhkl");
		System.out.println("afer concat " + s1);
		StringBuffer sb = new StringBuffer("agjksdjk");
		System.out.println("initial str buf value " + sb);
		sb.append("sf");
		System.out.println("after append str buf value " + sb);
	}

}

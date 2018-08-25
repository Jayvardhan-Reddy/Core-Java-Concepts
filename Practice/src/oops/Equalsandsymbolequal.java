package oops;

public class Equalsandsymbolequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hey");
		String s2 = new String();
		s2 = "hey";
		if(s1.equals(s2))
		{
			System.out.println("returens true");
		}
		if(s1==s2)
		{
			System.out.println("equal");
		}
	}
	//String s3 = s1;
}

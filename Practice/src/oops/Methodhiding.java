package oops;

public class Methodhiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in parent class");
	}

}

class Sub extends Methodhiding
{
	public static void main(String[] args) {
		System.out.println("in child class");
	}
}

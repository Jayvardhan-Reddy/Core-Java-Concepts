package oops;

final class Cannotbeinherited
{
	
public void display()
{
	System.out.println("hi displayed");
}

	
}

class finalfunction
{
	final int a=10;
	final int b = 0;
	
	public final void disp1() throws Throwable
	{
		System.out.println("in disp pf disp1");
		finalize();
	}
}


public final class FinalTest  {

	public static void main(String[] args) {
		System.out.println("final class");
		finalfunction ff = new finalfunction();
		System.out.println(ff.a);
		//ff.b=35;
		try {
			ff.disp1();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//finalize();
	}
	//finalize();
}

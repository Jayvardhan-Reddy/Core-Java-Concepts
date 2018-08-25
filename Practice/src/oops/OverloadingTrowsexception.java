package oops;

import java.io.IOException;

public class OverloadingTrowsexception  {

	public void sum() throws Exception
	{
		int i = 10/0;
		System.out.println("value of i is");
	}
	public static void main(String[] args) throws Exception  {
		OverloadingTrowsexception ote = new OverloadingTrowsexception();
		ote.sum();
	}
}

class Childinher extends OverloadingTrowsexception
{
	public void sum() throws IOException
	{
		int a= 2/0;
		System.out.println("value of a is ");
		System.out.println("paretn class has to throw same exception as child class");
	}
}
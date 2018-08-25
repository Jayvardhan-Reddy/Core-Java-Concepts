package exception.pack;

public class Trycatchcases {

	public static void main(String[] args) {
	

	
	try {
		int a = 2/0;
		System.out.println("hi there in try");	
		int b= 3*0;
		System.out.println("still in try block");
	} 
	catch (ArithmeticException e) {
		try{
			
		
		int b = 2%2;
		
		System.out.println("in catch block " + b);
		// TODO: handle exception
		}
		catch (Exception ae)
		{
			System.out.println("problem in catch");
		}
	}
	

	finally{
		
		System.out.println("in finnaly");
		//int b = 2/0;
	}

	
}
	
}


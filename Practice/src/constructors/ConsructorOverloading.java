package constructors;

public class ConsructorOverloading {

	ConsructorOverloading(float f, int i)
	{
		System.out.println("Inside parent consuctor");
	}
}

 class ConsructorOverloadingChild extends ConsructorOverloading {

	ConsructorOverloadingChild(int i)
	{
		super(10,8);
		System.out.println("Inside child consuctor");
	}
	ConsructorOverloadingChild()
	{
		super(10,8);
		System.out.println("Inside child consuctor");
	}
		
	public static void main(String[] args) {
		ConsructorOverloadingChild ct1 = new ConsructorOverloadingChild(10);
		
	}
}
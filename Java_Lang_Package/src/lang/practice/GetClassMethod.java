package lang.practice;

import java.lang.reflect.Method;

/*
 We can use getClass method to get Run time class definition of an Object. public final Class getClass.
By using this Class class object we can access class level properties like fully qualified name of class, methods info,constructors info
*/
public class GetClassMethod {

	public static void main(String[] args) {
		
		int count=0;
		Object o = new String("Drink");
		Class c = o.getClass();
		System.out.println("Fully qualified name " +c.getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("Methods info ");
		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The number of methods are "+count);
	}

}

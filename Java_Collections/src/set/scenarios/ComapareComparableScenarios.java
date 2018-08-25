package set.scenarios;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*	1. Comparable in Java is used to implement natural ordering of object. In Java API String, Date and wrapper classes implements 
Comparable interface.Its always good practice to override compareTo() for value objects.
	2. If you want to sort objects based on natural order then use Comparable in Java and if you want to sort on some other
 attribute of object then use Comparator in Java
*
*/

public class ComapareComparableScenarios {

	public static void main(String[] args) {

		/*
		 * One example where compareTo is not consistent with equals in JDK is
		 * BigDecimal class. two BigDecimal number for which compareTo returns zero,
		 * equals returns false as clear from following BigDecimal comparison example
		 */
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("2.00");

		System.out.println("comparing BigDecimal using equals: " + bd1.equals(bd2));
		System.out.println("comparing BigDecimal using compareTo: " + bd1.compareTo(bd2));

		Employee e1 = new Employee(1, "kane");
		Employee e2 = new Employee(22, "rock");
		TreeSet<Employee> ts = new TreeSet<>();
		ts.add(e1);
		ts.add(e2);

		System.out.println(ts.toString());
		// Collections.sort((List<T>) ts);
		Iterator s = ts.iterator();
		while (s.hasNext())
			System.out.println(s.next());

		// ---------------- Comparator---------------

		System.out.println("Customized comparator");
		TreeSet<Employee> tsc = new TreeSet<>(new CustomizedComparator());
		tsc.add(e1);
		tsc.add(e2);

		// Collections.sort((List<T>) ts);
		Iterator sc = tsc.iterator();
		while (sc.hasNext())
			System.out.println(sc.next().toString());
	}

}

class Employee implements Comparable {

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private int id;
	private String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {

		Employee e = (Employee) o;
		return this.id - e.id;
	}
	
	// You have to Override toString Class if not Object will be printed
	@Override
	public String toString() {
		return this.id +" " +this.name;
	}
}

class CustomizedComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e = (Employee) o1;
		Employee e1 = (Employee) o2;
		if (e.getId() < e1.getId())
			return -1;
		else if (e.getId() > e1.getId())
			return 1;
		else
			return 0;
	}

}
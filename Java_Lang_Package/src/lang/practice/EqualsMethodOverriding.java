package lang.practice;

//In Object Class .equals method is used for Reference comparision and not content comparision
/*Note:
	1) For Stringg class the equals method is overriden and hence content comparision takes place
	2) For StringBuffer the equals method does reference comparision as the equals method is not overriden, hence object method is executed
	*/

public class EqualsMethodOverriding {

	private int i;
	private String name;

	EqualsMethodOverriding(int i, String name) {
		this.i = i;
		this.name = name;
	}

	public static void main(String[] args) {
		EqualsMethodOverriding eom = new EqualsMethodOverriding(1, "Lion");
		EqualsMethodOverriding eom1 = new EqualsMethodOverriding(2, "Tiger");
		EqualsMethodOverriding eom2 = new EqualsMethodOverriding(1, "Lion");
		System.out.println(eom.equals(eom1));
		System.out.println(eom.equals(eom2));
		// System.out.println(eom.equals("Lion")); //Case 1 :Obect and String
		// comparision will throw typecast exception
		System.out.println(eom.equals(null)); // Will raise nullpoiner exception
	}

	/*
	 * Here In equals method object1 is present as part of this keyword and the
	 * second object which is passed we have to typecast from object to
	 * EqualsMethodOverriding type
	 */
//METHOD 1
	/*@Override
	public boolean equals(Object obj) {
		try {
			int i1 = this.i;
			String name1 = this.name;
			EqualsMethodOverriding eomEqual = (EqualsMethodOverriding) obj; // In case 1: it will try to cast from
																			// String to Student and we get CCE
			int i2 = eomEqual.i;
			String name2 = eomEqual.name;
			// Here the .equals is of String type and not Object method. int is compared
			// using == becoz int is a primitive type and not Object
			if (name1.equalsIgnoreCase(name2) && i1 == i2) {
				return true;
			} else
				return false;
		} catch (ClassCastException | NullPointerException e) {

			return false; // As Object type equals method behaviour for heterogineous type it will return
							// false
		}
	}*/
	
	//METHOD 2 :Simplified above equals method
	
	/*@Override
	public boolean equals(Object obj) {
		try {
			
			EqualsMethodOverriding eomEqual = (EqualsMethodOverriding) obj; // In case 1: it will try to cast from  String to Student and we get CCE			
			int i2 = eomEqual.i;
			String name2 = eomEqual.name;
			// Here the .equals is of String type and not Object method. int is compared
			// using == becoz int is a primitive type and not Object
			if (name.equalsIgnoreCase(name2) && i == i2) {
				return true;
			} else
				return false;
		} catch (ClassCastException | NullPointerException e) {

			return false; // As Object type equals method behaviour for heterogineous type it will return
							// false
		}
	}*/
	
	//METHOD 3: Using InstanceOf
	@Override
	public boolean equals(Object obj) {
		if (obj == this)	//If Obj and the this are pointing to same reference then returns true
			return true;
		if (obj instanceof EqualsMethodOverriding) {
			EqualsMethodOverriding eomEqual = (EqualsMethodOverriding) obj; // In case 1: it will try to cast from
																			// String to Student and we get CCE
			int i2 = eomEqual.i;
			String name2 = eomEqual.name;
			// Here the .equals is of String type and not Object method. int is compared
			// using == becoz int is a primitive type and not Object
			if (name.equalsIgnoreCase(name2) && i == i2) {
				return true;
			} else
				return false;
		}
		return false;
	}
}

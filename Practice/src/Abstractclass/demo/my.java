package Abstractclass.demo;

/*you are not creating the instance of your abstract class here. Rather you
are creating an instance of an anonymous subclass of your abstract class.
And then you are invoking the method on your abstract class reference pointing
to subclass object.

If the class instance creation expression ends in a class body, then the class being instantiated is an anonymous class. Then:

If T denotes a class, then an anonymous direct subclass of the class named by T is declared. It is a compile-time error if the class denoted by T is a final class.
If T denotes an interface, then an anonymous direct subclass of Object that implements the interface named by T is declared.
In either case, the body of the subclass is the ClassBody given in the class instance creation expression.
The class being instantiated is the anonymous subclass.

Now, compile both your source files:

javac My.java Poly.java
Now in the directory where you compiled the source code, you will see the following class files:

My.class
Poly$1.class  // Class file corresponding to anonymous subclass
Poly.class
See that class - Poly$1.class. It's the class file created by the compiler corresponding to the anonymous subclass you instantiated using the below code:

new My() {};
So, it's clear that there is a different class being instantiated. It's just that, that class is given a name only after compilation by the compiler.

In general, all the anonymous subclasses in your class will be named in this fashion:

Poly$1.class, Poly$2.class, Poly$3.class, ... so on

yes it is: subclassInstance instanceof SuperClass would return true,
 so the object is an instance of the superclass, which means the superclass has been instanciated. But that's just semantic nitpicking
*/


abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

class poly {
    public static void main(String a[]) {
        my m = new my() {};
        m.mymethod();
    }
}
package hashmap.scenarios;
// Java program to illustrate 
// how hashCode() and equals() methods work
import java.io.*;
 
class Geek 
{
     
    public String name;
    public int id;
         
    Geek(String name, int id) 
    {
             
        this.name = name;
        this.id = id;
    }
     
    @Override
    public boolean equals(Object obj)
    {
         
    // checking if both the object references are 
    // referring to the same object.
    if(this == obj)
            return true;
         
        // it checks if the argument is of the 
        // type Geek by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
         
        // type casting of the argument. 
        Geek geek = (Geek) obj;
         
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (geek.name == this.name && geek.id == this.id);
    }
     
    @Override
    public int hashCode()
    {
         
        // We are returning the Geek_id 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return this.id;
    }
     
}
 
//Driver code
class GFG
{
     
    public static void main (String[] args)
    {
     
        // creating the Objects of Geek class.
        Geek g1 = new Geek("aa", 1);
        Geek g2 = new Geek("aa", 10);
         
        // comparing above created Objects.
        if(g1.hashCode() == g2.hashCode())
        {
 
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
     
        }
        else
        System.out.println("Both Objects are not equal. "); 
    } 
}
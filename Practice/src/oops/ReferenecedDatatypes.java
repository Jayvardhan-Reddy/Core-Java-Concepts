package oops;

class Refvar
{
static	int c;
}

public class ReferenecedDatatypes  {
	 int a,b; 
	// static int k =  Refvar.c; // Valid declaration
	 void add(){
	 System.out.println(a+b);
	 }
	 
	 public static void main(String[] args) {
	  
		 ReferenecedDatatypes obj= new ReferenecedDatatypes();
	  
	        obj.a=10;
	        obj.b=12;
	        Refvar.c = 20;
	        final int d =Refvar.c; 
	       // static int k =  Refvar.c;
	        	System.out.println("static value is " + d);
	        obj.add();
	  
	     }
}



package collection.demo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayList {
		   public static void main(String args[]) {
			      
			   String[] input = { "today is friday abc",
					   				"happy friday",
					   				"he is not coming abc to office"};
			   String search = "friday";	//he is not //is abc //xyz
			   
		        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
		        threadSafeList.add("Java");
		        threadSafeList.add("J2EE");
		        threadSafeList.add("Collection");
		      
		        //add, remove operator is not supported by CopyOnWriteArrayList iterator
		        Iterator<String> failSafeIterator = threadSafeList.iterator();
		        while(failSafeIterator.hasNext()){
		            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
		         //   failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
		            
		            threadSafeList.add("creep");
		          //  threadSafeList.remove(failSafeIterator.next());
		        }
		        
		        ArrayList<Integer> a = new ArrayList<Integer>();
		        a.add(10);
		        a.add(20);
		        Iterator<Integer> aIter = a.iterator();
		        while(failSafeIterator.hasNext()){
		            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
		            aIter.remove(); //not supported in CopyOnWriteArrayList in Java
		            
		          //  threadSafeList.add("creep");
		          //  threadSafeList.remove(failSafeIterator.next());
		        }
	

		    }
}


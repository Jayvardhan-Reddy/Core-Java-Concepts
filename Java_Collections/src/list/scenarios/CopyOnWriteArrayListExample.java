package list.scenarios;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * Java program to demonstrate What is CopyOnWriteArrayList in Java,
 * Iterator of CopyOnWriteArrayList
 * doesn’t support add, remove or any modification operation.
 *
 * @author Java67
 */

//Iterator of CopyOnWriteArrayList doesn't support remove() operation.

public class CopyOnWriteArrayListExample{

    public static void main(String args[]) {
      
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
    }
}
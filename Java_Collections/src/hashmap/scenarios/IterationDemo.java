package hashmap.scenarios;
// Java program to demonstrate iteration over 
// Map using keySet() and values() methods
 
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
 
class IterationDemo 
{
    public static void main(String[] arg)
    {
        Map gfg = new HashMap();
     
        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");
         
        // using iterators
        Iterator itr = gfg.entrySet().iterator();
         
        while(itr.hasNext())
        {
             Map.Entry entry = (Entry) itr.next();
             System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());
        }
    }
}
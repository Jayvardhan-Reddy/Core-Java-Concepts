//Write a Java program to remove duplicate elements from an array using Collections (Linkedhashset)
package Collectons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDupFrmArrylistUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("look");
		al.add("hkshk");
		al.add("look");
		al.add("instanceofjava");
	    al.add("Interview Questions");
	    al.add("Interview Programs");
	    al.add("java");
	    al.add("Collections Interview Questions");
	    al.add("instanceofjava");
	    al.add("Java Experience Interview Questions");
	    System.out.println(al+"\n"+al.size());
	    TreeSet<String> hs = new TreeSet<String>();
	    hs.addAll(al);
	    System.out.println("hashset values" + hs+"\n"+hs.size());
	    al.clear();
	    System.out.println("after clearing the arrarylist " + al);
	    al.addAll(hs);
	    System.out.println("after adding the hashset to arraylist " + hs +"\n" +hs.size());
	}

}

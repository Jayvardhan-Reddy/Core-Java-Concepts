package list.scenarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//int newCapacity = (oldCapacity * 3/2) + 1; // capacity

public class ArraylistSize {

	public static void main(String[] args) {

		List l = new ArrayList();
		for (int i = 0; i < 12; i++)
			l.add(i);
		System.out.println(l.get(10));
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		LinkedList ll;
		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			System.out.println("Inside list iterator " + li.next());
			Integer num = (Integer) li.next();
			if (num % 2 != 0) {
				// li.add(10);
				li.remove();
				// l.add(new Integer(1));
			}
		}
		System.out.println(l);

		//-------------------------------------------------
		l.addAll(l);
		System.out.println("value of addin same arraylist "+ l);
		Object[] a = new Integer[l.size()];
		a = (Object[]) l.toArray();
	System.out.println("The array value is " + a[0]);
	
	
	
	ArrayList assetTradingList = new ArrayList(); 

	assetTradingList.add("Stocks trading");
	assetTradingList.add("futures and option trading");
	assetTradingList.add("electronic trading");
	assetTradingList.add("forex trading");
	assetTradingList.add("gold trading");
	assetTradingList.add("fixed income bond trading");
	String [] assetTradingArray = new String[assetTradingList.size()];
	assetTradingList.toArray(assetTradingArray);
	
	System.out.println(assetTradingArray[0]);
	
	//From Array to Arraylist
	String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"}; 
	List<String> assetList = Arrays.asList(asset); //Cannot modify add, delete - original array is also modified on modifying arraylist
	
	

	Collections.addAll(assetList, asset); ////Cannot modify add, delete - copy of array is taken
	
	ArrayList newAssetList = new ArrayList();
	newAssetList.addAll(Arrays.asList(asset));
	
	}

}

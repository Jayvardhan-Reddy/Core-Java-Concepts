package hashmap.scenarios;

import java.util.HashMap;
import java.util.Random;

public class NotUniqueHashcode {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(10, "Mystry");
		hm.put(11, "Mystry1");
		hm.put(12, "Mystry2");
		hm.put(10, "Mystry");
		hm.put(10, "Mystry");
		hm.put(10, "Mystry");
		hm.put(10, "Mystry");
		hm.put(10, "Mystry");
		System.out.println(hm.get(10));
		System.out.println(hm.toString());
		System.out.println(hm.size());
		
	}

	@Override
	public int hashCode() {
Random ran = new Random();
		return ran.nextInt();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}

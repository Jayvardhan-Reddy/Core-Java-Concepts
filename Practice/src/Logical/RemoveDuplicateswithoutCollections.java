package Logical;

import java.util.ArrayList;

public class RemoveDuplicateswithoutCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<>();
		al.add("jhdsj");
		al.add(1);
		al.add(5);
		al.add(1);
		al.add("as");
		al.add("as");
		al.add(1);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.remove(j);
					j--;
					System.out.println("after j removal" + al);
				}
			}
			System.out.println("after j for loop"+ al);
		}
		System.out.println("after removing : "+ al);
	}

	

}

package collection;

import java.util.*;
public class MyLinkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add(new String ("Priya"));
		lhs.add(new String ("Prajakta"));
		lhs.add(new String ("Vaishali"));
		
		Object array[] = lhs.toArray();
		for(int i=0; i<3 ; i++)
		{
			System.out.println(array[i]);
			
		}
		
	}

}

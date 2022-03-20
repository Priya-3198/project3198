package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) 
	{
		TreeMap treeMap = new TreeMap();
		treeMap.put("name ", "Priya");
		treeMap.put("id", new Integer(538));
		treeMap.put("Address ", "NAshik");
		
		Collection values = treeMap.values();
		Iterator itr = values.iterator();
		 System.out.println("Printing the VALUES : ");
		 while(itr.hasNext())
		 {
			  System.out.println(itr.next());
		 }

	}

}

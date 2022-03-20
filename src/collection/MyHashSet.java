package collection;
import java.util.*;

public class MyHashSet 
{

	public static void main(String[] args) 
	{
		Set hash = new HashSet();
		
		hash.add("Priya");
		hash.add("Kajal");
		hash.add("Shree");
		hash.add("Vijay");
		
		Iterator itr = hash.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		

	}

}

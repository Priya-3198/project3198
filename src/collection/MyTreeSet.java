package collection;
import java.util.*;
import java.util.TreeSet;

public class MyTreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("Priya");
		tree.add("Prajakta");
		tree.add("Vasihali");
		tree.add("Priyanka");
		tree.add("Payal");
		
		Iterator itr = tree.iterator();
		
		while(itr.hasNext());
		{
			System.out.println(itr.next().toString());
		}
		
	}

}

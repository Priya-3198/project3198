package collection;

import java.util.Hashtable;

public class HashTableDemo 
{
	

	public static void main(String[] args) 
	{
			Hashtable table = new Hashtable();
			
			table.put("name ", "Priya");
			table.put("id ", new Integer(1001));
			table.put("address" , new String("Nashik"));
			
			System.out.println("Table of Contents : " +table);
	}

}

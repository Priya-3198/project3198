package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo
{

	public static void main(String[] args) 
	{
		Map<String , String> fruit = new HashMap<String,String>();
		
		fruit.put("Apple" , "red");
		fruit.put("Orange" , "orange");
		fruit.put("Grapes" , "green");
		fruit.put("Cherry" , "red");
		fruit.put("Pear" , "yellow");
		
		for(String key : fruit.keySet())
		{
			System.out.println(key+ " : " +fruit.get(key));
		}

	}

}

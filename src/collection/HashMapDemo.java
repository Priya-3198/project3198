package collection;
import java.util.*;
import java.util.HashMap;


public class HashMapDemo 
{

	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(new Integer(103), "Priya");
		map.put(new Integer(108) ,"Arati");
		map.put(new Integer(105) ,"Pratiksha");
		
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+ "  " +me.getValue());
		}
				
	}

}



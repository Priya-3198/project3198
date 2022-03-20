//

package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Assign3 
{
	public void showAll(ArrayList list)
	{
		Iterator it=list.iterator();
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }
	}
	public static void main(String[] args) 
	{
		Assign3 a3 = new Assign3();
		ArrayList<String> list=new ArrayList();
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		
		a3.showAll(list);
	}

}

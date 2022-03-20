package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Demo
{

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add("Priya");
		list.add(true);
		list.add(2.1);
		//for(int i=0;i<list.size();i++)
		//{
		//	System.out.println(list.get(i));
		//} 
		Iterator itr=  list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

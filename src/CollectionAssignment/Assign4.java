package CollectionAssignment;
import java.util.*;

class MyArrayList<E> extends ArrayList<E>
	{
		public boolean add(E e)
		{
			if(e instanceof Integer || e instanceof Float || e instanceof Double);
			{
				super.add(e);
				return true;
			}
			else
			{
				throw new ClassCastException("Only Integer , Float are supported : ");
			}
	
		}
	}
public class Assign4
{


	public static void main(String[] args) 
	{ 
		List<Object> list = new MyArrayList<>();
		try
		{
			list.add(15);
			list.add(1.5F);
			list.add(3.142);
			list.add("Test");
		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
		System.out.println(list);
		
			
	}

}

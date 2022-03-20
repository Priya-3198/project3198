package CollectionsMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Methods 
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Priya");
		list.add("Vaishali");
		list.add("KAjal");
		list.add("Parajakta");
		list.add("Samu");
		System.out.println("Simple List : /n "+list);
	
		
		//***Collections.addAll()*************
		
	List<String> list1= new ArrayList<String>();
	Collection.addAll(list1);
	System.out.println("/n  : /n "+list);
	}
}
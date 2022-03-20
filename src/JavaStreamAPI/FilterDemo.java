package JavaStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo 
{

	public static void main(String[] args)
	{
		List<String> id = Arrays.asList("Priya","Kajal","Vaishali");
		List<String> res = id.stream().filter(s->satrtsWith("p")).collect(Collectors.toList());
				System.out.println(res);
				
	}

	
}
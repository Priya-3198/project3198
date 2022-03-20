package JavaStreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo 
{

	public static void main(String[] args) 
	{
	//	Collection<String>collection=Arrays.asList("Priya","Kajal","Vaishali");
		
		List<String>collection=List.of("Priya","Kajal","Vaishali");
		collection.stream().forEach(e->System.out.println(e));
		
		
		Stream<String> stream1=collection.stream();
		stream1.forEach(e->System.out.println(e));
	}

}

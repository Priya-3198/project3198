package Java8;

import java.util.function.Function;

public class FunctionalDemo 
{

	public static void main(String[] args) 
	{
		Function<String,Integer> fun = s -> s.length();
		System.out.println(fun.apply("Hello"));
		
		
		Function<String,String>str=s->s.replace('p', 's');
		System.out.println(str.apply("priya"));

	}

}

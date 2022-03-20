package Java8;

import java.util.function.Function;

public class FunctionalDefaultMethod
{

	public static void main(String[] args) 
	{
		Function<Integer,Integer>sum=a->a+a; 
		Function<Integer,Integer>div=a->a/a; 
	//	System.out.println(sum.apply(5));
	//	System.out.println(div.apply(5));
		
		System.out.println(sum.andThen(div).apply(5));
		
		System.out.println(sum.compose(div).apply(5));
		
		
	;
	}

}

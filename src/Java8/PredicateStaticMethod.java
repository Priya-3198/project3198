package Java8;

import java.util.function.Predicate;

public class PredicateStaticMethod 
{

	public static void main(String[] args)
	{
		Predicate<Integer>p=t->(t%2==0);
		//System.out.println(p.test(8));
		//System.out.println(p.test(5));
		
	
		int num[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		Predicate<Integer> even=x->x%2==0;
		Predicate<Integer> number=y->y>5;
		for(int i=0; i<num.length ; i++)
		{
//			if(number.or(even).test(i))
//		{
//				System.out.println(i);
//			}
//			if(number.and(even).test(i))
//		{
//					System.out.println(i);
//			}
//			
			if(number.negate().test(i))
				{
					System.out.println(i);
				}
		}
	}

}

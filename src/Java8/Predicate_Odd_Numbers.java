package Java8;

import java.util.function.Predicate;

public class Predicate_Odd_Numbers
{

	public static void main(String[] args) 
	{
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Predicate<Integer> odd =x-> x%2 == 1;
		
		for(int i : num)
		{
			if(odd.test(i))
			{
				System.out.println(i);
			}
		}

	}

}

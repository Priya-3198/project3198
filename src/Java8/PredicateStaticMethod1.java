package Java8;

import java.util.function.Predicate;

public class PredicateStaticMethod1 
{

	public static void main(String[] args) 
	{
		Predicate<String> nm = Predicate.isEqual("Nashik");
		System.out.println(nm.test("Nashik"));
		
		Predicate<String> nm1 = Predicate.isEqual("Nashik");
		System.out.println(nm1.test("Pune"));
		
		

	}

}

package string;

import java.util.StringJoiner;

public class StringJoinerDemo 
{

	public static void main(String[] args) 
	{
		StringJoiner joinNames = new StringJoiner("," , "[" , "]");
		
		joinNames.add("Priya");
		joinNames.add("Prachi");
		joinNames.add("Prajkata");
		joinNames.add("Prerana");
		joinNames.add("Priyanka");
		
		System.out.println(joinNames);
	}

}

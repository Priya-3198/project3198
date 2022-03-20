package string;

import java.util.StringJoiner;
public class MergeTwoString 
{

	public static void main(String[] args) 
	{
		StringJoiner joinNames = new StringJoiner("," , "[","]");
		
		joinNames.add("Priya");
		joinNames.add("Prachi");
		
		StringJoiner joinNames2 = new StringJoiner(":" , "#","#");
		
		joinNames2.add("Priyanka");
		joinNames2.add("Prachita");
		
		StringJoiner merge = joinNames.merge(joinNames2);
		System.out.println(merge);
	}

}

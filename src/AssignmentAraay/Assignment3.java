
//Write a Java Program to check if see if Array contains a specific value. [Solution: Program : To check if Array contains an specific element. (Primitive value)]

package AssignmentAraay;

import java.util.Arrays;

public class Assignment3 
{

	public static void main(String[] args) 
	{
		String[]  string = {"Rahul" , "Shree" , "Sam" , "Ram" , "Aditya"};
		String toFind =" Shree ";
		
		//String toFind="Rohan";
		
		boolean found = Arrays.stream(string).anyMatch(t-> t.equals(toFind));
		if(found)
		{
			System.out.println(toFind  + "\nString is find");
		}
		else
		{
			System.out.println(toFind  + "\nString is not find");
		}
		
	}

}

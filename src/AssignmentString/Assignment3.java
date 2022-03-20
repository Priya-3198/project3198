
// Write a Java program to print after removing duplicates from a given string. 

package AssignmentString;

import java.util.Arrays;

public class Assignment3 
{
	static String removeDuplicate(char str[] , int n)
	{
		int index = 0 ;
		for(int i= 0 ; i < n ; i++)
		{
			int j ; 
			for(j = 0 ; j < n ; j++ )
			{
				if(str[i] == str[j])
				{
					break;
				}
			}
			if(j == i)
			{
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}
	public static void main(String[] args) 
	{
		char str[] = "Welcome To Welcome".toCharArray();
		int n = str.length;
		System.out.println(removeDuplicate(str, n));

	}

}

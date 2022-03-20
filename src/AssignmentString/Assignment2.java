package AssignmentString;

import java.util.Scanner;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		String s1 = " ";
		int a = s.length();
		for(int i=a-1;i>0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s1.equals(s1))
		{
			System.out.println("string is Pallindrome  ");
			
		}
		else
		{
			System.out.println("string is NOt Pallindrome  ");
		}
	}

}

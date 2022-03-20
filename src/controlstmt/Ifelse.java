package controlstmt;

import java.util.Scanner;

public class Ifelse 
{

	public static void main(String[] args) 
	{
			int marks;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your marks:");
			marks=in.nextInt();
	
			if(marks>=36)
			{
					System.out.println("You are Pass.");
			}
			else
			{
					System.out.println("You are Fail.");
			}
	}

}

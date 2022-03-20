package AssignmentString;

import java.util.Scanner;

public class Assign1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  : ");
		String s1= sc.next();
		System.out.println("String After Lowercase : "+s1.toLowerCase());
		System.out.println("String After Uppercase : "+s1.toUpperCase());
	}

}

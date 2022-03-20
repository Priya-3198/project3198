package array;
import java.util.Scanner;

public class Array3 
{

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enetr the no of strings in array : ");
				int N = sc.nextInt();
				String name[] = new String [N];
				
				System.out.println("Enter string one by one  ");
				for(int i=0 ; i < name.length ; i++)
				{
					name[i]=sc.next();
				}
				System.out.println("Elements are : ");
				for(int i = 0 ; i < name.length ; i++)
				{
					System.out.println(name[i]);
				}
			}

		

	}



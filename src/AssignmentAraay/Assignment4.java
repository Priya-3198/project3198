
//Write a Java Program to reverse the array contents. [Solution: Program: Java Code to Reverse an int Array]


package AssignmentAraay;

public class Assignment4 
{
	static void reverse(int a[] , int n)
	{
		int [] b = new int[n];
		int j = n; 
		
		for(int i = 0 ; i < n ; i++)
		{
			b[j-1] = a[i];
			j = j - 1 ;
		}
		System.out.println("Reverse Array is : ");
		
		for(int k = 0 ; k < n ; k++)
		{
			System.out.println(b[k]);
		}
	}
	public static void main(String[] args) 
	{
		int [] arr  = { 11 , 22 , 33 , 44 , 55};
		reverse(arr, arr.length);
	}

}

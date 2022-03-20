
//Write a Java Program to remove a particular element from an array. [Solution : Program : Remove an Element from int Array in Java]

package AssignmentAraay;

import java.util.Arrays;

public class Assignment5 
{
		public static void main(String[] args) 
		{
			int array[] = {88,99,77,66,11};
			System.out.println("Original Array is :"+Arrays.toString(array));
			int remove = 4;
			for(int i = remove; i<array.length-1 ; i++)
			{
				array[i] = array[i]+1;
			}
			System.out.println("Original Array is :"+Arrays.toString(array));
			
		}

	}

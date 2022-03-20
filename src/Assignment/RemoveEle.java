package Assignment;

import java.util.Arrays;

public class RemoveEle 
{

	public static void main(String[] args) 
	{
		int array[] = {88,99,77,66,11};
		System.out.println("Original Array is :"+Arrays.toString(array));
		int remove = 3;
		for(int i = remove; i<array.length-1 ; i++)
		{
			array[i] = array[i]+1;
		}
		System.out.println("Original Array is :"+Arrays.toString(array));
		
	}

}

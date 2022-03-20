
// Create a Java Program to Sort an Array of Numeric or String Data. [Solution : Program : Sort an Array in Java]


package AssignmentAraay;

import java.util.Arrays;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		int [] array = {999 , 888 , 111 , 333 , 555 };
		String [] array1 = {"Priya" , "Arati" , "Pratiksha", "Kajal" , "Vaishali"};
		
		System.out.println("Old numeric array :" +Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted numeric array :" +Arrays.toString(array));
		
		System.out.println("Old string array :" +Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted string array :" +Arrays.toString(array1));
	}

}

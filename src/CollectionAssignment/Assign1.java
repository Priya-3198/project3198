
//

package CollectionAssignment;

import java.util.ArrayList;

public class Assign1 
{
	ArrayList<Integer> A1= new ArrayList<Integer>();
	public void saveEvenNumber(int N)
	{
		for(int i=2;i<N;i++)
		{
			if(i%2==0)
			{
				A1.add(i);
			}
		}
		System.out.println("Even Number are : "+A1);
	}

	
	public void printEvenNumber()
	{
		ArrayList<Integer> A2= new ArrayList<Integer>();
		for(Integer it:A1)
		{
			A2.add( it *2);
			
		}
		System.out.println("Second Array is  :"+A2);
	}
	
	
	public static void main(String[] args) 
	{
		Assign1 as = new Assign1();
		as.saveEvenNumber(8);
		as.printEvenNumber();
	}

}

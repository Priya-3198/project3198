package CollectionAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Assignment6 
{
		private LinkedList<Integer> list = new LinkedList<Integer>();
		public  LinkedList<Integer> saveEvenNumber(int N)
		{
			for(int i=2;i<N;i++)
			{
				if(i%2==0) list.add(i);
			}
				
				return list;
		}
			
			
		public LinkedList<Integer> printEvenNumber()
		{
			LinkedList<Integer>newList = new LinkedList<Integer>();
			{
				for(int item : list)
				{
					newList.add(item * 2);
					
				}
				return newList;
				
			}
		}
	public static void main(String[] args) 
	{
		Assignment6 A6 = new Assignment6();
		A6.saveEvenNumber(10);
		A6.printEvenNumber();

		// TODO Auto-generated method stub

	}

}

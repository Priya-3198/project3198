package AssignmentAraay;

public class Assignment6 
{
	public static int getSecondLarget(int[] a , int total)
	{
		int  temp;
		for(int i = 0 ; i < total ; i++)
		{
			for(int j = i+1 ; j < total ; j++)
			{
				if(a[i] >a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args)
	{
		int a[] = { 88 , 55 , 22 , 33 , 11};
		System.out.println("Second Largest Number : " +getSecondLarget(a,5));
	}
}


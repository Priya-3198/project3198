


package AssignmentAraay;

public class Assignment7 
{

	public static void main(String[] args) 
	{
		int []arr1 = new int[] {10 , 20 , 30 , 40 , 50 };
		
		int arr2[] = new int[arr1.length];
		for(int i = 0 ; i < arr1.length ; i++)
		{
			arr2[i] =arr1[i];
		}
		System.out.println("Elements Of an Old Array : ");
	
		for(int i = 0 ; i < arr1.length ; i++)
		{
			System.out.println(arr1[i] +" ");
		}
		System.out.println();
		System.out.println("Elements Of an New Array : ");
		
		for(int i = 0 ; i < arr1.length ; i++)
		{
			System.out.println(arr2[i] +" ");
			
		}
		
	}

}

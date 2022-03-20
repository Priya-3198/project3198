package array;

public class TwoD1 
{

	public static void main(String[] args) 
	{
		int[][]ar = new int[2][2];
		
		ar[0][0]=ar[1][1]=1;
		ar[0][1]= ar[1][0]=0;

		System.out.println("Array element are :");
		
		System.out.println(ar[0][0]+" "+ar[1][1]);
		System.out.println(ar[0][1]+" "+ar[1][0]);

	}

}

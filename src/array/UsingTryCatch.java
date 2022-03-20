package array;

public class UsingTryCatch
{

	public static void main(String[] args)
	{
		int num[] = {55, 66, 77, 88, 99};
		try
		{
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is occured");
		}
	}

}
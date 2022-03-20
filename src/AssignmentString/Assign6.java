package AssignmentString;

public class Assign6 
{

	public static void main(String[] args) 
	{
		int count = 0 ;
		String s1 = "Welcome to java";
		String s2 = "Welcome";
		//String[]str = s1.split( "  " );
		String[]str = s2.split( "  " );
		
		for(int i =0; i<str.length;i++)
		{
			if(str[i].equals(s2))
			{
				++count;
			}
		}
		System.out.println(count);


	}

}

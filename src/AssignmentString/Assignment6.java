
//Wap to check string is palindrome or not like “madam”

package AssignmentString;

public class Assignment6 
{

	public static void main(String[] args) 
	{
		
		String str1 ="madan ",str2="";
		for(int i=str1.length()-1 ;i >=0;i--)
		{
			str2 += str1.charAt(i);
			
		}
		if(str1.equals(str2))
		{
			System.out.println("It is Pallindrome !");
		}
		else
		{
			System.out.println("It is Not Pallindrome !");

		}
	
	}

}

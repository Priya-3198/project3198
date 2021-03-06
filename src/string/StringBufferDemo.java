package string;

public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Object Language ");
		System.out.println("Original String :"+str);
		
		System.out.println("Length of string " +str.length());
		
		for(int i=0;i<str.length();i++)
		{
			int p = i+1;
			System.out.println("Characters at position : "+p+" is "+str.charAt(i));
		}
		String str2 = new String(str.toString());
		int pos = str2.indexOf("Language");
		
		str.insert(pos,"oriented");
		
		System.out.println("Modified String : "+str);
		
		str.setCharAt(6, '-');
		System.out.println("String Now :");
		
		str.append("Improve Security");
		System.out.println("Append String "+str);
	}
}


package string;
import java.util.StringTokenizer;

public class StringTokenizerDemo 
{

	public static void main(String[] args)
	{
			StringTokenizer st = new StringTokenizer("Hello:Welcome:To:Edubridge",":",true);;
			while(st.hasMoreElements())
			{
				System.out.println(st.nextElement());
				
			}
	}

}

package bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo 
{

	public static void main(String[] args) 
	{
		try 
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter any numeric value ");
			String num = br.readLine();
			
			int n = Integer.parseInt(num);
			float f = Float.parseFloat(num);
			Double d = Double.parseDouble(num);
			
			System.out.println("integer " +n);
			System.out.println("float " +f);
			System.out.println("double " +d);
		}
		catch (IOException e)
		{
				e.printStackTrace();
		
		}
	}

}

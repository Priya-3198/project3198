package bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {

	public static void main(String[] args) throws IOException
	{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		
			System.out.println("Enter the value of i:");
			String i = br.readLine();
			
			int n = Integer.parseInt(i);
			float f = Float.parseFloat(i);
			double d = Double.parseDouble(i);
			
			
			System.out.println("Integer :" +n);
			System.out.println("float :" +f);
			System.out.println("Double :"+d);
			
		
		
		

	}

}

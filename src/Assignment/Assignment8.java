
package Assignment;

import java.util.*;
public class Assignment8 
{
	
	
	public boolean leftAndRightSame(String stng) 
	{
	  int l = stng.length();
	  boolean found = true;
	  for (int i = 0; i < l; i++) 
	  {
	    String tmpString = stng.substring(i,i+1);
	    if (tmpString.equals("#") && i > 0 && i < l-1) 
		{
	      if (stng.charAt(i-1) == stng.charAt(i+1))
	        found = true;
	      else
	        found = false;
	    }
	  }
	  return found;
	}
	public static void main (String[] args)
	    {
	      Assignment8 a8= new Assignment8();
	      String str1 =  "moon#night";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The before and after character are same: "+a8.leftAndRightSame(str1));
	      String str2 = "bat#ball";
	      System.out.println("The given string is: "+str2);
	      System.out.println("The before and after character are same: "+a8.leftAndRightSame(str2));
	    }  
	}

	

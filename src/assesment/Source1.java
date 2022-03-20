package assesment;

import java.util.ArrayList;
import java.util.List;

class Alphabate 
{
	int vcount=0,ccount=0;
	public int uniqueVowel(String str)
	{
		List list = new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			if(!list.contains(str.charAt(i)))
			{
				list.add(str.charAt(i));
			}
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals('a')||list.get(i).equals('e')||list.get(i).equals('i')||list.get(i).equals('o')||list.get(i).equals('u'));
			{
				vcount=vcount+1;
			}
		}
		return vcount;
}
	
	public int uniqueConsonant(String str)
	{
		List list2 = new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			if(!list2.contains(str.charAt(i)))
			{
				list2.add(str.charAt(i));
			}
		}
		for(int i=0;i<list2.size();i++)
		{
			if(!list2.get(i).equals('a')&&!list2.get(i).equals('e')&&!list2.get(i).equals('i')&&!list2.get(i).equals('o')&&!list2.get(i).equals('u'));
			{
				ccount=ccount+1;
			}
		}
		return ccount;
	}
}

public class Source1
{

	public static void main(String[] args)
	{
		Alphabate obj=new Alphabate();
		System.out.println(obj.uniqueVowel("abacab"));
		System.out.println(obj.uniqueConsonant("abacab"));
	//	obj.uniqueVowel("abacab");
	//	obj.uniqueConsonant("abacab");

	}

}

package JUnitTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertMethods 
{
	@Test
	public void test() 
	{
		String s1 =null;
		String s2 = "Priya;";
		assertNotNull(s2);
	}
	
	@Test
	public void test1() 
	{
		String s1 =null;
		String s2 = "Priya;";
		assertNull(s1);
	}
	
	@Test
	public void test2() 
	{
		String s1 ="Edubridge";
		String s2 = "Edubridge";
		assertSame(s1,s2);
	}
	
	public void test3()
	{
		int arr01[]= {1, 2, 3, 4, 5};
		int arr02[]= {1, 2, 3, 4, 5};
		
		
	}
}


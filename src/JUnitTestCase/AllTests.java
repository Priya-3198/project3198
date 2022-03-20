package JUnitTestCase;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({ TestCase.class, TestCaseMul.class })
public class AllTests 
{
	@Before 
	public void input1()
	{
		System.out.println("Brfore Annotation ");
		
	}
	
	@Test 
	public void output()
	{
		System.out.println("Test Annotation ");
		
	}
	@After
	public void input()
	{
		System.out.println("After Annotation ");
		
	}
	
}
class ABC
{
	@BeforeClass
	public static void display() 
	{
		System.out.println("Brfore Class Annotation ");
	}
	
	@AfterClass
	public static void print() 
	{
		System.out.println("After Class Annotation ");
	}
}
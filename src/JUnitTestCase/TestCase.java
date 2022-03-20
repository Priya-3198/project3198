package JUnitTestCase;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import JUnit.Sum;
public class TestCase 
{
	@Test
	public void test() 
	{
		System.out.println("This  is another test method ");
		Sum s = new Sum();
		int res=s.sum(5,5);
		Assert.assertEquals(10, res);

	}
}

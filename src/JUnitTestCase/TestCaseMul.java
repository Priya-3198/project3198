package JUnitTestCase;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

import JUnit.Mul;
import junit.framework.Assert;

import org.junit.Test;

public class TestCaseMul 
{
	
	@Test
	public void test() 
	{
		Mul m = new Mul();
		int a =m.mul(5,5);
		Assert.assertEquals(25, a);
		
	}
	
}

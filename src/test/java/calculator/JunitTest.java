package calculator;


import junit.framework.*;

public class JunitTest extends TestCase
{
	protected double first, second, expectedresult;
	protected void setUp()
	{
		first = 18;
		second = 9;
		
	}
	
	public void testAdd()
	{
		Add add = new Add(first,second);
		expectedresult = 27;
		assertEquals(expectedresult, add.calculate());
		
	}
	
	public void testSub()
	{
		Sub sub = new Sub(first, second);
		expectedresult = 9;
		assertEquals(expectedresult, sub.calculate());
	}
	
	public void testMultiply()
	{
		Multiply multiply = new Multiply(first, second);
		expectedresult = 162;
		assertEquals(expectedresult, multiply.calculate());
	}
	
	public void testDiv()
	{
		Div div = new Div(first, second);
		expectedresult = 2;
		assertEquals(expectedresult, div.calculate());
	}
}

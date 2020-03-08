package task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest 
{

	Calci oc=new Calci();
	@Test
	public void testadd()
	{
		assertEquals(80,oc.add(40,40));
	}
	@Test
	public void testsub()
	{
		assertEquals(80,oc.sub(240,160));
	}
	@Test
	public void testmul()
	{
		assertEquals(16,oc.mul(2,8));
	}
	@Test
	public void testdiv()
	{
		assertEquals(8,oc.div(16,2));
	}

}


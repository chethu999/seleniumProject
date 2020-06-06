package testNG2;

import  org.testng.Assert;

import org.testng.SkipException;
import org.testng.annotations.Test;




public class PayementTest 
{
	@Test
	public void paymentinDoller()
	{
		System.out.println("Payment in Doller");
		//throw new SkipException("payment in doller not supported");
	}
	@Test
	public void paymentinRupee()
	{
		System.out.println("Payment in Rupee");
		//throw new SkipException("payement in rupee is not supported");
		try {
			Assert.assertFalse(2>4);
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("after the excecution");
	}
	
	@Test
	public void paymentinEuro()
	{
		System.out.println("Payment in Rupee");
		//Assert.assertEquals("chethan", "chethan");
		//Assert.assertEquals("chethan", "chethan1");
		//Assert.assertEquals(1, 2);
		//Assert.assertTrue(1<2);
	}
}

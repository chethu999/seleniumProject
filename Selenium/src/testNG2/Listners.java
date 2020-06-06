package testNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listners
{
	@Test(priority = 1)
	public void loginEmail() 
	{
		System.out.println("Eamil login");
	}
	@Test(priority = 2)
	public void LoginFacebook()
	{
		System.out.println("facebook login");
		//Assert.assertEquals("test", "test1");
	}
}

package testNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportingTest
{
	@Test
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void logout()
	{
		System.out.println("logout");
		Assert.assertSame("test", "test1");
	}
}

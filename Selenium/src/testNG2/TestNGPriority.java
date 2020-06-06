package testNG2;
import  org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPriority
{
	
	/*
	 * @Test(priority=3) public void Login() { System.out.println("Log In"); }
	 * 
	 * @Test(priority=2) public void Navigating() {
	 * System.out.println("Navigating"); }
	 * 
	 * @Test(priority=1) public void Logout() { System.out.println("log Out"); }
	 */
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Log In");
		
	}
	@Test(dependsOnMethods = {"Login"})
	public void Navigating()
	{
		System.out.println("Navigating");
		Assert.assertEquals("chethan", "chethan1");
	}
	@Test(dependsOnMethods = {"Login","Navigating"})
	public void Logout()
	{
		System.out.println("log Out");
	}
}

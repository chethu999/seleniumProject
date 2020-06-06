package testNG2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters 
{
	@Parameters("Email")
	@Test
	public void login(String email)
	{
		System.out.println("Login");
		System.out.println(email);
	}
}

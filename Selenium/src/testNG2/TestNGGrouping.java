package testNG2;

import org.testng.annotations.Test;

public class TestNGGrouping 
{
	@Test(groups = {"performance"})
	public void feature1() 
	{
		System.out.println("feature1");
	}
	@Test(groups = {"regression"})
	public void feature2() 
	{
		System.out.println("feature2");
	}
	@Test(groups = {"performance","performance"})
	public void feature3() 
	{
		System.out.println("feature3");
	}
}

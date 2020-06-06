package testNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo1 
{		
	  @BeforeClass
	  public void beforeClass() 
	  {
		System.out.println("initilize the selenium for class 1");  
	  }
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  System.out.println("open the browser");
	  }
	  @Test
	  public void test1()
	  {
		  System.out.println("inside test1 ");
	  }
	  @Test
	  public void test2()
	  {
		  System.out.println("inside test2 ");
	  }
	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("close the browser");
	  }
	  @AfterClass
	  public void afterClass() 
	  {
		System.out.println("destroy the selenium for class 1");  
	  }
}

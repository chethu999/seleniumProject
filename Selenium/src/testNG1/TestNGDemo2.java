package testNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 
{
	  @BeforeSuite
	  public void beforeSuit() 
	  {
		  System.out.println("starting testNG");
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("start the execution");
	  }
	  @BeforeClass
	  public void beforeClass() 
	  {
		System.out.println("initilize the selenium for class 2");  
	  }
  
	  @Test
	  public void test3()
	  {
		  System.out.println("inside test3");
	  }
	  @AfterClass
	  public void afterClass() 
	  {
		System.out.println("Destroy the selenium for class 2");  
	  }
	  @AfterTest
	  public void afterTest()
	  {
		  System.out.println("end the execution");
	  }
	  @AfterSuite
	  public void afterSuit()
	  {
		System.out.println("stop the testNG");  
	  }

}

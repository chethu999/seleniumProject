package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class vtiger
{
	WebDriver driver=null;

	@BeforeClass
	public void configBc() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\PracticeSelnium\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS)	;
		
		driver.get("http://localhost:8888/");

	}
	@BeforeMethod
	public void cofigBm() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("manager",Keys.ENTER);	
	}
	
	@AfterMethod
	public void configAM() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[contains(@src,'user.PNG')]")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass
	public void configAc()
	{
		driver.quit();
	}
	@Test
	public void t1()
	{
		System.out.println("test1");
	}
	@Test
	public void t2()
	{
		System.out.println("test2");
	}
	@Test
	public void t3()
	{
		System.out.println("test3");
	}
}

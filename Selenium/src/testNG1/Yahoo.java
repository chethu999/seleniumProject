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

public class Yahoo 
{
	WebDriver driver=null;

	@BeforeClass
	public void configBc() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\PracticeSelnium\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		
		driver.get("https://mail.yahoo.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}
	@BeforeMethod
	public void cofigBm() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(200);
		driver.findElement(By.name("username")).sendKeys("elfselenium@yahoo.com",Keys.ENTER);
		Thread.sleep(50);
		driver.findElement(By.id("login-password")).sendKeys("900889424@elft",Keys.ENTER);
	}
	@AfterMethod
	public void configAM()
	{
		
	}
	@AfterClass
	public void configAc()
	{
		driver.close();
	}
}

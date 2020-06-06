package javaScritExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutorDemo1 
{
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/V4/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("doucment.getElemntByname('uid').value='mngr34926'");
//		js.executeScript("doucment.getElemntByname('password').value='amUpenu'");
		
		driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");
		WebElement button =driver.findElement(By.name("btnLogin"));
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(200);
		js.executeScript("alert('Welcome to Guru99');");   
		
	
		
	}
}


package calenderHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo2
{
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/");
		WebElement date = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		date.sendKeys("09252013");
		date.sendKeys("0245PM");
		
	}
}

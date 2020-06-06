package FrameHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo3
{
	static ChromeDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("file:///G:/HTML/iframe.html");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frames:"+frames.size());
		//switching frame by index
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@id=\"qsb-keyword-sugg\"]")).sendKeys("developer");
		driver.findElement(By.xpath("//*[@id=\"qsb-location-sugg\"]")).sendKeys("mangalore",Keys.ENTER);
		driver.switchTo().defaultContent();

	}
}

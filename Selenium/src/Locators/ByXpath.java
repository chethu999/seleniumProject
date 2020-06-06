package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		//driver.findElement(By.tagName("input")).sendKeys("shgk");
		//driver.findElement(By.className("psid")).sendKeys("shgk");
		driver.findElement(By.partialLinkText("View")).click();
	}

}

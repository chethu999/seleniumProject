package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByclassName {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///G:/HTML/l.html");
		
		driver.findElement(By.className("user")).sendKeys("shgk");
		driver.findElement(By.className("psid")).sendKeys("shgk");
		driver.findElement(By.className("li")).click();		
		
	}

}

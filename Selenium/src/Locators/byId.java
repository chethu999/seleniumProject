package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class byId {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///G:/HTML/l.html");
		driver.findElement(By.id("uid")).sendKeys("shgs");
		driver.findElement(By.id("pid")).sendKeys("shgs");
		driver.findElement(By.id("lgin")).click();
	}

}

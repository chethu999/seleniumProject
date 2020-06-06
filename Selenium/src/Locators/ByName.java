package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///G:/HTML/l.html");
		driver.findElement(By.name("username")).sendKeys("shgs");
		driver.findElement(By.name("password")).sendKeys("shgs");
		//driver.findElement(By.name("login")).click();

	}

}

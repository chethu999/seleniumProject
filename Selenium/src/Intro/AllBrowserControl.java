package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllBrowserControl {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(100, 200));
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://localhost/login.do");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		//driver.close();
	}

}

package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookbrowserControl {
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(100, 200));
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.id("email")).sendKeys("chethupoojary300@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("8495887514");
		
		driver.findElement(By.id("u_0_2")).click();
		
		driver.close();
	}

}

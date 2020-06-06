package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Identification {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.bing.com");
		
		WebElement searchbox=driver.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("chethan",Keys.ENTER);
		 
		
	}

	

}

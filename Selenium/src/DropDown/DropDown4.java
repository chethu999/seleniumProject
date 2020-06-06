package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement day= driver.findElementById("day");
		WebElement month = driver.findElementById("month");
		WebElement year = driver.findElementById("year");
		
	
		String s="10-9-1996";
		String s1[]=s.split("-");
		
		dropDownByValue(day, s1[0]);
		dropDownByValue(month, s1[1]);
		dropDownByValue(year,s1[2]);
		
		
		
	}
	public static void dropDownByValue(WebElement we, String value) 
	{
		Select day= new Select(we);
		day.selectByValue(value);
	}

}

package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {

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
		
		
		dropDownById(day, 9);
		dropDownById(month, 7);
		dropDownById(year,25);
		
	
		
		dropDownByValue(day, "8");
		dropDownByValue(month, "8");
		dropDownByValue(year,"1999");
		
		
		
		dropDownByVisibleText(day, "10");
		dropDownByVisibleText(month, "Jan");
		dropDownByVisibleText(year,"2000");
	}
	public static void dropDownById(WebElement we, int index) 
	{
		Select day= new Select(we);
		day.selectByIndex(index);
	}
	public static void dropDownByValue(WebElement we, String value) 
	{
		Select day= new Select(we);
		day.selectByValue(value);
	}
	public static void dropDownByVisibleText(WebElement we, String visible) 
	{
		Select day= new Select(we);
		day.selectByVisibleText(visible);
	}

}

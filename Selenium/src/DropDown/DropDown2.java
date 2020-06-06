package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement day_ele = driver.findElementById("day");
		WebElement month_ele = driver.findElementById("month");
		WebElement year_ele = driver.findElementById("year");
		
		
		Select day= new Select(day_ele);
		day.selectByIndex(9);
		
		Select month= new Select(month_ele);
		month.selectByValue("7");
		
		Select year= new Select(year_ele);
		year.selectByVisibleText("1996");


		
		
		
	}

}

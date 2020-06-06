package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown6
{
		
	static ChromeDriver driver;
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
		String dayXpath="//select[@id='day']//option";
		String monthXpath="//select[@id='month']//option";
		String yearXpath="//select[@id='year']//option";
		
		
		selectDropDownByValue(dayXpath,"9");
		selectDropDownByValue(monthXpath,"Feb");
		selectDropDownByValue(yearXpath,"1996"); 
	}
	public static void selectDropDownByValue(String xpath,String value)
	{
		List<WebElement> listvalue = driver.findElementsByXPath(xpath);
		System.out.println(listvalue.size());
		for (int i = 0; i < listvalue.size(); i++) 
		{
			String text=listvalue.get(i).getText();
			System.out.println(text);
			if (text.equals(value))
			{
				listvalue.get(i).click();
				break;
			}
		}
	}
}

package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown5 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> monthList = driver.findElementsByXPath("//select[@id='month']//option");
		System.out.println(monthList.size());
		
		
		for (int i = 0; i < monthList.size() ; i++) 
		{
			String text=monthList.get(i).getText();
			System.out.println(text);
			if (text.equals("Jul")) 
			{
				monthList.get(i).click();	
				break;
				
			}
		}
		
		
	}

}

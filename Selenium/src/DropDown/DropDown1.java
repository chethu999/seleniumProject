package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class DropDown1 {

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
		
		
		Select month= new Select(month_ele);
		List<WebElement> op = month.getOptions();
		int count = op.size();
		System.out.println(count);
		
		for (int i = 0; i < op.size(); i++)
		{
			String text=op.get(i).getText();
			System.out.println(text);
			if (text.equals("Jul"))
			{
				op.get(i).click();
				break;
			}
		}
		
	}
	

}

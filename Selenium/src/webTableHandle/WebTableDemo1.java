package webTableHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo1
{
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> rows = driver.findElementsByXPath("//table[@id=\"customers\"]//tbody//tr");
		
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		String content="Ernst Handel";
		for (int i = 2; i <=rows.size(); i++)
		{
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if (element.getText().equals("Ernst Handel"))
				
			{
				System.out.println("the company name: "+element.getText()+ "  is found at postion :"+(i-1) );
				break;
			}
		}
		
		
	}
	
}

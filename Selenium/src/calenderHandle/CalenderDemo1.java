package calenderHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo1 
{
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "G:\\GitHub\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		String date="09-07-1996";
		WebElement element = driver.findElement(By.id("view_fulldate_id_1"));
		selectDate(element, date);
		
	}
	public static void selectDate(WebElement element,  String date) 
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');",element );
	}
//	public static void selectDate(WebElement element,  String date) 
//	{
//		JavascriptExecutor js1=((JavascriptExecutor)driver);
//		String script= "arguments[0].setAttribute('value','"+date+"');";
//		js.executeScript(script,element );
//	}
}

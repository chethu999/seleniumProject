package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseANDkey {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		Actions actions=new Actions(driver);
		WebElement element = driver.findElement(By.id("email"));
		
		actions.moveToElement(element)
		.click()
		.sendKeys(element, "hello").build().perform();
		//.keyUp(element, Keys.SHIFT)
		//.doubleClick(element)
		//.contextClick()
		//.build()
		
	}

}

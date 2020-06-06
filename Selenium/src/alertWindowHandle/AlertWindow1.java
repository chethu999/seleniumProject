package alertWindowHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This simple alert displays some information or warning on the screen.
//Prompt Alert asks some input from the user and selenium webdriver can enter the text using sendkeys(" input…. ").
//confirmation alert asks permission to do some type of operation.
public class AlertWindow1 
{
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		Alert alertWindow = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alertWindow.getText());
		alertWindow.accept();
		//alertWindow.dismiss();
		//alertWindow.sendKeys("yes");
	}
}

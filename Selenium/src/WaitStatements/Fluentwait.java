package WaitStatements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fluentwait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	
		driver.get("file:///G:/HTML/copy.html");
		
		
		driver.findElementByXPath("//input[@value='abc']").sendKeys(Keys.CONTROL+"a",Keys.CONTROL+"c");
		driver.findElementByXPath("//input[@value='abc']").sendKeys(Keys.CONTROL+"a",Keys.CONTROL+"v");

		
	}

}

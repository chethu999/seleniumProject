package WaitStatements;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class impliciWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()=\"Click me to start timer\"]").click();
		
		WebElement element = driver.findElementByXPath("//p[text()='WebDriver']");
		if (element.isDisplayed())
		{
			System.out.println("Web driver is displayed");
		}
		else 
		{
			System.out.println("webdriver is not displayed");
		}
		
		driver.close();
		
		
	}

}

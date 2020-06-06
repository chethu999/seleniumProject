package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElementByName("q").sendKeys("wipro jobs");
		
		
	}

}

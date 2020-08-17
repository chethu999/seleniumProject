package multipleWindowHandle;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopUp
{
	
	@Test
	public static void test()
	{ 
		System.setProperty("webdriver.chrome.driver", "G:\\GitHub\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\Hp\\Pictures\\tech news1.jpg");
		driver.findElementByXPath("//input[@id='terms']").click();
		driver.findElementByXPath("//button[@id='submitbutton']").click();
		
	}
}

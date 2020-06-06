package FrameHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo4 
{
	static ChromeDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		
		//Commented the code for finding the index of the element
	  /*  for(int i=0; i<=size; i++)
	    {
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
	    }*/
	  
	    driver.switchTo().frame(0); //Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
	    
	}
}

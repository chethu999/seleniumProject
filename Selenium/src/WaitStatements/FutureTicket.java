package WaitStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FutureTicket 
{
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Hp/Downloads/customwait.html");
		int time=1;
		int maxTime=60;
		while (time<=maxTime)
		{
			try
			{
				driver.findElement(By.id("password"));
				break;
			}
			catch (Exception e)
			{
				System.out.println(time);
				Thread.sleep(50);
				time++;
			}
		}

	}
}

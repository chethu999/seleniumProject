package multipleWindowHandle;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow2 
{
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		//when we have multiple tab s open and you want navigate to a specif tab 
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> list = driver.getWindowHandles();
		System.out.println("total window: "+list.size());
		
		
		ArrayList< String> tab=new ArrayList<String>(list);
		driver.switchTo().window(tab.get(2));
		driver.manage().window().maximize();
		driver.close();
		
		driver.switchTo().window(tab.get(1));
		driver.manage().window().maximize();
		driver.close();
		
		
		driver.switchTo().window(tab.get(0));
		
		System.out.println(driver.getTitle());
		
		
 		
	}
}

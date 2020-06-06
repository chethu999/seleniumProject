package multipleWindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow3 
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
		System.out.println("parent window id:"+parent);
		
		Set<String> list = driver.getWindowHandles();
		System.out.println("total window: "+list.size());
		
		Iterator<String> tabs = list.iterator(); 
		
		String tab0 = tabs.next();
		System.out.println("parent window:"+tab0);
		
		String tab1 = tabs.next();
		System.out.println("child1 window:"+tab1);
		
		String tab2 = tabs.next();
		System.out.println("child2 window:"+tab2);
		
		driver.switchTo().window(tab1);
		System.out.println("child title:"+driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(tab2);
		System.out.println("child title:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tab0);
		System.out.println("parent title:"+driver.getTitle());
		
	}
}

package multipleWindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {
	
	//1)..alerts-javascript popup-alert API(accept, dismiss)
	//2).. File Upload POPup -- browser button (type -file Sendkeys(path))
	//3)..Browser Window POPUp--advertisment popup(window handler API - getwindowHandles())
	
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> list = driver.getWindowHandles();
		System.out.println("total window: "+list.size());
		
		for (String string : list)
		{
			if (!parent.equalsIgnoreCase(string))
			{
				driver.switchTo().window(string);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("the parent title: "+driver.getTitle());
		
	}

}

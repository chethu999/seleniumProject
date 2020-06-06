package Intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
	//	String pageSource=driver.getPageSource();
	 //   System.out.println(pageSource);
		
		String winhand =driver.getWindowHandle();
		System.out.println("session id:  "+winhand);

	}

}

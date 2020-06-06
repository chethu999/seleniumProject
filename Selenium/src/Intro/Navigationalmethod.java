package Intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationalmethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.bing.com");
		
		//navigate to gmail.com
		driver.navigate().to("http://gmail.com");
		
		//navigate back to previous method
		driver.navigate().back();
		
		//navigate to forward method
		driver.navigate().forward();
		
		//refresh th same page
		driver.navigate().refresh();

	}

}

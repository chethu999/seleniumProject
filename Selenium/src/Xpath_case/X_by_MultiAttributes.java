package Xpath_case;

import org.openqa.selenium.chrome.ChromeDriver;

public class X_by_MultiAttributes {
	static
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElementByXPath("//input[@name='q'][@class='gLFyf gsfi']").sendKeys("chethan");
		driver.findElementByXPath("(//input[@class='gNO89b'][@name='btnK'])[2]").click();

	}

}

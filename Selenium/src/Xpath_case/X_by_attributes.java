package Xpath_case;

import org.openqa.selenium.chrome.ChromeDriver;

public class X_by_attributes {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElementByXPath("//input[@id=\"username\"]").sendKeys("admin");
		driver.findElementByXPath("//input[@name=\"pwd\"]").sendKeys("manager");
		driver.findElementByXPath("//a[@id=\"loginButton\"]").click();
	}

}

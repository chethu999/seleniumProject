package prac;

import org.openqa.selenium.chrome.ChromeDriver;

public class logintestacitime {

	public static void main(String[] args) throws InterruptedException
	{
		//open the browser
		System.setProperty("webdriver.chrome.driver","G:\\TY Selenium\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("http://localhost/login.do");
		
		//enter the usernmae
		driver.findElementById("username").sendKeys("admin");
		
		//enter the password
		driver.findElementByName("pwd").sendKeys("manager");
		
		//click on login
		driver.findElementByXPath("//div[.='Login ']").click();
		
		Thread.sleep(3000);
		
		String cururl=driver.getCurrentUrl();
		System.out.println(cururl);
		
		if (cururl.equals("http://localhost/user/submit_tt.do")) 
		{
			System.out.println("login pass");
		}
		else 
		{
			System.out.println("login fail");
		}
		
	}

}

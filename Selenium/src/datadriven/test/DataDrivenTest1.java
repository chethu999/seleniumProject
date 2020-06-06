package datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest1 
{
	static ChromeDriver driver;
	static int count=0;
	public static void main(String[] args) throws InterruptedException
	{ 

		//to get the test data from excel
		Xls_Reader reader=new Xls_Reader("G:\\TY Selenium\\Selenium\\src\\testData\\login.xls.xlsx");
		int rowCount = reader.getRowCount("login");
		
		reader.addColumn("login", "Status");
				
		
		
		//webdriver  code
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		
		//data driven approach-- - is used to create data driven framework:driving test case from excel files
		
		//parameterization
		for (int row= 2; row<=rowCount; row++)
		{
			count++;
			String username=reader.getCellData("login", "UserName", row);
			String password=reader.getCellData("login", "Password", row);
			
			//enter the data
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(username);
			
			
			driver.findElement(By.name("pwd")).clear();
			driver.findElement(By.name("pwd")).sendKeys(password);
			
			String title1 = driver.getTitle();
			
			System.out.println(title1);
			
			driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
			Thread.sleep(200);
			String title = driver.getTitle();
			if (title.equalsIgnoreCase("actiTIME - Enter Time-Track")) 
			{
				System.out.println(title);
				System.out.println("the test is pass");
				reader.setCellData("login", "Status", row, "pass");
				driver.findElementById("logoutLink").click();
				
			}
			else {
				System.out.println(title);
				System.out.println("the test is fail");
				reader.setCellData("login", "Status", row, "Fail");
				
			}
		}
		System.out.println(count);
	}
}

package calenderHandle;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CalenderDemo3 
{
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "G:\\\\TY Selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		
		String dateTime ="08/09/1996 2:30 AM";
		 
		WebElement element = driver.findElementByXPath("//span[@aria-controls='datetimepicker_dateview']");
		element.click();
		//button to move next in calendar
		WebElement nextLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));
		//button to click in center of calendar header
		WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));
		//button to move previous month in calendar
		WebElement previousLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]")); 
		
		//Split the date time to get only the date part
		String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
		
		//get the year difference between current year and year to set in calander
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(yearDiff);
		
		 midLink.click();
		 
		 if(yearDiff!=0)
		 {
			 //if you have to move next year
	            if(yearDiff>0)
	            {

	                for(int i=0;i< yearDiff;i++)
	                {

	                    System.out.println("Year Diff->"+i);

	                    nextLink.click();

	                }

	            }
		
		 }
		 //if you have to move previous year
         if(yearDiff<0)
         {
        	 System.out.println("i am here");
             for(int i=0;i< (yearDiff*(-1));i++)
             {

                 System.out.println("Year Diff->"+i);

                 previousLink.click();

             }

         }
		 Thread.sleep(1000);
		 //Get all months from calendar to select correct one
		 List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		 list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
		 
		//get all dates from calendar to select correct one
	     List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
	     list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
	     
		///FOR TIME
		 WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));
		 selectTime.click();
		 
		 List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
		 dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];
		 (dateTime.split(" ")[0]).split("/");

		
		 	//select correct time
	        for (WebElement webElement : allTime)
	        {

	            if(webElement.getText().equalsIgnoreCase(dateTime))

	            {

	                webElement.click();

	            }

	        }
     }

}


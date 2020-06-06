package Intro;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FFdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\TY Selenium\\Selenium\\driver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

	}

}

package priya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class firefox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();
	     driver.get("https://chromedriver.chromium.org/downloads");
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
	     
		///DesiredCapabilities dc = DesiredCapabilities
		//dc.setCapability("marionette", true);
		//WebDriver driver =  new FirefoxDriver();
		//driver.get("http://google.com/");		
	     

	}

}

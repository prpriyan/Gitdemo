package priya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChrmDri {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		        
		        
		     WebDriver driver = new ChromeDriver();
		     driver.get("https://chromedriver.chromium.org/downloads");
		     System.out.println(driver.getTitle());
		     System.out.println(driver.getCurrentUrl());
		     driver.close();
		     
		     
			}

}

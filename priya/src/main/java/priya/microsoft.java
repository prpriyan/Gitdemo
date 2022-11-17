package priya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class microsoft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		 WebDriver driver = new EdgeDriver();
	     driver.get("https://chromedriver.chromium.org/downloads");
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
	     

	}

}

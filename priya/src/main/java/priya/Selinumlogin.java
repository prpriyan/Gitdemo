package priya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinumlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(((WebElement) By.cssSelector("input(placeholder='username')")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@id=inputUsername']")).sendKeys("Priya");
		driver.findElement(By.id("inputUsername")).sendKeys("Priya");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.print(driver.findElement(By.className("error")).getText());
		//Driver.findElement(By.cssSelector(null))
		
		

	}

}

package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_CheckingEnvironment{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		// Setup browser driver
		System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver 2");
		// Khởi tạo browser
		driver = new FirefoxDriver();
		// Set timeout tìm element
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Phóng to window
		driver.manage().window().maximize();
		// Navigate tới 1 website
		driver.get("https://demo.nopcommerce.com");
	}

	@Test
	public void TC_01_() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ID
		System.out.println("Before ID: ");
		driver.findElement(By.id("Email"));
		System.out.println("After ID: ");
		
		// Class
		System.out.println("Before CLASS: ");
		driver.findElement(By.className("password"));
		System.out.println("After CLASS: ");
		
	}



	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
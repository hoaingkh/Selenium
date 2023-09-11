package seleniumwebdriver;

import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_13_WebDriver_Wait{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	JavascriptExecutor jsExecutor;
	// Khai bao bien
	WebDriverWait explicitWait;
	// Khai bao bien Alert
	Alert alert;
	//User Action
	Actions action;
	//Check xem may la macbook hay window
	String osName = System.getProperty("os.name");

	

	@BeforeClass
	public void beforeClass() {
		// Setup browser driver
		System.setProperty("webdriver.chrome.driver", projectPath + "/browserDrivers/chromedriver");
		// Khởi tạo browser
		driver = new ChromeDriver();
		// Phóng to window
		driver.manage().window().maximize();
		// Navigate tới 1 website
		jsExecutor = (JavascriptExecutor)driver;
		jsExecutor = (JavascriptExecutor)driver;
		//Khai bao Action
		action = new Actions(driver);
		//Khai bao Explicit Wait
		explicitWait = new WebDriverWait(driver,10);
		// Set timeout tìm element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}
	
//	@Test
//	public void TC_01() {
//       driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
//       explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div#start button")));
//       driver.findElement(By.cssSelector("div#start button")).click();
//       explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div#finish h4")));
//       Assert.assertEquals(driver.findElement(By.cssSelector("div#finish h4")).getText(), "Hello World!");
//	}
	
	@Test
	public void TC_02_Mixing () {
		driver.get("https://www.facebook.com/");
		System.out.print("Start time: " + getCurrentTime());
		WebElement txbEmail = driver.findElement(By.id("email"));
		System.out.print("End time: " + getCurrentTime());
		
	}

	private String getCurrentTime() {
		Date date = new Date(0);
		return date.toString();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
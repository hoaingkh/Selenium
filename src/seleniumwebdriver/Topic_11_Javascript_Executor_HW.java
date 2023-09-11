package seleniumwebdriver;

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

public class Topic_11_Javascript_Executor_HW{
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
		// Set timeout tìm element
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Phóng to window
		driver.manage().window().maximize();
		// Navigate tới 1 website
		jsExecutor = (JavascriptExecutor)driver;
		// Khai bao bien
		explicitWait = new WebDriverWait(driver, 15);
		jsExecutor = (JavascriptExecutor)driver;
		//Khai bao Action
		action = new Actions(driver);
		
	}
	
	@Test
	public void TC_01_Javascript_Excecutor() throws InterruptedException {
		jsExecutor.executeScript("window.location = 'http://live.techpanda.org/'");
		String domain = (String) jsExecutor.executeScript("return document.domain");
		String URL = (String) jsExecutor.executeScript("return document.URL");
		jsExecutor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Mobile']")));
		jsExecutor.executeScript("arguments[0].click();", driver.findElement(By
				.xpath("//a[text()='Samsung Galaxy']//parent::h2//following-sibling::div[@class='actions']//button")));
		By.xpath("//ul[@class='messages']//span");
		String sText = jsExecutor.executeScript("return document.documentElement.innerText;").toString();

		jsExecutor.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//a[text()='Customer Service']")));
		String pagetitle = jsExecutor.executeScript("return document.title;").toString();

		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//span[text()='Newsletter']")));
		driver.findElement(By.xpath("//span[text()='Newsletter']")).sendKeys("hoai987@gmail.com");
		jsExecutor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Subscribe']")));
		String sText2 = jsExecutor.executeScript("return document.documentElement.innerText;").toString();

		jsExecutor.executeScript("window.location = 'http://demo.guru99.com/v4/'");
		String domain2 = (String) jsExecutor.executeScript("return document.domain");
		Assert.assertEquals(domain2, "http://demo.guru99.com/v4/");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
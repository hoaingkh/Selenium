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

public class Topic_10_Windows_Tab{
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
	
//	@Test
//	public void TC_01_Windows_Tab() throws InterruptedException {	
//		driver.get("https://demo.guru99.com/popup.php");
//		//Lay current WindowsID
//		String currentWindowsID = driver.getWindowHandle();
//		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//		
//		//Lay WindowsID tiep theo
//		String currentWindowsID2 = driver.getWindowHandle();
//		
//		//Tao lai WindowsID thanh 1 set
//		Set<String> allWindowsID = driver.getWindowHandles();
//		
//	    //Dat truoc bien de tao vong lap
//		String switchWindowsID = "";
//		
//		//
//		for(String WindowsID: allWindowsID) {
//			switchWindowsID = WindowsID;
//		}
//		
//		driver.switchTo().window(switchWindowsID);
//		
//		//De WindowsID chay qua het allWindowsID -> currentID la cai dau tien, neu sang toi cai ID th2 (khac cai dau tien) thi se switch to WindowsID th2
//		for(String WindowsID: allWindowsID) {
//			if(!WindowsID.equals(currentWindowsID)) {
//				driver.switchTo().window(WindowsID);
//			}
//		}
//		
//		driver.findElement(By.xpath("//input[@name = 'emailid']")).sendKeys("automation");
//	}
	
//	@Test
//	public void TC_02() throws InterruptedException {
//		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
//		driver.findElement(By.xpath("//input[@type='url']")).sendKeys("https://tiki.vn/");
//		driver.findElement(By.xpath("//a[text()='  Open URL ']")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@type='url']")).clear();
//		driver.findElement(By.xpath("//input[@type='url']")).sendKeys("https://google.com/");
//		driver.findElement(By.xpath("//a[text()='  Open URL ']")).click();
//		Thread.sleep(3000);
//		
//		Set<String> allWindowsID = driver.getWindowHandles();
//		
//		for(String runWindow: allWindowsID) {
//			driver.switchTo().window(runWindow);
//			if(driver.getTitle().equals("Google")) {
//				break;
//				
//			}
//		}
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("macbook");
//		
//		Thread.sleep(3000);
//	}
	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
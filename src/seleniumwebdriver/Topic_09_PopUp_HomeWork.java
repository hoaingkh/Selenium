package seleniumwebdriver;

import java.util.List;
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

public class Topic_09_PopUp_HomeWork{
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
//	public void TC_01_Fixed_PopUp_InDOM() throws InterruptedException {
//		driver.get("https://ngoaingu24h.vn/");
//		
//		List<WebElement> popup = driver.findElements(By.xpath("//div[@class='modal-content']"));
////		Assert.assertTrue(popup.size() == 0);
//		
//		WebElement Login = driver.findElement(By.xpath("//button[@class='login_ icon-before']"));
//		Login.click();
//		
//		popup = driver.findElements(By.xpath("//div[@class='modal-content']"));
//		Assert.assertTrue(popup.size() > 0);
//		
//		driver.findElement(By.xpath("//input[@id = 'account-input']")).sendKeys("automation");
//		driver.findElement(By.xpath("//input[@id = 'password-input']")).sendKeys("automation");
//		
//		driver.findElement(By.xpath("//div[@class='modal fade in']//button[@data-text='Đăng nhập']")).click();
//		
//		String Verify = driver.findElement(By.xpath("//div[@class='modal fade in']//div[@class='row error-login-panel']")).getText();
//		Assert.assertEquals(Verify, "Tài khoản không tồn tại!");
//
//	}
	
//	@Test
//	public void TC_02_Fixed_PopUp_InDOM() throws InterruptedException {
//		driver.get("https://kyna.vn/");
//		List<WebElement> popup = driver.findElements(By.xpath("//div[@class='k-popup-account-mb-content']"));
//		Assert.assertTrue(popup.size() == 0);
//		
//		driver.findElement(By.xpath("//a[@class='login-btn']")).click();
//		
//		popup = driver.findElements(By.xpath("//div[@class='k-popup-account-mb-content']"));
//		Assert.assertTrue(popup.size() > 0);
//		
//		driver.findElement(By.xpath("//input[@name='login-form[login]']")).sendKeys("automation@gmail.com");
//		driver.findElement(By.xpath("//input[@id='user-password']")).sendKeys("123456");
//		
//		driver.findElement(By.xpath("//button[@id='btn-submit-login']")).click();
//		
//		Thread.sleep(6000);
//		
//		String ErrorMess = driver.findElement(By.xpath("//div[@id='password-form-login-message']")).getText();
//		Assert.assertEquals(ErrorMess,"Sai tên đăng nhập hoặc mật khẩu");
//		
//		driver.findElement(By.xpath("//button[@class='k-popup-account-close close']")).click();
//		
//		popup = driver.findElements(By.xpath("//div[@class='k-popup-account-mb-content']"));
//		Assert.assertTrue(popup.size() > 0);
//		
//	}
	
	
//	@Test
//	public void TC_03_FixedPopUp_NotInDom() throws InterruptedException {
//		driver.get("https://tiki.vn/");
//		driver.findElement(By.xpath("//span[text()='Tài khoản']")).click();
//		driver.findElement(By.xpath("//p[@class='login-with-email']")).click();
//		driver.findElement(By.xpath("//button[text()='Đăng nhập']")).click();
//		
//		Thread.sleep(3000);
//		
//		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Email không được để trống']")).getText(), "Email không được để trống");
//		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Mật khẩu không được để trống']")).getText(), "Mật khẩu không được để trống");
//	    
//		driver.findElement(By.xpath("//img[@class='close-img']")).click();
//		
//		List<WebElement> popup = driver.findElements(By.xpath("//div[@class='styles__Root-sc-2hr4xa-0 jyAQAr']"));
//		Assert.assertTrue(popup.size() == 0);
//	
//	}
	
//	@Test
//	public void TC_04_FixedPopUp_NotInDom() throws InterruptedException {
//		driver.get("https://www.facebook.com/");
//		
//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		
//		List<WebElement> popup = driver.findElements(By.xpath("//div[@class='_8ien']"));
//		Assert.assertTrue(popup.size() > 0);
//		
//		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
//		
//        Thread.sleep(3000);
//		
//		popup = driver.findElements(By.xpath("//div[@class='_8ien']"));
//		Assert.assertTrue(popup.size() == 0);
//
//	}
	
	@Test
	public void TC_05_Random_PopUp_NotInDom() throws InterruptedException {
		driver.get("https://www.javacodegeeks.com/");

		Thread.sleep(12000);

		List<WebElement> popup = driver.findElements(By.xpath(
				"//div[@class='lepopup-element lepopup-element-2 lepopup-element-rectangle lepopup-animated lepopup-fadeIn']"));
		Assert.assertTrue(popup.size() > 0);

		if (driver.findElement(By.xpath(
				"//div[@class='lepopup-element lepopup-element-2 lepopup-element-rectangle lepopup-animated lepopup-fadeIn']"))
				.isDisplayed()) {
			driver.findElement(By.xpath("//input[@placeholder='Enter your e-mail address']"))
					.sendKeys("hoaingkh@gmail.com");
			driver.findElement(By.xpath("//a[text()='×']")).click();
		}
		Thread.sleep(3000);

		driver.findElement(By.id("search-input")).sendKeys("Selenium");
		driver.findElement(By.id("search-submit")).click();

	}
	
//	@Test
//	public void TC_06_RanDom_PopUp_InDom() {
//		driver.get("https://vnk.edu.vn/");
//
//		if (driver.findElement(By.xpath("//div[@class='tve-leads-conversion-object']")).isDisplayed()) {
//			driver.findElement(By.xpath("//div[contains(@class,' tcb-icon-display')]")).click();
//
//		}
//	}
	
//	@Test
//	public void TC_07_RanDom_PopUp_NotInDom() {
//		driver.get("https://dehieu.vn/");
//		if (driver.findElement(By.xpath("//div[@class='popup-content']")).isDisplayed()) {
//		driver.findElement(By.xpath("//button[@class='close']")).click();
//
//	}
//		
//	}
	
		
	
	
	
	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
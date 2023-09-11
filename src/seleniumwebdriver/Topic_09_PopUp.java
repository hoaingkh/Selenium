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

public class Topic_09_PopUp{
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
//	public void TC_01_Fixed_PopUp_NotInDOM() throws InterruptedException {
//       driver.get("https://ngoaingu24h.vn/");
//       WebElement btnLogin = driver.findElement(By.xpath("//div[@id='button-login-dialog']//button[contains(text(),'Đăng nhập')]"));
//       
//       //PopUp không ở trong DOM thì phải dùng List để check size của Element đó trước và sau khi click 
//       List<WebElement> allPopUp = driver.findElements(By.xpath("//div[@class='modal fade in']"));
//       
//       //Nếu có popup thì số phần tử trong list > 0 
//       //Nếu không có popup thì số phần tử trong list = 0
//       
//       WebElement txtAccount = driver.findElement(By.id("account-input"));
//       WebElement txtPassword = driver.findElement(By.id("password-input"));
//       
//       //Verify PopUp khong hien thi
//       Assert.assertTrue(allPopUp.size() == 0);
//       
//       btnLogin.click();
//       
//       //Verify PopUp hien thi
//       //Kiem lai element vi ben tren khong update nen size van dang la 0
//       allPopUp = driver.findElements(By.xpath("//div[@class='modal fade in']"));
//       Assert.assertTrue(allPopUp.size() == 1);
//       
//       
//       txtAccount.sendKeys("Automation");
//       txtPassword.sendKeys("123123");
//       
//       Thread.sleep(6000);
//	}

	
//	@Test
//	public void TC_02_Fixed_PopUp_InDOM() throws InterruptedException {
//		driver.get("https://skills.kynaenglish.vn/");
//		
//		WebElement Register = driver.findElement(By.xpath("//a[@class='register-btn']"));
//		//Đây là trường hợp PopUp nằm trong InDOM nhưng vẫn phải dùng List để 
//		List<WebElement> popup = driver.findElements(By.xpath("//div[@id='wrap-register-form-mb']//div[@class='modal-content']"));
//		
//		//Verify PopUp không hiển thị
//		Assert.assertTrue(popup.size() == 0);
//		
//		Register.click();
//		
//		popup = driver.findElements(By.xpath("//div[@id='wrap-register-form-mb']//div[@class='modal-content']"));
//		WebElement txtPhoneNumber = driver.findElement(By.id("register-form-phonenumber"));
//		WebElement txtEmail = driver.findElement(By.id("register-form-email"));
//		
//		
//		//Verify PopUp hiển thị
//		Assert.assertTrue(popup.size() == 1);
//		
//		txtPhoneNumber.sendKeys("123456789");
//		txtEmail.sendKeys("hoai@gmail.com");
		
//	}
	
//	@Test
//	public void TC_03_RanDom_PopUp_Not__Dom() {
//		driver.get("https://dehieu.vn/");
//		
//		WebElement popup = driver.findElement(By.xpath("//div[@class='popup-content']"));
//		
//	if (popup.isDisplayed()) {
//		driver.findElement(By.xpath("//button[@class='close']")).click();
//	}
//	
//		driver.findElement(By.xpath("//a[text() = 'Tất cả khóa học']")).click();
//		
//		
//	}
	
//	@Test
//	public void TC_04_RanDom_PopUP_In_Dom() {
//		driver.get("https://vnk.edu.vn/");
//	
//		
//		WebElement popup = driver.findElement(By.xpath("//div[@class=\"thrv_wrapper thrv-page-section\"]"));
//		
//		if (popup.isDisplayed()) {
//			driver.findElement(By.xpath("//div[contains(@class,'thrv_icon')]")).click();
//		}
//		
//		driver.findElement(By.xpath("//a[@title ='Giới thiệu']")).click();
//	}

	private void AssertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
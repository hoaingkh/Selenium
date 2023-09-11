package seleniumwebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_07_Button_Radio_Area{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	JavascriptExecutor jsExecutor;
	// Khai bao bien
	WebDriverWait explicitWait;
	// Khai bao bien Alert
	Alert alert;
	//Khai bao Webelement
	

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
	}
	
//	@Test
//	public void TC_01_Default_Button() {
//		driver.get("https://demo.nopcommerce.com/");
//		WebElement btnExcellent = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
//		
//		btnExcellent.click();
//		
//		Assert.assertTrue(btnExcellent.isSelected());
//		System.out.print("Is Selected: "+btnExcellent.isSelected());
//	}
	
//	@Test
//	public void TC_02_Default_Button_Hide() {
//		driver.get(projectPath);
//		//Bat element bang the input
//		WebElement btnNguoiThan = driver.findElement(By.id("mat-radio-3-input"));
//		//Click bang JavaScript
//		jsExecutor.executeScript("arguments[0].click()", btnNguoiThan);
//		
//		
//		Assert.assertTrue(btnNguoiThan.isSelected());
//		System.out.print("Is Selected: "+btnNguoiThan.isSelected());
//	}
	
//	@Test
//	public void TC_03() {
//		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Flogin");
//		WebElement btnNewsletter = driver.findElement(By.id("Newsletter"));
//		
//		checktoCheckBox(By.id("Newsletter"));
//		}
//	
//	
//	public void checktoCheckBox(By locator) {
//		jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center'})", driver.findElement(locator));
//		if (!driver.findElement(locator).isSelected()) {
//			driver.findElement(locator).click();
//	}
//	}
	
	@Test
	public void TC_04_Custom_Button() {
		driver.get("https://docs.google.com/forms/d/1qFZ26rQUeGvPhoqfU6YZO0omVi0s_9EojiKx-UANhuI/viewform?edit_requested=true");
		WebElement btnTinhThanh = driver.findElement(By.id("i5"));
		
		btnTinhThanh.click();
		
		System.out.println("Is Selected: "+btnTinhThanh.isSelected());
		//Click vao button va lay ra attribute khac biet so voi luc chua click
		String checked = btnTinhThanh.getAttribute("aria-checked");
		System.out.print("Checked: "+ checked);
		
        //lay ra gia tri khac biet
		Assert.assertEquals(checked, "true");
		


	
	
	}
     
	private void AssertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
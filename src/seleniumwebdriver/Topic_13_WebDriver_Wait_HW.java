package seleniumwebdriver;

import java.io.File;
import java.util.Date;
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

public class Topic_13_WebDriver_Wait_HW{
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
	String fileName = "API-Specification.pdf";
	String filePath = projectPath + File.separator + "uploadFiles" + File.separator + fileName;
	
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
		explicitWait = new WebDriverWait(driver,5);
		// Set timeout tìm element
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
//	@Test
//	public void TC_01_ImplicitWait() {
//		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
//		WebElement btnStart = driver.findElement(By.xpath("//button[text()='Start']"));
//		btnStart.click();
//		Assert.assertEquals(driver.findElement(By.xpath("//div[@id ='finish']//h4")).getText(), "Hello World!");
//
//	}
	
//	@Test
//	public void TC_02_StaticWait() throws InterruptedException {
//		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
//		WebElement btnStart = driver.findElement(By.xpath("//button[text()='Start']"));
//		btnStart.click();
//		Thread.sleep(10000);
//		Assert.assertEquals(driver.findElement(By.xpath("//div[@id ='finish']//h4")).getText(), "Hello World!");
//	}
	
//	@Test
//	public void TC_03_ExplicitWait_Invisible() {
//		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
//		WebElement btnStart = driver.findElement(By.xpath("//button[text()='Start']"));
//		btnStart.click();
//		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']")));
//		Assert.assertEquals(driver.findElement(By.xpath("//div[@id ='finish']//h4")).getText(), "Hello World!");
//	}

//	@Test
//	public void TC_04_ExplicitWait_Visible() {
//		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
//		System.out.print("Start time: " + getCurrentTime());
//		WebElement btnStart = driver.findElement(By.xpath("//button[text()='Start']"));
//		btnStart.click();
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id ='finish']//h4")));
//		Assert.assertEquals(driver.findElement(By.xpath("//div[@id ='finish']//h4")).getText(), "Hello World!");
//		System.out.print("Start time: " + getCurrentTime());
//
//	}
	
	@Test
	public void TC_05_ExplicitWait() throws InterruptedException {
		driver.get("https://gofile.io/?t=uploadFiles ");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//dung the input de send duoc link cua tep
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(filePath);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-auto text-center']//div[@class='alert alert-secondary border border-success text-white']")));
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='col-auto text-center']//div[@class='alert alert-secondary border border-success text-white']")).getText(), "Your files have been successfully uploaded");
		driver.findElement(By.xpath("//div[@class='col-6 text-center']//a[@class='ajaxLink']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='d-md-none d-xl-inline']")));
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='d-md-none d-xl-inline']")).getText(), "Download");
		//Vì tên file có thể thay đổi nên cần dùng String mình tự đặt để refer
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='"+fileName+"']")).isDisplayed());
	}
	
	@Test
	public void TC_06() {
		System.out.print("projectPath: " + projectPath);
//		System.out.print("filePath: " + filePath);

	}
	
	
	

	private String getCurrentTime() {
      Date date = new Date();
      return date.toString();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
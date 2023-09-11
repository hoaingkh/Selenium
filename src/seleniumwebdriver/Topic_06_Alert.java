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

public class Topic_06_Alert{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	JavascriptExecutor jsExecutor;
	// Khai bao bien
	WebDriverWait explicitWait;
	// Khai bao bien Alert
	Alert alert;

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
	public void TC_01_Accept_Alert() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		WebElement btnAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		btnAlert.click();
		//Goi driver de vao xu ly alert
		alert = driver.switchTo().alert();
		alert.accept();
		String AlertAccept = driver.findElement(By.xpath("//p[@id='result']")).getText();
		Assert.assertEquals(AlertAccept, "You successfully clicked an alert");
					 
	 }
//     @Test
     public void TC_02_Confirm_Alert() throws InterruptedException {
    	driver.get("http://the-internet.herokuapp.com/javascript_alerts");
 		WebElement btnConfirmAlert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
 		btnConfirmAlert.click();
 		alert = driver.switchTo().alert();
 		String AlertName = alert.getText();
 		Assert.assertEquals(AlertName, "I am a JS Confirm");
 		
 		alert.accept();
 		String AlertConfirmAccept = driver.findElement(By.xpath("//p[@id='result']")).getText();
 		Assert.assertEquals(AlertConfirmAccept, "You clicked: Ok");
    	 
     }
//     @Test
     public void TC_03_Prompt_Alert() throws InterruptedException {
    	driver.get("http://the-internet.herokuapp.com/javascript_alerts");
  		WebElement btnPromptAlert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
  		btnPromptAlert.click();
  		//Cu hien ra cai alert la phai goi driver vao
  		alert = driver.switchTo().alert();
  		alert.sendKeys("Hoai");
  		alert.accept();
  		
  		String AlertPromptAccept = driver.findElement(By.xpath("//p[@id='result']")).getText();
 		Assert.assertEquals(AlertPromptAccept, "You entered: Hoai");

    	 
     }
//     @Test
     public void TC_04_Authen_Alert() throws InterruptedException {
    	 driver.get("http://the-internet.herokuapp.com");
    	 WebElement BasicAuth = driver.findElement(By.xpath("//a[text()='Basic Auth']"));
    	 BasicAuth.click();
//    	 alert = driver.switchTo().alert();
    	 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    	 Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Congratulations! You must have the proper credentials.");
     }
     @Test
     public void TC_05_Authen_Alert2() throws InterruptedException {
    	 String username = "admin";
    	 String password = "admin";
    	 driver.get("http://the-internet.herokuapp.com");
    	 WebElement BasicAuth = driver.findElement(By.xpath("//a[text()='Basic Auth']"));
    	 //Lay link ra, khong click vao Webelement
    	 String linkBasicAuth = BasicAuth.getAttribute("href");
    	 //Tach thanh 2 phan ngan giua boi dau //
    	 String[] linkSplit = linkBasicAuth.split("//");
    	 //In ra link day du
    	 System.out.print("Link basic auth: "+ linkBasicAuth);
    	 //In ra nua dau cua split
    	 System.out.print("Link basic auth[0]: "+ linkSplit[0]);
    	//In ra nua sau cua split
    	 System.out.print("Link basic auth[1]: "+ linkSplit[1]);
    	 //link mowi
    	 linkBasicAuth = linkSplit[0] + "//" + username + ":" + password + "@" + linkSplit[1];
    	 //Get link moi
    	 driver.get(linkBasicAuth);
    	 Thread.sleep(5000);
    	 Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Congratulations! You must have the proper credentials.");
 	 
    	 
     }
     
	private void AssertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
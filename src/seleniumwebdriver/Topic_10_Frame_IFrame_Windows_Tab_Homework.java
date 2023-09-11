package seleniumwebdriver;

import static org.testng.Assert.assertEquals;

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

public class Topic_10_Frame_IFrame_Windows_Tab_Homework{
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

	//PASSED
//	@Test
//	public void TC_01_Iframe() throws InterruptedException {
//		driver.get("https://kyna.vn/");
//		
//		jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center'})", driver.findElement(By.xpath("//h4[text()='Kết nối với Kyna']")));
//		//Switch qua Iframe
//		driver.switchTo().frame(0);
//		
//		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='165K người theo dõi']")).getText(), "165K người theo dõi");
//		
//		//Ve lai driver cu
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame("cs_chat_iframe");
//		
//		driver.findElement(By.xpath("//div[@class='border_overlay meshim_widget_widgets_BorderOverlay']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='editing field profile_field']//input[@placeholder='Nhập tên của bạn']")).sendKeys("Hoai");
//		driver.findElement(By.xpath("//div[@class='editing field profile_field']//input[@placeholder='Nhập số điện thoại của bạn']")).sendKeys("09123456");
//		driver.findElement(By.xpath("//select[@id='serviceSelect']")).click();
//		driver.findElement(By.xpath("//select[@id='serviceSelect']//option[@value='60021729']")).click();
//		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Excel");
//		driver.findElement(By.xpath("//input[@value='Gửi tin nhắn']")).click();
//		
//		driver.switchTo().defaultContent();
//		jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center'})", driver.findElement(By.xpath("//input[@id='live-search-bar']")));
//		
//		driver.findElement(By.xpath("//input[@id='live-search-bar']")).sendKeys("Excel");
//		driver.findElement(By.xpath("//button[@class='search-button']")).click();
//		
//		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='menu-heading']")).getText(), "9 Kết quả tìm kiếm từ khóa 'Excel'");
//		
//		
//	}
	
	//PASSED
//	@Test
//	public void TC_02_Frame_IFrame() {
//		driver.get("https://ui.vision/demo/webtest/frames/");
//		
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Automation1");
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation2");
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(2);
//		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Automation3");
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(3);
//		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Automation4");
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(4);
//		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Automation5");
//		
//		
//	}
	
	@Test
	public void TC_03_Frame_IFrame() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("automation");

//		Assert.assertEquals(driver.findElement(By.xpath("//input[@type='text']")).getText(), "automation");
		
		//lam sao de xac dinh text minh vua truyen vao
	}
	
//	@Test
//	public void TC_04_Frame_Iframe() {
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//		
//		driver.switchTo().frame(2);
//		driver.findElement(By.xpath("//input[@type='text']"))
//		
//	}
	
	//PASSED
//	@Test
//	public void TC_05_Windows_Tab() {
//		driver.get("https://skills.kynaenglish.vn/");
//		String currentWindowsID = driver.getWindowHandle();
//		
//		jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center'})", driver.findElement(By.xpath("//h4[text()='Kết nối với Kyna']")));
//		
//		driver.findElement(By.xpath("//div[@class='hotline']//img[@alt='facebook']")).click();
//		String currentWindowsID2 = driver.getWindowHandle();
//		
//		Set<String> allWindowsID = driver.getWindowHandles();
//		
//		String switchWindowsID = "";
//		
//		for(String WindowsID: allWindowsID) {
//			switchWindowsID = WindowsID;
//		}
//		
//		driver.switchTo().window(switchWindowsID);
//		
//		for(String WindowsID: allWindowsID) {
//			if(!WindowsID.equals(currentWindowsID)) {
//				driver.switchTo().window(WindowsID);
//			}
//		}
//		
//		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/kyna.vn");
//
//		
//	}
	
        //passed
//		@Test
//		public void TC_06_Windows_Tab() throws InterruptedException {	
//			driver.get("https://dictionary.cambridge.org/vi/ ");
//			
//			//Lay current WindowsID
//			String currentWindowsID = driver.getWindowHandle();
//			driver.findElement(By.xpath("//span[@on='tap:amp-access.login-sign-in']//span[text()='Đăng nhập']")).click();
//			
//			//Lay WindowsID tiep theo
//			String currentWindowsID2 = driver.getWindowHandle();
//			
//			//Tao lai WindowsID thanh 1 set
//			Set<String> allWindowsID = driver.getWindowHandles();
//			
//		    //Dat truoc bien de tao vong lap
//			String switchWindowsID = "";
//			
//			//
//			for(String WindowsID: allWindowsID) {
//				switchWindowsID = WindowsID;
//			}
//			
//			driver.switchTo().window(switchWindowsID);
//			
//			//De WindowsID chay qua het allWindowsID -> currentID la cai dau tien, neu sang toi cai ID th2 (khac cai dau tien) thi se switch to WindowsID th2
//			for(String WindowsID: allWindowsID) {
//				if(!WindowsID.equals(currentWindowsID)) {
//					driver.switchTo().window(WindowsID);
//				}
//			}
//			
//			driver.findElement(By.xpath("//div[@id='login_content']//input[@type='submit']")).click();
//			
//			Assert.assertEquals(driver.findElement(By.xpath("//div[@id='login_content']//span[@data-bound-to='loginID']")).getText(), "This field is required");
//			Assert.assertEquals(driver.findElement(By.xpath("//div[@id='login_content']//span[@data-bound-to='password']")).getText(), "This field is required");
//			
//		}
		

	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
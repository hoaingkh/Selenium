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

public class Topic_08_User_Action{
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
//	public void TC_01_Hover_Element() {
//		driver.get("https://jqueryui.com/tooltip/");
//		
//		WebElement boxAge = driver.findElement(By.xpath("//input[@id = 'age']"));
//		action = new Actions(driver);
//		action.moveToElement(boxAge).perform();
//
//		WebElement tooltip = driver.findElement(By.xpath("//div[@role = 'tooltip']"));
//		Assert.assertTrue(tooltip.isDisplayed());
//		
//	}
	
//	@Test
//	public void TC_02_Hover_Element2() {
//		driver.get("http://www.myntra.com/");
//		
//}
	
//	@Test
//	public void TC_03_Hover_Element3_done() {
//		driver.get("https://www.fahasa.com/");
//		WebElement menu = driver.findElement(By.xpath("//span[@class ='icon_menu']"));
//		WebElement sachnuocngoai = driver.findElement(By.xpath("//a[@title = 'FOREIGN BOOKS']"));
//		WebElement details = driver.findElement(By.xpath("//div[@class='fhs_column_stretch']"));
//		
//		action = new Actions(driver);
//		action.moveToElement(menu).moveToElement(sachnuocngoai).perform();
//		
//		Assert.assertTrue(details.isDisplayed());
//		System.out.print(true);
//	}
	
//	@Test
//	public void TC_04_Click_And_Hold_Element() throws InterruptedException {
//		driver.get("https://jqueryui.com/resources/demos/selectable/display-grid.html");
//		//List nen la cuoi xpath phai co "li"
//		List <WebElement> allboxes = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
//		
//		Actions ChoosenItem = new Actions(driver);
//		ChoosenItem.clickAndHold(allboxes.get(0)).moveToElement(allboxes.get(3)).release().perform();
//		
//		allboxes = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
//		Thread.sleep(6000);
//		
//	    Assert.assertTrue(allboxes.get(0).getAttribute("class").contains("ui-selected"));
//	    Assert.assertTrue(allboxes.get(1).getAttribute("class").contains("ui-selected"));
//	    Assert.assertTrue(allboxes.get(2).getAttribute("class").contains("ui-selected"));
//	    Assert.assertTrue(allboxes.get(3).getAttribute("class").contains("ui-selected"));
//	}
	
//	@Test
//	public void TC_05_Select_Random_Item() {
//		driver.get("https://jqueryui.com/resources/demos/selectable/display-grid.html");
//		List<WebElement> allboxes = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
//		action = new Actions(driver);
//		
//		//Xet xem dung Control hay Command
//		Keys controlKey;
//		System.out.print("OS NAME: "+ osName);
//
//		if (osName.contains("Windows")) {
//			controlKey = Keys.CONTROL;
//		} else {
//			controlKey = Keys.COMMAND;
//		}
//
//		action.keyDown(controlKey).perform();
//		action.click(allboxes.get(0)).click(allboxes.get(2)).click(allboxes.get(5)).click(allboxes.get(10)).perform();
//		action.keyUp(controlKey).perform();

//	  allboxes = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
//    Assert.assertTrue(allboxes.get(0).getAttribute("class").contains("ui-selected"));
//    Assert.assertTrue(allboxes.get(2).getAttribute("class").contains("ui-selected"));
//    Assert.assertTrue(allboxes.get(5).getAttribute("class").contains("ui-selected"));
//    Assert.assertTrue(allboxes.get(10).getAttribute("class").contains("ui-selected"));
//	}
	
//	@Test
//	public void TC_06_Double_Click_done() {
//		driver.get("https://omayo.blogspot.com/");
//		WebElement btnDoubleClick = driver.findElement(By.xpath("//button[@ondblclick=\"dblclickAlert()\"]"));
//		
//		action = new Actions(driver);
//		action.doubleClick(btnDoubleClick).perform();
//
//		alert = driver.switchTo().alert();
//		alert.accept();
//
//	}
	
	

	private void AssertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
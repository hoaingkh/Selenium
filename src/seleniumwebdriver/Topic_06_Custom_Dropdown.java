package seleniumwebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class Topic_06_Custom_Dropdown{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	JavascriptExecutor jsExecutor;
	// Khai bao bien
	WebDriverWait explicitWait;

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
	public void TC_01_Select_option() throws InterruptedException {
		driver.get("https://tiemchungcovid19.gov.vn/portal/register-person");
		// Step 1: Click vao parent element
		WebElement parentElement = driver.findElement(By.xpath("//ng=select[@bindvalue='provinceCode']"));
		// Cho element ra center
		jsExecutor.executeScript("arguments[0].scrollIntoView({blick: center})", parentElement);
		parentElement.click();

		// Step 2: Wait cho toi khi cac element con hien ra
		explicitWait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='ng-option-label ng-star-inserted']")));
		List<WebElement> allItems = driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
		for (WebElement item : allItems) {
			if (item.getText().equals("Thành phố Hải Phòng")) {
				item.click();
				break;
			}
		}
	}
		

		public void sleepInSecond(int timeOut) {
		 try {
			Thread.sleep(timeOut*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	 

	private void AssertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
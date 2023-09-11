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

public class Topic_05_Default_Dropdown{
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
		driver.get("https://developer.snapappointments.com/bootstrap-select/examples/#multiple-select-boxes");
		Select select1 = new Select(driver.findElement(By.xpath("(//select[@class='selectpicker'])[3]")));
		select1.selectByVisibleText("Ketchup");
		Thread.sleep(3000);
		
	}
// 	@Test
	public void TC_02_Disable_OR_Able() throws InterruptedException {
		driver.get("https://demo.nopcommerce.com/");
		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		jsExecutor.executeScript("arguments[0].setAttribute('disabled', '')",SearchBox);
		Thread.sleep(5000);
		
		jsExecutor.executeScript("arguments[0].removeAttribute('disabled')",SearchBox);
		SearchBox.sendKeys("Automation");
		Thread.sleep(5000);
		
	}
	
//	@Test
	public void TC_03_Select() throws InterruptedException {
		driver.get("https://developer.snapappointments.com/bootstrap-select/examples/#multiple-select-boxes");
		Select select3 = new Select(driver.findElement(By.xpath("(//select[@class='selectpicker'])[1]")));
		select3.selectByIndex(2);
		Thread.sleep(7000);
	}
	
//	@Test
	public void TC_04_Get_all_options() throws InterruptedException {
		driver.get("https://developer.snapappointments.com/bootstrap-select/examples/#multiple-select-boxes");
		Select select3 = new Select(driver.findElement(By.xpath("(//select[@class='selectpicker'])[1]")));
		List <WebElement> select_list = select3.getOptions();
		for (WebElement list:select_list) {
			System.out.println(list.getText());
		}
	}
//	 @Test
	 public void TC_05_Custom_Dropdown_List() throws InterruptedException {
		 driver.get("https://developer.snapappointments.com/bootstrap-select/examples/#multiple-select-boxes");
			Select select5 = new Select(driver.findElement(By.xpath("(//select[@class='selectpicker'])[3]")));
			select5.selectByVisibleText("Ketchup");
			select5.selectByVisibleText("Mustard");
			Thread.sleep(5000);
	 }
//	 @Test
	 public void TC_06_Disabled_Dropdown() throws InterruptedException {
		 driver.get("https://developer.snapappointments.com/bootstrap-select/examples/#disabled");
		 Select DisabledSelectBox = new Select(driver.findElement(By.xpath("//select[@class='selectpicker']")));
		 jsExecutor.executeScript("arguments[0].removeAttribute('disabled')",DisabledSelectBox);
		 DisabledSelectBox.selectByIndex(1);
		 Thread.sleep(5000);
	 }
//	 @Test
	 public void TC_07_Get_options_in_Dropdown_List() throws InterruptedException {
		 driver.get("https://egov.danang.gov.vn/reg");
		 Select SelectGender = new Select(driver.findElement(By.xpath("//select[@id='gioiTinh']")));
		 List <WebElement> SelectGenderOptions = SelectGender.getOptions();
		 for (WebElement list:SelectGenderOptions) {
			 System.out.print(list.getText());
		 }
	 }	 
//	 @Test
	 public void TC_08_Get_First_Selected_Options() throws InterruptedException {
		 driver.get("https://egov.danang.gov.vn/reg");
		 Select SelectGender = new Select(driver.findElement(By.xpath("//select[@id='gioiTinh']")));
		 List <WebElement> SelectGenderOptions = SelectGender.getOptions();
		 for (WebElement list:SelectGenderOptions) {
		 Assert.assertEquals("-Chọn-", SelectGender.getFirstSelectedOption().getText());
		 } 
	 }
//	 @Test
	 public void TC_09_Custom_DropDown_List() throws InterruptedException {
		 driver.get("https://tiemchungcovid19.gov.vn/portal/register-person");
		 //Scroll down tới element mình muốn chọn 
		 jsExecutor.executeScript("arguments[0].scrollIntoView({block: \"center\"})",driver.findElement(By.xpath("//ng-select[@bindvalue='provinceCode']")));
		 //Đợi cho tới khi element có thể được 
		 explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ng-select[@bindvalue='provinceCode']")));
		 //Click vào element
		 driver.findElement(By.xpath("//ng-select[@bindvalue='provinceCode']")).click();
		 Thread.sleep(5000);
		 //Đợi cho tới khi các Option có thể được khởi 
		 explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class=\"ng-option-label ng-star-inserted\"]")));
		 //List các option 
		 List <WebElement> allItems = driver.findElements(By.xpath("//span[@class=\"ng-option-label ng-star-inserted\"]"));
		 for (WebElement item: allItems) {
		 System.out.print("Actual Text: " + item.getText());
		 if(item.getText().equals(By.xpath("//span[text() ='Thành phố Hà Nội']"))) {
		 jsExecutor.executeScript("agruments[0].scrollIntoView(true);",item);
		 Thread.sleep(5000);
		 explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class=\"ng-option-label ng-star-inserted\"]")));
		 item.click();
		 Thread.sleep(5000);
		 break;
		 }
		 }		 
	 }
	 
//		@Test
		public void TC_10_dropdown() {
			driver.get("https://demo.nopcommerce.com/");
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			Select selectDay = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
			selectDay.selectByVisibleText("10");

			Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
			selectMonth.selectByVisibleText("January");

			Select selectYear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
			selectYear.selectByVisibleText("2000");
			
			sleepInSecond(3);

		}
		
	   @Test
	   public void TC_11_CustomDropdown() {
		   driver.get("https://demo.nopcommerce.com/");
		   driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		   driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("hoai");
		   driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("nguyen");
		   
		   sleepInSecond(2);

		   Select selectDay = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
		   selectDay.selectByVisibleText("10");
		   
		   sleepInSecond(2);
		   
		   Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
		   selectMonth.selectByVisibleText("January");
		   
		   sleepInSecond(2);
		   
		   Select selectYear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
		   selectYear.selectByVisibleText("2000");
		   
		   sleepInSecond(2);
		   
		   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc@gmail.com");
		   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		   driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
		   
		   sleepInSecond(2);
		   
		   driver.findElement(By.id("register-button")).click();
		   
		   
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
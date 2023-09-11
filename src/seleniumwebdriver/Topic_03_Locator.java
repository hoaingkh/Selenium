package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Locator{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		// Setup browser driver
		System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver 2");
		// Khởi tạo browser
		driver = new FirefoxDriver();
		// Set timeout tìm element
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Phóng to window
		driver.manage().window().maximize();
		// Navigate tới 1 website
		
	}

//	@Test
	public void TC_01_Register_With_Empty_Data() {
		driver.get("https://alada.vn/tai-khoan/dang-ky.html");
		driver.findElement(By.xpath("//div[@class='field_btn']//button[text()='ĐĂNG KÝ']")).click();

		String errorFullName = driver.findElement(By.id("txtFirstname-error")).getText();
		Assert.assertEquals(errorFullName, "Vui lòng nhập họ tên");
		
		String errorEmail = driver.findElement(By.id("txtEmail-error")).getText();
		Assert.assertEquals(errorEmail, "Vui lòng nhập email");
		
		String errorCEmail = driver.findElement(By.id("txtCEmail-error")).getText();
		Assert.assertEquals(errorCEmail, "Vui lòng nhập lại địa chỉ email");
		
		String errorPassword = driver.findElement(By.id("txtPassword-error")).getText();
		Assert.assertEquals(errorPassword, "Vui lòng nhập mật khẩu");
		
		String errorCPassword = driver.findElement(By.id("txtCPassword-error")).getText();
		Assert.assertEquals(errorCPassword, "Vui lòng nhập lại mật khẩu");
		
		String errorPhone = driver.findElement(By.id("txtPhone-error")).getText();
		Assert.assertEquals(errorPhone, "Vui lòng nhập số điện thoại.");
		
	}

//	@Test
	public void TC_02_Register_With_Invalid_Email() {
		driver.get("https://alada.vn/tai-khoan/dang-ky.html");
		driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("John Kennedy");
		
      	driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("123@456@789");
		
		driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("123@456@789");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123@456@789");
		
		driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123@456@789");
		
		driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("0987654321");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
//	  @Test
	  public void TC_03_Register_With_incorrect_Confirm_Email() {
			driver.get("https://alada.vn/tai-khoan/dang-ky.html");
			driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("John Wick");
			
	      	driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("johnwick@gmail.net");
			
			driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("johnwick@gmail.com");
			
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123@456@789");
			
			driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123@456@789");
			
			driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("0987654321");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
	  
//	  @Test
	  public void TC_04_Register_With_Password_Fewer_than_6_characters() {
			driver.get("https://alada.vn/tai-khoan/dang-ky.html");
            driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("John Wick");
			
	      	driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("johnwick@gmail.net");
			
			driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("johnwick@gmail.net");
			
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123");
			
			driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123");
			
			driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("0987654321");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
			
//		@Test
		public void TC_05_Register_With_incorrect_confirm_Password() {
		    driver.get("https://alada.vn/tai-khoan/dang-ky.html");
            driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("John Wick");
			
	      	driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("johnwick@gmail.net");
			
			driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("johnwick@gmail.net");
			
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123@456@789");
			
			driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123@456");
			
			driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("0987654321");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
			
		  @Test
		  public void TC_06_Register_With_invalid_Phone_Number() {
			    driver.get("https://alada.vn/tai-khoan/dang-ky.html");
		    driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("John Wick");
			
	      	driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("johnwick@gmail.net");
			
			driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("johnwick@gmail.net");
			
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123@456@789");
			
			driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123@456@789");
			
			driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("098765");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		  }
		  
		  @Test
		  public void TC_07_demoFBPage() {
			  driver.findElement(By.name("email"));
			  driver.findElement(By.id("email"));
			  driver.findElement(By.xpath("//input[@id = 'email']"));
              
			  driver.get("https://demo.nopcommerce.com/");
			  driver.findElement(By.xpath("//div[@class='header']//a[text() ='Register']"));
			  driver.findElement(By.xpath("//a[contains(@class, 'ico')]"));
			  driver.findElement(By.xpath("//a[contains(text(), 'My')]"));
			  // nested text
			  driver.findElement(By.xpath("//a[contains(string(), 'My')]"));
			  driver.findElement(By.xpath("//a[contains()., 'My')]"));
			  //khac cha, dong mo ngoac de ve cung 1 
			  driver.findElement(By.xpath("(//span[text()='Add to cart'])[3]"));
			  //di nhieu buoc
			  //parent::h2//following-sibling::div....
             driver.findElement(By.xpath("//a[text()='IPhone']//parent::h2//following-sibling::div[@class='actions']//button"));
			 
			  
			  
			  
			  
		  }		  
		  
		

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
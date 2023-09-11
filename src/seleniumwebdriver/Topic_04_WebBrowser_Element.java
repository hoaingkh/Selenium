package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_WebBrowser_Element{
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
	public void TC_01_Verify_Url() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		String loginPage = driver.getCurrentUrl();
		Assert.assertEquals(loginPage, "http://live.techpanda.org/index.php/customer/account/login/");
		
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		String CreateAccount = driver.getCurrentUrl();
		Assert.assertEquals(CreateAccount, "http://live.techpanda.org/index.php/customer/account/create/");
	}
//	@Test
	public void TC_02_Verify_Title() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
	    String titleLoginPage = driver.getTitle();
	    Assert.assertEquals(titleLoginPage, "Customer Login");
	    
	    driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
	    String CreateAccount = driver.getTitle();
	    Assert.assertEquals(CreateAccount, "Create New Customer Account");
	}
//	@Test
	public void TC_03_Navigate_function() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		String CreateAccount = driver.getCurrentUrl();
		Assert.assertEquals(CreateAccount, "http://live.techpanda.org/index.php/customer/account/create/");
		driver.navigate().back();
		String LoginPage = driver.getCurrentUrl();
		Assert.assertEquals(LoginPage, "http://live.techpanda.org/index.php/customer/account/login/");
		driver.navigate().forward();
		String TitleRegisterPage = driver.getTitle();
	    Assert.assertEquals(TitleRegisterPage, "Create New Customer Account");
	}
//	@Test
	public void TC_04_Get_Page_Source_Code() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		String LoginPage = driver.getPageSource();
		AssertTrue(LoginPage.contains("Login or Create an Account"));
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		String CreateAccount = driver.getPageSource();
		AssertTrue(CreateAccount.contains("Create an Account"));
	}
//	@Test
	public void TC_01_Login_with_empty_Email_and_Password() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		String EmailError = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals(EmailError, "This is a required field.");
		String PasswordError = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals(PasswordError, "This is a required field.");
	}
//	@Test
	public void TC_02_Login_with_invalid_Email() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("123434234@12312.123123");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		String InvalidEmail = driver.findElement(By.xpath("//div[@class='validation-advice']")).getText();
		Assert.assertEquals(InvalidEmail, "Please enter a valid email address. For example johndoe@domain.com.");
	}
//	@Test
	public void TC_03_Login_with_Password_less_than_6_characters() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("automation@gmail.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		String InvalidPassword = driver.findElement(By.xpath("//div[@id='advice-validate-password-pass']")).getText();
		Assert.assertEquals(InvalidPassword, "Please enter 6 or more characters without leading or trailing spaces.");	
	}
//	@Test
	public void TC_04_Login_with_incorrect_Email_Password() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("automation@gmail.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("123123123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		String InvalidLoginPassword = driver.getPageSource();
		AssertTrue(InvalidLoginPassword.contains("Invalid login or password."));
	}
	@Test
	public void TC_05_Create_a_new_account() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Hoai");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Nguyen");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("hoai123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456@");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123456@");
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		String Success_Register = driver.findElement(By.xpath("//span[text()='Thank you for registering with Main Website Store.']")).getText();
		AssertTrue(Success_Register.contains("Thank you for registering with Main Website Store."));
		String MyDashboard = driver.findElement(By.xpath("//div[@class='col-1']//p")).getText();
		AssertTrue(MyDashboard.contains("Hoai Nguyen"));
		AssertTrue(MyDashboard.contains("hoai123@gmail.com"));
	   driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[text()='Account']")).click();
	   driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	   String LogOutPage = driver.getCurrentUrl();
	   WebElement Homepage = driver.findElement(By.xpath("//h2"));
	   String HomePageTitle = Homepage.getText();
	   AssertTrue(HomePageTitle.contains("This is demo site for"));
	   
	   
	}
//	@Test
	public void TC_06_Login_with_valid_Email_and_Password() {
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("hoai.n@gmai.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("123456@");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		String MyDashboard = driver.findElement(By.xpath("//div[@class='col-1']//p")).getText();
		AssertTrue(MyDashboard.contains("Hoai Nguyen"));
		AssertTrue(MyDashboard.contains("hoai123@gmail.com"));
	
	}	

	private void AssertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
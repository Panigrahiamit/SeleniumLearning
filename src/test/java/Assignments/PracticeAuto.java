package Assignments;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PracticeAuto {
	public static WebDriver driver = new EdgeDriver();
	public static JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	@BeforeTest
	void beforetest() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().deleteAllCookies(); 
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("abraham");
		
		try {
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("johnabraham2100@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Email id already exists");
		}
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("johnabraham123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("johnabraham123");
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		driver.findElement(By.linkText("Log out")).click();
		
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		
driver.findElement(By.linkText("Log in")).click();
		
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("johnabraham2100@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("johnabraham123");
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		
		
		WebElement content = driver.findElement(By.xpath("//strong[normalize-space()='Featured products']"));
		js.executeScript("arguments[0].scrollIntoView();", content);
		js.executeScript("arguments[0].style.border='3px solid red'", content);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//input[contains(@id, 'RecipientName')]")).sendKeys("Priya");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[contains(@id, 'RecipientEmail')]")).sendKeys("priya2345@gmail.com");
		Thread.sleep(300);
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button-2'])[1]")).click(); 
		
		
		Thread.sleep(300);
		driver.navigate().back();
		Thread.sleep(300);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();//
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(300);
		
		
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		// Checkout Page 
		
		WebElement country = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select sel = new Select(country);
		sel.selectByValue("41");
		
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Delhi");
        
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Street 1, New Delhi");
        
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("110001");

		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("9876543210");

		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(5000);
		

		
		
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
		Thread.sleep(2000);

		WebElement order = driver.findElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']"));
		js.executeScript("arguments[0].scrollIntoView();", order);
		js.executeScript("arguments[0].style.border='3px solid green'", order);
		
		Thread.sleep(2000);
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Selenium workspace 2\\Selenium_Learning\\Screenshots\\Practice.jpeg");
		source.renameTo(target);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		
			driver.findElement(By.linkText("Log out")).click();
			
//			try {
//		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		    // Wait for the button to be clickable
//		    WebElement noThanksBtn = wait.until(ExpectedConditions.elementToBeClickable(
//		        By.xpath("//button[normalize-space()='No thanks']")
//		    ));
//		    noThanksBtn.click();
//		    System.out.println("Clicked 'No thanks' button successfully");
//		} catch (Exception e) {
//		    System.out.println("No address save popup found or button not clickable: " + e.getMessage());
//		}
	
			
		
	}
	
	@AfterTest
	void aftertest() {
		driver.quit();
	}
	
}
	
	
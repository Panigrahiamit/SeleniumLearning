package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


//Waits in Selenium: Time given to halt the execution 
// Static wait - Thread.sleep
// Dynamic wait - Implicit wait, Explicit wait, Fluent wait

//Implicit wait - set for the lifetime of the WebDriver instance
//Explicit wait - set for a particular element
//Fluent wait - similar to explicit wait but with more options like polling frequency and ignoring specific exceptions

public class waitsexamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vote-poll-1")));
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}

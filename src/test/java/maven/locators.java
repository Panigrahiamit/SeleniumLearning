package maven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Locators in Selenium:
   /*1. ID LocatorDefinition:
	   
Locates elements using the HTML id attribute. The ID is meant to be unique within a page's DOM.Uniqueness:
⭐⭐⭐⭐⭐ (Highest) - IDs should be unique per HTML standards, making this the most reliable locator.*/



		//8 a. Absolute XPath or Full X-path  - Absolute XPath is have more chances to change so not recommended
		//8 b. Relative XPath - recommended - more stable
		
		//Absolute path example/ Full X-path example : /html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a
		// Relative X-path example : ANCHOR[@ATTRIBUTE='VALUE'] ---> //a[@class='ico-register']
		// 
		

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//		driver.getTitle();
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.dismiss();
		
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("Hello");
        Thread.sleep(5000);
        alert2.accept();
        
       // driver.close();
	}

}

package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		//getTitle() method is used to get the title of the current page.
		
		System.out.println(driver.getCurrentUrl());
		// getCurrentUrl() method is used to get the current URL of the page.
			
				
		//System.out.println(driver.getWindowHandle());
		/* getWindowHandle() method is used to get the unique identifier of the current window.
		 unique identifier means it will give unique id to each window.
		 unique identifier is useful when we have multiple windows open and we want to switch between them.*/
		
	//   System.out.println(driver.getPageSource()); 
		// getPageSource() method is used to get the source code of the current page.
		
		
		driver.findElement(By.linkText("Register")).click();
		// driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.linkText("Log in")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Shopping cart")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Wishlist")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Sitemap")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Shipping & Returns")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Privacy Notice")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("News")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.linkText("Blog")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("My account")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Orders")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Addresses")).click();
		    System.out.println("=".repeat(60));
		System.out.println("code-break");	
		Thread.sleep(2000);
		driver.navigate().back();
		
		/*driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("YouTube")).click();
		Thread.sleep(2000);
		driver.navigate().back();*/
		

		
	
		
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("Email")).sendKeys("admin");
//		driver.findElement(By.name("Password")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		//driver.quit();
		
		
		
	}

}

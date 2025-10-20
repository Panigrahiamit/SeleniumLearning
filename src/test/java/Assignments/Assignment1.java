package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Assignment -1(Locators working with Web Elements)
➤ URL (https://demo.guru99.com/test/radio.html
➤ Invoke Chrome browser
➤ Verify the Page Tittle. 
➤ Find Option 1 and select
➤ Find Checkbox2 and Checkbox3 and select
➤ Suggested site(https://demo.guru99.com/test/newtours/register.php)
➤ Find Country Dropdown
➤ Select “KUWAIT”?*/

public class Assignment1 {
	
	WebDriver driver = new ChromeDriver();
	
		
	
	void url1() throws InterruptedException {
			
		
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("Radio Button & Check Box Demo"))
			System.out.println("Title Matched");
        else
            System.out.println("Title Not Matched");
		
		driver.findElement(By.id("vfb-7-1")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		
		Thread.sleep(2500);
		
		
	}
	
	void url2() throws InterruptedException {
			
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select select = new Select(driver.findElement(By.name("country")));
		Thread.sleep(2500);
		select.selectByValue("KUWAIT");
		
		Thread.sleep(2500);
		
		driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		Assignment1 obj = new Assignment1();
		obj.url1();
		obj.url2();		
		
	}

}

package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		    driver.get("https://www.facebook.com/r.php?entry_point=login");
		    WebElement Firstname = driver.findElement(By.name("firstname"));
		    Firstname.sendKeys("Selenium");
		    
		    WebElement Lastname = driver.findElement(By.name("lastname"));
		    Lastname.sendKeys("Sharma");
		    
		    WebElement day = driver.findElement(By.xpath("//select[@id='day']")); // //select[@id='day']
		    WebElement month = driver.findElement(By.id("month"));
		    WebElement year = driver.findElement(By.id("year"));
		    
		    Select drop = new Select(day);
		    drop.selectByValue("1");
		    //Thread.sleep(2000);
		    try {
				Select drop1 = new Select(month);
				drop1.selectByValue("11");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
				e.printStackTrace();
			}
		    //Thread.sleep(2000);
		    Select drop2 = new Select(year);
		    drop2.selectByValue("1999");
		    
		    
		    try {
				WebElement radio1 = driver.findElement(By.className("_5k_3"));
				 Select radio = new Select(radio1);
				 radio.selectByValue("1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		    
		    try {
				//driver.findElement(By.name("reg_email__")).sendKeys("seleniumsharma@gmail.com");
				driver.findElement(By.id("u_0_h_vj")).sendKeys("seleniumsharma@gmail.com");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		  
		  
		    try {
				// WebElement password = driver.findElement(By.name("mbm _br- _a4y"));
		    	WebElement password = driver.findElement(By.name("reg_passwd__"));
         password.sendKeys("Seleniumsharma");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

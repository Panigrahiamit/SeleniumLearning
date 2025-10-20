package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class mvn_learning {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		
			driver = new ChromeDriver();
		    driver = new EdgeDriver();
		    
		    
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		
		
	}
}

package maven;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {




		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(6000);
			TakesScreenshot sc=(TakesScreenshot)driver;
			File source=sc.getScreenshotAs(OutputType.FILE);
			File target=new File("C:\\Users\\Pankaj\\eclipse-workspace\\Selenium_Learning\\Screenshot_exp\\Module2Assignment3.jpeg");
			source.renameTo(target);
			Thread.sleep(6000);
			driver.quit();
		}

	}
	


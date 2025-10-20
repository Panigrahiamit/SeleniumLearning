package maven;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingusingJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavascriptExecutor is an interface that provides a mechanism to execute JavaScript code within the context of the browser.
		//It allows you to interact with web elements, manipulate the DOM, and perform various actions that may not be directly achievable through standard WebDriver methods.
		// Javascript example are scrolling, clicking, fetching title etc.
		// Javascript Executor is used to execute JavaScript through Selenium WebDriver.
		// examples are scrolling into view, scrolling by pixel, scrolling to bottom of page .
		
		//js.executeScript("window.scrollBy(0,250)");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		Thread.sleep(2000);
		
		String title = (String) js.executeScript("return document.title;");// Inbuilt method to fetch title using JS
		System.out.println(title);
		
		WebElement element1 = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
		js.executeScript("arguments[0].scrollIntoView();", element1);
		js.executeScript("arguments[0].style.border='3px solid blue'", element1);
		String elementText = element1.getText();
		System.out.println("Element text: " + elementText);
		
		//System.out.println(driver.getTitle());	
		
		driver.quit();
		
	}

}

package module2_assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_1_LaunchBrowser {
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
/*Tasks To Be Performed:
1. Write a Test Script to open Test URL in Chrome Browser.
2. Write a Test Script to open Test URL in Firefox Browser.
3. Write a Test Script to open Test URL in Internet Explorer Browser.*/
	
//1. Write a Test Script to open Test URL in Chrome Browser.
//To launch the browser		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
 driver = new ChromeDriver();
 System.out.println("chrome Browser launched");
//to close the browser
driver.close();
//wait time
Thread.sleep(2000);
//2. Write a Test Script to open Test URL in Internet Explorer Browser.
//to launch the edge driver
System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
driver = new EdgeDriver();
System.out.println("Edge Browser launched");
//to close the browser
driver.close();
//wait time
Thread.sleep(2000);

//3. Write a Test Script to open Test URL in Firefox Browser.
System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
System.out.println("Firefox Browser launched");
//to close the browser
driver.close();
//wait time
Thread.sleep(2000);
	}

}

package module4_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4fb_links {

	public static void main(String[] args) throws InterruptedException {
/*1. Write a Test Script to get number of links available on Facebook Page
		https://www.facebook.com/*/
		
		//Launch the chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait time
		Thread.sleep(2000);
		//To get the URL of the page

		driver.get(" https://www.facebook.com/");
		//wait time
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
	}

}

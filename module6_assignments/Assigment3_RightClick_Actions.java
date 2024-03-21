package module6_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment3_RightClick_Actions {

	public static void main(String[] args) throws InterruptedException {
		/*
Test Scenario I: Actions
Step 1: Launch Chrome browser
Step 2: Open test URL:
http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step 3: Right click on Double-Click Me to See Alert Button
Step 4: Close browser*/
		
		//Launch the chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait time
		Thread.sleep(2000);
		//To get the URL of the page
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		//manage the browser window to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement rightclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click' )]"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.contextClick(rightclick).build().perform();
		Thread.sleep(2000);
		

		driver.close();		

	}

}

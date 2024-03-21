package module6_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Assignment4_DragAndDrop_Actions {

	public static void main(String[] args) throws InterruptedException {
		/*
Test Scenario I: Actions
Step 1: Launch Chrome browser
Step 2: Open Test URL:
http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step 3: Drag the slider up to 50% and drop the slider
Step 4: Close browser*/
		//launch the chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		//Goto the URL
		driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement draganddrop = driver.findElement(By.xpath("//div[@id='slider']"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDropBy(draganddrop, 50, 0).build().perform();
		Thread.sleep(2000);
		//close the window
		
		driver.close();
	}

}

package module6_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Assignment2_DoubleClick_Actions {

	public static void main(String[] args) throws InterruptedException {
		/*Test Scenario I: Actions
		Step 1: Launch Chrome browser
		Step 2: Open test URL:
		http://only-testing-blog.blogspot.com/2014/09/selectable.html
		Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
		Step 4: Accept Alert
		Step 5: Close browser*/
		//Launch the chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Goto the URL
		driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click' )]"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.doubleClick(doubleclick).build().perform();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		driver.close();

	}

}

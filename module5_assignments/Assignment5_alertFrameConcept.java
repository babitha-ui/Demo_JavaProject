package module5_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5_alertFrameConcept {

	public static void main(String[] args) throws InterruptedException {
/*Step 1: Launch Firefox browser
Step 2: Open test URL :
https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in Chrome
browser
Step 3: Switch into Frame
Step 4: Click on Try it Button
Step 5: Send the text into Alert
Step 6: Accept the Web Alert
Step 7: Get the text displayed on page into Console
Step 8: Close browser*/
			
//Step 1: Launch Firefox browser
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//wait time
		Thread.sleep(2000);
		
		
//step 2:open the URL
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//wait time
		
		Thread.sleep(2000);
		
//Step 3: Switch into Frame
		driver.switchTo().frame("iframeResult");
		//wait time
		Thread.sleep(2000);
		
//Step 4: Click on Try it Button
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//wait time
		Thread.sleep(2000);
		
//Step 5: Send the text into Alert
		
		driver.switchTo().alert().sendKeys("babitha");
		
		//wait time
		Thread.sleep(2000);
//Step 6: Accept the Web Alert
		
		driver.switchTo().alert().accept();
		
		//wait time
		Thread.sleep(2000);
		
//Step 7: Get the text displayed on page into Console
		
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		//wait time
		Thread.sleep(2000);
		
//Step 8: Close browser
		
		driver.close();
	}

}

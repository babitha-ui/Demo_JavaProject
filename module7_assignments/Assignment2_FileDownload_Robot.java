package module7_assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2_FileDownload_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		/*
Test Scenario I: File download
Step 1: Launch Firefox browser
Step 2: Open test URL: https://www.selenium.dev/downloads/
Step 3: In Selenium Client and Web Driver Language Bindings, click on link text
to download Selenium with Java Language binding
Step 4: Automate file download
Step 5: Close browser*/
		// TC1:Launch Firefox Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		//TC2:Open test URL: https://www.selenium.dev/downloads/
		driver.get("https://www.selenium.dev/downloads/");	
		
		//TC3:to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//TC3:In Selenium Client and Web Driver Language Bindings, click on link text
		//to download Selenium with Java Language binding
		
		Thread.sleep(4000);
		Robot r = new Robot();
		
	    driver.findElement(By.xpath("(//a[text()='Changelog'])[3]/preceding::*[1]"));
		Thread.sleep(4000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(4000);
		driver.close();
        
	}

}

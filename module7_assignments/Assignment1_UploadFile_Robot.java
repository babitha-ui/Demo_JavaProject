package module7_assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_UploadFile_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
/*Test Scenario I: File Upload
Step 1: Launch Chrome browser
Step 2: Open test URL: https://smallpdf.com/word-to-pdf
Step 3: Click on Choose File Button
Step 4: Automate Window Alert by uploading file
Step 5: Close browser*/
		
		// TC1:Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//TC2:Go to the test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		
		driver.get("https://smallpdf.com/word-to-pdf");
		
	//wait time
		
		Thread.sleep(2000);
	
	//TC3:manage the browser window to minimized to maximize
		
		driver.manage().window().maximize();
		
    //wait time
		
		Thread.sleep(2000);
		
   //TC4:Click on the choose file button
		
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		
	//Load the path of file in clipboard
		
		StringSelection s= new StringSelection("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\s4 Hana Conversion.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
	//send the data from clipboard to screen
	//paste operation CONTROL+V
		//Implement java robot
		
		Robot r = new Robot();
		//paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		//Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//close the driver
		
		driver.close();
	}

}
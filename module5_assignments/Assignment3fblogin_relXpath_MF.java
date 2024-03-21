package module5_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3fblogin_relXpath_MF {

	public static void main(String[] args) throws InterruptedException {
/*1. Automate Facebook Login Page using Relative XPath Axis in 2 different
browsers https://www.facebook.com/*/
		
		
		
		//Launch chrome Browser		
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();


		driver.get("https://www.facebook.com/");

		//wait time
		Thread.sleep(2000);

		//to send the data in username textbox
		 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Babitha");

		//wait time
		Thread.sleep(2000);

		//to send the data in password textbox

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Babitha123");

		//wait time
		Thread.sleep(2000);

		//to click on login button

		driver.findElement(By.xpath("//button[@name='login']")).click();



		//close the browser

		driver.close();
}
}
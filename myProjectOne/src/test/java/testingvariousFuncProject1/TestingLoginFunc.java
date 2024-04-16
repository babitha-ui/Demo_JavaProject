package testingvariousFuncProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestingLoginFunc {
	//Test the login screen with username and password
	@Test
	public void login_Orangedemo() throws InterruptedException {
		//Launch browser
		
		WebDriver driver=new ChromeDriver();
		
		
		//go to URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		//maximize the browser
		
		driver.manage().window().maximize();
		
		//enter the username in text box
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		//enter the password in text box
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		//click on login button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		driver.close();
	}

}

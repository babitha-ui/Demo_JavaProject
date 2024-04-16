package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {
	Login login;
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String browserName="chrome";
		
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void verifyRegisteringAnAccountWithAllMAndatoryFields() {
		login=new Login();
		driver.findElement(By.id("input-firstname")).sendKeys("Arpitha");
		driver.findElement(By.id("input-lastname")).sendKeys("Jamanjyothi");
		driver.findElement(By.id("input-email")).sendKeys(login.generateEmailTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("123456789");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String expectedwgMsg = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		String actualErrmsg="Your Account Has Been Created!";
		Assert.assertEquals(actualErrmsg, expectedwgMsg);
	}
	
	@Test
	public void verifyRegisteringAnAccountWithAllFields() {
		login=new Login();
		driver.findElement(By.id("input-firstname")).sendKeys("Arpitha");
		driver.findElement(By.id("input-lastname")).sendKeys("Jamanjyothi");
		driver.findElement(By.id("input-email")).sendKeys(login.generateEmailTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("12345678");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String expectedwgMsg = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		String actualErrmsg="Your Account Has Been Created!";
		Assert.assertEquals(actualErrmsg, expectedwgMsg);
	}
	
	@Test
	public void verifyRegisteringAnAccountWithnoFields() {
		login=new Login();
		driver.findElement(By.id("input-firstname")).sendKeys("");
		driver.findElement(By.id("input-lastname")).sendKeys("");
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-telephone")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.id("input-confirm")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String expectedwrnMsg="Warning: You must agree to the Privacy Policy!";
		String actualWarMsg=driver.findElement(By.xpath("//div[contains(text(),'Warning: You must agree to the Privacy Policy!')]")).getText();
		Assert.assertTrue(actualWarMsg.contains(expectedwrnMsg),"error msg does not exist");
	}
	
	

}

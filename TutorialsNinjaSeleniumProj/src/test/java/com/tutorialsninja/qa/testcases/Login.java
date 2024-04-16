package com.tutorialsninja.qa.testcases;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Login {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String browserName="firefox";
		
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
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("babitha.viswanath@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		}
	
	@Test(priority=2)
	public void verifyLoginWithinValidCredentials() throws InterruptedException {
		driver.findElement(By.id("input-email")).sendKeys(generateEmailTimeStamp());
		driver.findElement(By.id("input-password")).sendKeys("1234");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		String actualwrgMsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarMsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualwrgMsg.contains(ExpectedWarMsg),"Expected warning msg does not exist");
		
	}
		@Test(priority=3)
		public void verifyLoginWithValidEmailInvalidPasswordCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("babitha.viswanath@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		String actualwrgMsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarMsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualwrgMsg, ExpectedWarMsg);
		//Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		
	}
		
		@Test(priority=4)
		public void verifyLoginWithInValidEmailValidPasswordCredentials() {
		driver.findElement(By.id("input-email")).sendKeys(generateEmailTimeStamp());
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		String actualwrgMsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarMsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualwrgMsg, ExpectedWarMsg);
		//Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		
	}
		

		@Test(priority=5)
		public void verifyLoginWithoutAnyCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		String actualwrgMsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarMsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualwrgMsg, ExpectedWarMsg);
		//Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		
	}
		
	public String generateEmailTimeStamp() {
		Date date=new Date();
		String timeStamp= date.toString().replace(" ", "_").replace(":", "_");
		return "babitha.viswanath"+timeStamp+"@gmail.com";
		
	}
	
	

}

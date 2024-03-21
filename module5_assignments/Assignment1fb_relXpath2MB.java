package module5_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment1fb_relXpath2MB {

	public static void main(String[] args) throws InterruptedException {
/*1. Automate Facebook Registration Page using Relative XPath in 2 different
Browsers https://www.facebook.com/*/
		
		//Launch the chrome Browser
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//wait time
		Thread.sleep(2000);
		//To get the URL of the page

		driver.get(" https://www.facebook.com/");
		//wait time
		Thread.sleep(2000);
		By linktext = RelativeLocator.with(By.linkText("Create new account")).below(By.linkText("Forgotten password?"));
	    driver.findElement(linktext).click();
	    //wait time
	    Thread.sleep(2000);
		By firstname=RelativeLocator.with(By.name("firstname")).toLeftOf(By.name("lastname"));
		driver.findElement(firstname).sendKeys("Babitha");
		
		//wait time
	    Thread.sleep(2000);
		By lastname = RelativeLocator.with(By.name("lastname")).toRightOf(By.name("firstname"));
		driver.findElement(lastname).sendKeys("Jamanjyothi");
		
		//wait time
	    Thread.sleep(2000);
	    
	    By phnno = RelativeLocator.with(By.name("reg_email__")).below(By.name("firstname"));
	    driver.findElement(phnno).sendKeys("123456");
	    
	  //wait time
	    Thread.sleep(2000);
	    
	    By passwrd = RelativeLocator.with(By.name("reg_passwd__")).below(By.name("reg_email__"));
	    		
	    driver.findElement(passwrd).sendKeys("babitha");
	    
	    //wait time
	    Thread.sleep(2000);
	    
	    By dropdown = RelativeLocator.with(By.name("birthday_day")).below(By.name("reg_passwd__"));
	    Select select = new Select(driver.findElement(dropdown));
	    select.selectByVisibleText("10");
	    
	  //wait time
	    Thread.sleep(2000);
	    
	    By dropdown1 = RelativeLocator.with(By.name("birthday_month")).toRightOf(By.name("birthday_day"));
	    Select select1 = new Select(driver.findElement(dropdown1));
	    select1.selectByIndex(2);
	    
	  //wait time
	    Thread.sleep(2000);
	    
	    By dropdown2 = RelativeLocator.with(By.name("birthday_year")).toRightOf(By.name("birthday_month"));
	    Select select2 = new Select(driver.findElement(dropdown2));
	    select2.selectByValue("2016");
	    
	  //wait time
	    Thread.sleep(2000);
	    
		By maleRB=RelativeLocator.with(By.tagName("input")).below(By.id("month"));
		driver.findElement(maleRB).click();
		
		//to close the browser
		driver.close();


	}

}

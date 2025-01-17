package module4_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_fb_reg {

	public static void main(String[] args) throws InterruptedException {
/*1. Automate Facebook Registration Page using Direct Locator's in Chrome
Browser https://www.facebook.com/
2. Automate dropdowns part of Facebook Registration Page using Direct
Locator's in Firefox Browser- https://www.facebook.com/*/

//1. Automate Facebook Registration Page using Direct Locator's in Chrome
//Browser https://www.facebook.com/
		
//Launch the chrome Browser
		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//wait time
Thread.sleep(2000);
//To get the URL of the page

driver.get(" https://www.facebook.com/");
//wait time
Thread.sleep(2000);

//To click on the create new account

driver.findElement(By.linkText("Create new account")).click();
//wait time
Thread.sleep(5000);
driver.findElement(By.name("firstname")).sendKeys("Babitha");
//wait time
Thread.sleep(2000);
driver.findElement(By.name("lastname")).sendKeys("Jamanjyothi");
//wait time
Thread.sleep(2000);
driver.findElement(By.name("reg_email__")).sendKeys("1234567");
//wait time
Thread.sleep(2000);
driver.findElement(By.name("reg_passwd__")).sendKeys("babitha123");

//wait time
Thread.sleep(2000);

Select select = new Select(driver.findElement(By.name("birthday_day")));
select.selectByIndex(9);

//wait time
Thread.sleep(2000);

Select select1 = new Select(driver.findElement(By.name("birthday_month")));

select1.selectByVisibleText("Apr");

Select select2 = new Select(driver.findElement(By.name("birthday_year")));

select2.selectByValue("2018");

//click on Male RadioButton

By maleRB=RelativeLocator.with(By.tagName("input")).below(By.id("month"));

driver.findElement(maleRB).click();


driver.findElement(By.name("websubmit")).click();


driver.close();
	}

}

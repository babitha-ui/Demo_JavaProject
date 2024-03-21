package module4_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2a_oracleC {

	public static void main(String[] args) throws InterruptedException {
/*1. Automate Oracle Registration Page in Chrome Browser
https://profile.oracle.com/myprofile/account/create-account.*/


//Launch the chrome Browser
		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//wait time
Thread.sleep(2000);
//To get the URL of the page

driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
//wait time
Thread.sleep(2000);

//to send the value into the EmailAddress

driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("babitha.viswanath@gmail.com");
//wait time
Thread.sleep(2000);
driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("babitha");
//wait time
Thread.sleep(2000);
driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("babitha");
//wait time
Thread.sleep(2000);
Select select = new Select(driver.findElement(By.id("sView1:r1:0:country::content")));
//wait time
Thread.sleep(2000);
select.selectByVisibleText("Albania");
//wait time
Thread.sleep(2000);

driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Babitha");
//wait time
Thread.sleep(2000);

driver.findElement(By.name("sView1:r1:0:workPhone")).sendKeys("123456");
//wait time
Thread.sleep(2000);



driver.findElement(By.xpath("//input[@id='sView1:r1:0:lastName::content']")).sendKeys("jamanjyothi");
//wait time
Thread.sleep(2000);
driver.findElement(By.name("sView1:r1:0:jobTitle")).sendKeys("Software Testing");
//wait time
Thread.sleep(2000);
driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("Infosis");
//wait time
Thread.sleep(2000);
driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("saroornagar");
//wait time
Thread.sleep(2000);
driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Hyderabad");
//wait time
Thread.sleep(2000);
Select select1 = new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
//wait time
Thread.sleep(2000);
select1.selectByVisibleText("Delhi");
//wait time
Thread.sleep(2000);	
driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("500013");



//to close the browser

driver.close();
	}

}

package module5_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4_alertConcept {

	public static void main(String[] args) throws InterruptedException {
/*Step 1: Launch Firefox browser
Step 2: Open test URLhttps://
www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome browser
Step 3: Click on click here to show confirm alert button
Step 4: Get the text displayed on alert into console
Step 5: Accept the web alert to delete account
Step 6: Get the text displayed on alert into console
Step 7: Accept the alert
Step 8: Close browser*/
		
//Step 1: Launch Firefox browser
		
System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
		
//wait time
Thread.sleep(2000);

//Step 2: Open test URLhttps://
//www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome browser

driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
//wait time
Thread.sleep(2000);

//Step 3: Click on click here to show confirm alert button

driver.findElement(By.xpath("//button[text()='Click here to show confirm alert']")).click();

Thread.sleep(2000);

//Step 4: Get the text displayed on alert into console

String ptext = driver.switchTo().alert().getText();
System.out.println(ptext);

//wait time
Thread.sleep(2000);

//Step 5: Accept the web alert to delete account


driver.switchTo().alert().dismiss();

//wait time
Thread.sleep(2000);

//Step 6: Get the text displayed on alert into console

String text = driver.switchTo().alert().getText();
System.out.println(text);

//wait time
Thread.sleep(2000);


//Step 7: Accept the alert

driver.switchTo().alert().accept();

//wait time
Thread.sleep(2000);

//Step 8: Close browser

driver.close();

	}

}

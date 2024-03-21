package module4_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5fb_clearMethod {

public static void main(String[] args) throws InterruptedException {
/*1. TC-1 launch Chrome browser
2. TC-2 go to Facebook Registration Page
3. TC-3 fill First Name Textbox with input
4. TC-4 clear the input from First Name Textbox
5. TC-5 again fill the First Name Textbox with input
6. TC-6 Get the input from Textbox and display it in Console
7. TC-6 Close browser*/
	
	//TC-1 launch Chrome browser
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	//wait time
	Thread.sleep(2000);
	//To get the URL of the page
    // TC-2 go to Facebook Registration Page
	driver.get(" https://www.facebook.com/");
	//wait time
	Thread.sleep(2000);

	//To click on the create new account

	driver.findElement(By.linkText("Create new account")).click();
	//wait time
	Thread.sleep(5000);
	//TC-3 fill First Name Textbox with input
	driver.findElement(By.name("firstname")).sendKeys("Babitha");
	//wait time
	Thread.sleep(2000);

	//TC-4 clear the input from First Name Textbox
	driver.findElement(By.name("firstname")).clear();
	//wait time
	Thread.sleep(2000);
	
	//TC-5 again fill the First Name Textbox with input
	
     driver.findElement(By.name("firstname")).sendKeys("Arpitha");
	
	//TC-6 Get the input from Textbox and display it in Console
     String s =driver.findElement(By.name("firstname")).getAttribute("value");
	System.out.println(s);
	
	
	//close the browser
	
	driver.close();

	}

}

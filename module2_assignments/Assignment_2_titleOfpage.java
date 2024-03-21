package module2_assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2_titleOfpage {

	public static void main(String[] args) throws InterruptedException {
/*1. TC-1 launch Chrome browser
2. TC-2 go to test URL https://www.google.com
3. TC-3 specify wait time for 5 sec
4. TC-4 get the title of page into console
5. TC-5 close the browser*/

//1. TC-1 launch Chrome browser
		
//To launch the browser		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
System.out.println("chrome Browser launched");

//2. TC-2 go to test URL https://www.google.com
//To get the URL of page
driver.get("https://www.google.com");
Thread.sleep(2000);
//3.TC-3 specify wait time for 5 sec
//wait time
Thread.sleep(5000);

//4.TC-4 get the title of page into console
//To get the page Title
String pgTitle =driver.getTitle();
System.out.println(pgTitle);
//TC-5 close the browser

driver.close();

	}

}

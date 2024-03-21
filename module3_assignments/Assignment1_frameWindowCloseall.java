package module3_assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1_frameWindowCloseall {

	public static void main(String[] args) throws InterruptedException {
/*
1. TC-1 launch Chrome browser
2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
3. TC-3 maximize the browser window
4. TC-4 get the title of page
5. TC-5 click on know more link text
6. TC-6 switch from 0th window to 1st window
7. TC-7 after switching get the title of page
8. TC-8 switch from 1st window to 0th window
9. TC-9 after switching, get the title of page
10. TC-10 close all windows of the browser*/
		
//1. TC-1 launch Chrome browser
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/

//To get the URL of page
driver.get("https://netbanking.hdfcbank.com/netbanking/");

Thread.sleep(2000);
//TC-3 maximize the browser window

driver.manage().window().maximize();

//4. TC-4 get the title of page
Thread.sleep(2000);
String pgTitle = driver.getTitle();
System.out.println(pgTitle);

driver.switchTo().frame(0);

Thread.sleep(5000);
//TC-5 click on know more link text
driver.findElement(By.xpath("//div[@id='nortonimg1']//a[contains(text(),'Know')]")).click();

//driver.findElement(By.name("btnK")).click();
//driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();


//6. TC-6 switch from 0th window to 1st window

ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles()) ;

driver.switchTo().window(window.get(1));


//7. TC-7 after switching get the title of page

 String pgTitle1 = driver.getTitle();
 System.out.println(pgTitle1);
 
 
//8. TC-8 switch from 1st window to 0th window

driver.switchTo().window(window.get(0));

//7. TC-7 after switching get the title of page

String pgTitle2 = driver.getTitle();
System.out.println(pgTitle2);

//10. TC-10 close all windows of the browser

driver.quit();




	}

}

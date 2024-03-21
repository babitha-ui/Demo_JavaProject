package module3_assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_BrowserNavigationMethods {

	public static void main(String[] args) {
/*1. TC-1 launch Chrome browser
2. TC-2 go to test URL - https://www.google.com
3. TC-3 maximize the browser window
4. TC-4 get the URL of page
5. TC-5 navigate to test URL - https://www.selenium.dev/
6. TC-6 get the URL of page
7. TC-7 navigate back to test URL - https://www.google.com
8. TC-8 get the URL of page
9. TC-8 navigate one step forward to test URL - https://www.selenium.dev/
10. TC-9 get the URL of page
11.TC-10 refresh the current page
12. TC-11 get the URL of page
13. TC-12 close the browser*/

//1. TC-1 launch Chrome browser
		
System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//2. TC-2 go to test URL - https://www.google.com
driver.get("https://www.google.com");

//3. TC-3 maximize the browser window
driver.manage().window().maximize();

//4. TC-4 get the URL of page
String pgURL = driver.getCurrentUrl();
System.out.println(pgURL);

//5. TC-5 navigate to test URL - https://www.selenium.dev/
driver.navigate().to("https://www.selenium.dev/");

//6. TC-6 get the URL of page
String pgURL1 = driver.getCurrentUrl();
System.out.println(pgURL1);

//7. TC-7 navigate back to test URL - https://www.google.com
driver.navigate().back();

//8. TC-8 get the URL of page
String pgURL2 = driver.getCurrentUrl();
System.out.println(pgURL2);

//9. TC-8 navigate one step forward to test URL - https://www.selenium.dev/
driver.navigate().forward();

//10. TC-9 get the URL of page
String pgURL3 = driver.getCurrentUrl();
System.out.println(pgURL3);

//11.TC-10 refresh the current page
driver.navigate().refresh();

//12. TC-11 get the URL of page
String pgURL4 = driver.getCurrentUrl();
System.out.println(pgURL4);

//13. TC-12 close the browser
//driver.close();
driver.quit();

	}

}

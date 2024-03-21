package automationPracticeScripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Boolean pgText=driver.findElement(By.xpath("//a[contains(text(),'Learn More Training Institution')]")).isDisplayed();
		System.out.println(pgText);
		/*
		 * String pgTitle=driver.getTitle();
		 * 
		 * System.out.println(pgTitle); Thread.sleep(2000);
		 */
		
		driver.findElement(By.id("username")).sendKeys("LearnMore");
		
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("learnmore@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Thread.sleep(2000);
		ArrayList<String> winHandles=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(winHandles.size());
		
		driver.switchTo().window(winHandles.get(1));
		Thread.sleep(2000);
		
		String pgTitle2=driver.getTitle();
		System.out.println(pgTitle2);
		Thread.sleep(2000);
		
		driver.switchTo().window(winHandles.get(0));
		
		Thread.sleep(2000);
		String pgTitle3=driver.getTitle();
		System.out.println(pgTitle3);
		
		driver.quit();
		

	}

}

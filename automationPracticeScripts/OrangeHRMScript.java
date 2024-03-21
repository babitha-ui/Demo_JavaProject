package automationPracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p")).
		 * click();
		 */
		
		/*Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		
		boolean pgText=driver.findElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")).isDisplayed();
		if(pgText==true) {
			System.out.println("displayed");
		
		}
		else {
			System.out.println("not displayed");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='profile picture']//following-sibling::*[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}

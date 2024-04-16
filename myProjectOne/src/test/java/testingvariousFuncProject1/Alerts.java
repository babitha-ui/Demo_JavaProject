package testingvariousFuncProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
	@Test
	public void frame_demo() throws InterruptedException {
	

	// TC1: Launch Chrome Browser 	
			WebDriver driver=new ChromeDriver();
			
//			TC4: manage the browser window to maximize -  Maximize Browser Window 		
				driver.manage().window().maximize();
				//Wait Time 3 Sec 1se=1000ms 
				Thread.sleep(3000);
			
	// TC2: Goto Test URL	 https://demoqa.com/droppable
			driver.get("https://demoqa.com/alerts");
			
			//Wait Time 5 Sec 1se=1000ms 
			Thread.sleep(5000);

            driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
			
			String alert = driver.switchTo().alert().getText();
			System.out.println(alert);
			driver.switchTo().alert().accept();
			
			driver.close();

}
}

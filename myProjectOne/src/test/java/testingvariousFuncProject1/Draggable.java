package testingvariousFuncProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {
	@Test
	public void dragAndDrop() throws InterruptedException {
		
		
		
		// TC1: Launch Chrome Browser 	
				WebDriver driver=new ChromeDriver();
				
		// TC2: Goto Test URL	 https://demoqa.com/droppable
				driver.get("https://demoqa.com/droppable");
				
				//Wait Time 5 Sec 1se=1000ms 
				Thread.sleep(5000);

//			TC4: manage the browser window to maximize -  Maximize Browser Window 		
				driver.manage().window().maximize();
				//Wait Time 3 Sec 1se=1000ms 
				Thread.sleep(3000);
		//Double click on Button
				WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
				Actions a=new Actions(driver);
				a.dragAndDrop(drag, drop).build().perform();
				Thread.sleep(4000);
			
		//Close the browser 
				driver.close();
			}

}

package testingvariousFuncProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	@Test
	public void slider_demo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	   driver.get("https://demoqa.com/slider");
	   
	   Actions action=new Actions(driver);
	   WebElement element = driver.findElement(By.xpath("//input[@type='range']"));
	   Thread.sleep(2000);
	   action.dragAndDropBy(element, 60, 0).build().perform();
	   Thread.sleep(2000);
	   driver.close();
	   
	}
	
	

}

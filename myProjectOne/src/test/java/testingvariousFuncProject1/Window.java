package testingvariousFuncProject1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {
	@Test
	public void new_window() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(window.get(1));
		Thread.sleep(2000);
		WebElement tab = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
		System.out.println(tab.getText());
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(window.get(0));
		
		driver.close();
		
		
		
	}		

}

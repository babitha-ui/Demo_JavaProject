package testingvariousFuncProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationForm {
	@Test
	public void RegistrationForm_demo() throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//go to url
	   driver.get("https://nxtgenaiacademy.com/demo-site/");
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector("input[id='vfb-5']")).sendKeys("Babitha");
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector("input[id='vfb-7']")).sendKeys("Jamanjyothi");
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector("input[id='vfb-31-2']")).click();
	   Thread.sleep(2000);
	   
	   
	   
	   driver.findElement(By.cssSelector("input[id='vfb-13-address']")).sendKeys("saroornagar");
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector("input[id='vfb-13-address-2']")).sendKeys("saroornagar1");
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector("input[id='vfb-13-zip']")).sendKeys("Hyderabad");
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.cssSelector("input[type='email']")).sendKeys("babitha.vishwanath@gmail.com");
	   Thread.sleep(2000);
	   
	   WebElement date=driver.findElement(By.xpath("//input[@id='vfb-18']"));
	   date.sendKeys("12");
	   date.sendKeys("/");
	   date.sendKeys("20");
	   date.sendKeys("/");
	   date.sendKeys("2023");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span[@role='presentation'])[1]")).click();
	   
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("India");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='vfb-19']")).sendKeys("123456789");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='vfb-20-0']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//textarea[@id='vfb-23']")).sendKeys("i want to learn selenium");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys("55");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='vfb-submit']")).click();
	   Thread.sleep(2000);
	   
	   driver.close();
}
}

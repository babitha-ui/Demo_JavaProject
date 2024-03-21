package module4_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3fb_absxpath {

	public static void main(String[] args) throws InterruptedException {
/*Tasks To Be Performed:
1. Automate Facebook Registration Page using Absolute XPath in Chrome
Browser https://www.facebook.com/*/
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait time
		Thread.sleep(2000);
		//To get the URL of the page

		driver.get("https://www.facebook.com/");
		//wait time
		Thread.sleep(2000);

		//To click on the create new account

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		//wait time
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("Babitha");
		//wait time
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Jamanjyothi");
		//wait time
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("1234567");
		//wait time
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys("babitha123");

		//wait time
		Thread.sleep(2000);

		Select select = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")));
		select.selectByIndex(9);

		//wait time
		Thread.sleep(2000);

		Select select1 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")));

		select1.selectByVisibleText("Apr");

		Select select2 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")));

		select2.selectByValue("2018");


		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		//wait time
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();


		driver.close();
			}

		}


	



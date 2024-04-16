package topic_ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_ReadPropertiesFlipKart {
	WebDriver driver;
	
  @Test
  public void sd_login() throws IOException, InterruptedException {
	  
	  Properties prop=new Properties();
	  FileInputStream ip=new FileInputStream("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myProjectTwo\\src\\test\\java\\topic_ObjectRepository\\config.properties");
	  prop.load(ip);
	  
	  
	  //url
	  String URL=prop.getProperty("url");
	  System.out.println(URL);
	  //browser
	  String Browser=prop.getProperty("browser");
	  System.out.println(Browser);
	  
	  if(Browser.equals("chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }
	  else if(Browser.equals("edge"))
	  {
		  driver=new EdgeDriver();
		  
	  }
	  else if(Browser.equals("ff"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  driver.manage().window().maximize();
	  //Go to URL
	  driver.get(URL);
	  Thread.sleep(2000);
	  
	
	//to close the login
	driver.findElement(By.xpath(prop.getProperty("closeLogin"))).click();
	Thread.sleep(2000);
	  
	  //driver.findElement(By.xpath(prop.getProperty("loginDataField"))).sendKeys(prop.getProperty("logindata"));
	  
	 // driver.findElement(By.xpath(prop.getProperty("LoginBtn"))).click();
	  
	 driver.findElement(By.xpath(prop.getProperty("searchBox"))).sendKeys(prop.getProperty("searchText"));
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(prop.getProperty("clickSearch"))).click();	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(prop.getProperty("clickRom"))).click();
			  
	 Thread.sleep(2000);
	 
	 ArrayList<String> window=new ArrayList<String>(driver.getWindowHandles());
	 
	 driver.switchTo().window(window.get(1));
	 
	 String title=driver.getTitle();
	 System.out.println(title);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath(prop.getProperty("addToCartButton"))).click();
	  
	 Thread.sleep(3000);
	 

	 driver.findElement(By.xpath(prop.getProperty("goToCart"))).click();
	  
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(prop.getProperty("placeOrder"))).click();
	  
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(prop.getProperty("inputData"))).sendKeys(prop.getProperty("inputlogindata"));
	  
	 Thread.sleep(2000);
	 
	 
	 
	driver.quit();
	  
	  
  }
}

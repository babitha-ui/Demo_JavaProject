package testingvariousFuncProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepickers {
	
	//Test online widgets like date pickers, tabs, sliders
	@Test
	public void calender_demo() throws InterruptedException {
		//Launch browser
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/datepicker/");
	Thread.sleep(2000);
	
	driver.switchTo().frame(0);
	
	//to click o the date
	 WebElement datepicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
	 datepicker.click();
	 Thread.sleep(2000);
	 datepicker.sendKeys("2023");
	 datepicker.sendKeys("/");
	 datepicker.sendKeys("12");
	 datepicker.sendKeys("/");
	 datepicker.sendKeys("29");
	 	
	 Thread.sleep(2000);
	
	
	
	/*WebElement month1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/span[1]"));
    System.out.println(month1.getText());
    
    if(month1.equals("December"))
    {
    	driver.findElement(By.linkText("29")).click();
    }
    else
    {
    	do {
    		
    	
    	WebElement month2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/span[1]"));
        System.out.println(month2.getText());
        
        if(month2.equals("December"))
        {
        	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[5]/td[6]/a[1]")).click();	
        	break;
        }
        else
        {
        driver.findElement(By.xpath("//span[text()='Next']")).click();	
        
        Thread.sleep(2000);
        }
    	
    
    
    
}while(true);
    }
    driver.close();
	}
	
	
}*/
	 driver.close();
		}
		
		
	}
	

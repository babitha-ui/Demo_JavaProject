package testingvariousFuncProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_tab {
	@Test
	public void tab_demo() throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Enter url
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		//switch to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		//navigate to url
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//close the browser
		driver.close();
		
	}

}

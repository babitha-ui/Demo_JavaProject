package testingvariousFuncProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ResizableElement {
	@Test
	public void ClickNdHold() throws InterruptedException{
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//go to url
	driver.get("https://jqueryui.com/resizable/");
	Thread.sleep(2000);
	//switch to frame
    driver.switchTo().frame(0);
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//h3[text()='Resizable']/following-sibling::*[3]"));
	Thread.sleep(2000);
	action.clickAndHold(element).moveByOffset(75,80);
	//action.moveToElement(element).dragAndDropBy(element,700,300).build().perform();
	Thread.sleep(2000);
	driver.close();
}
	
}

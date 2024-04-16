package topic_ObjectRepository;


	
	

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.List;

	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	/*Domain: E-Commerce
	Objective: This project aims at developing a Page Object Model framework and being able
	to use this framework to login and buy a product from www.flipkart.com
	Pre-requisites: Create an account in â€˜flipkart.comâ€™ manually that should be used for this
	project. (Notthrough automation as you may end up creating a new account every time you
	run this script).
	Description ofthe Datasetis mentioned below:
	â€¢ Login data used in pre-requisite for logging into the site.
	â€¢ â€˜iPhone 12â€™ the product that needs to be searched.
	â€¢ A 64GB phone needs to be selected out of other variants available in the list of phones.
	â€¢ Firefox and Chrome as browsers.
	Problem Statement 1:
	â€¢ Search for â€˜Mobile Phoneâ€™ on the â€˜flipkart.comâ€™ homepage.
	â€¢ Fetch all the mobile phones listed in the product listing page along with their prices
	and output them to an excel file and store them inside folder â€˜testresultâ€™ in
	â€˜src/test/resourcesâ€™
	*/

	public class Project4_Problem1 {
		public WebDriver driver;
		int list;
		List<WebElement> price;
		List<WebElement> phones;

		// launch the browser
		@Test(priority = 1)
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		// Search for â€˜Mobile Phoneâ€™ on the â€˜flipkart.comâ€™ homepage
		@Test(priority = 2)
		public void search() throws InterruptedException {
			
			//to close the login
			driver.findElement(By.xpath("//label[contains(text(),'Enter Email')]/preceding::*[6]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile phones", Keys.ENTER);
		}

		/*
		 * Fetch all the mobile phones listed in the product listing page along with
		 * their prices and output them to an excel file and store them inside folder
		 * â€˜testresultâ€™ in â€˜src/test/resourcesâ€™
		 */

		@Test(priority = 3)
		public void test_Result() {
	//to get all the phonenames from the search result
		phones=	driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		int noOf_phones=phones.size();
		System.out.println("Number of phones displayed="+noOf_phones);
		for(int i=0;i<=noOf_phones-1;i++)
		{
			System.out.println(phones.get(i).getText());
		}
	//to get the price of the phone from the search result	
		 price=	driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 list=price.size();
		for(int i=0;i<=list-1;i++)
		{
			System.out.println(price.get(i).getText());
		}
		
		}
		//to write the phone names and its price in the Excel file
		@Test(priority = 4)
		public void write_Excel() throws IOException {
			File f=new File("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myProjectFour\\src\\test\\java\\topic_ObjectRepository\\project4_output.xlsx");
			
			XSSFWorkbook w= new XSSFWorkbook();
			XSSFSheet s=w.createSheet("project4output");
			XSSFRow r=s.createRow(0);
			r.createCell(0).setCellValue("items");
			r.createCell(1).setCellValue("price");
			
			
			for(int i=0;i<=list-1;i++)
			{
				XSSFRow r1=s.createRow(i+1);
				r1.createCell(0).setCellValue(phones.get(i).getText());
				r1.createCell(1).setCellValue(price.get(i).getText());
			}
			
			FileOutputStream fop=new FileOutputStream(f);
			try {
				w.write(fop);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			w.close();
			driver.close();	
		}

	}




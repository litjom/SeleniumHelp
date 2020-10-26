package TestngConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	
WebDriver driver;	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://signup.ebay.com/pa/crte?ru=");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
	//Since method static -call diresctly no noeed to create object
	ArrayList<Object[]> testData=	DataProviderGetTestData.getTestData();
	//Now testData above hold the entire value
	return testData.iterator();

	//ITertor will give one to one mapping to parameter in @TEST
	
	}
	
	@Test(dataProvider="getTestData")
	public void halfebayregistrationpagetest(String firstName,String lastName,String emailID,String Password){
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(emailID);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}

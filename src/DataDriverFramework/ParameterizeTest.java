package DataDriverFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizeTest {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://signup.ebay.com/pa/crte?ru=");
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\LITTIN JOMON\\workspace\\selenium tutorial\\src\\DataDriverFramework\\Automation PracticePart2.xlsx");
 int rowCount =reader.getRowCount("Sheet1");
 for(int rowNum=2;rowNum<=rowCount;rowNum++){
	
	 reader.addColumn("Sheet1", "Status");
	 //So now it will add column then enter for loop
	 
	 String Firstname =reader.getCellData("Sheet1", "firstname", rowNum); 
	String Lastname=reader.getCellData("Sheet1", "lastname", rowNum); 
	String EmailID=reader.getCellData("Sheet1", "emailid", rowNum); 
	String Password =reader.getCellData("Sheet1", "password", rowNum); 
 
	//Just write a clear and then send key from next step
	driver.findElement(By.xpath("//input[@id='firstname']")).clear();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Firstname);
	driver.findElement(By.xpath("//input[@id='lastname']")).clear();
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Lastname);
	driver.findElement(By.xpath("//input[@id='Email']")).clear();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(EmailID);
	driver.findElement(By.xpath("//input[@id='password']")).clear();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	
	
	//2nd
	driver.findElement(By.xpath("//input[@id='firstname']")).clear();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Firstname);
	driver.findElement(By.xpath("//input[@id='lastname']")).clear();
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Lastname);
	driver.findElement(By.xpath("//input[@id='Email']")).clear();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(EmailID);
	driver.findElement(By.xpath("//input[@id='password']")).clear();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
 
 
	//3r
	driver.findElement(By.xpath("//input[@id='firstname']")).clear();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Firstname);
	driver.findElement(By.xpath("//input[@id='lastname']")).clear();
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Lastname);
	driver.findElement(By.xpath("//input[@id='Email']")).clear();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(EmailID);
	driver.findElement(By.xpath("//input[@id='password']")).clear();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	
	
	//4th
	driver.findElement(By.xpath("//input[@id='firstname']")).clear();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Firstname);
	driver.findElement(By.xpath("//input[@id='lastname']")).clear();
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Lastname);
	driver.findElement(By.xpath("//input[@id='Email']")).clear();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(EmailID);
	driver.findElement(By.xpath("//input[@id='password']")).clear();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	
	
	
 reader.setCellData("Sheet1", "Status", rowNum, "Pass");
 //Write a particular data
 
 driver.quit();
 
 }
	
	
	}

}

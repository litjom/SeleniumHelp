package DataDriverFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadriverTestt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//You can create a package for all excel sheet

	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\LITTIN JOMON\\workspace\\selenium tutorial\\src\\DataDriverFramework\\Automation PracticePart2.xlsx");
	String firstname = reader.getCellData("Sheet1", "firstname", 2);
	System.out.println(firstname);
	String lastname =reader.getCellData("Sheet1", "lastname", 2);
	System.out.println(lastname);
	String emailID =reader.getCellData("Sheet1", "emailid", 2);
	System.out.println(emailID);
	String Password =reader.getCellData("Sheet1", "password", 2);
	System.out.println(Password);
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.get("https://signup.ebay.com/pa/crte?ru=");




driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(emailID);
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	}

}

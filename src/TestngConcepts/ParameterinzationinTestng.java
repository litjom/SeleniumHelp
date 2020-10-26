package TestngConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterinzationinTestng {
WebDriver driver;
	
@BeforeMethod
public void setup(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
}		
@Test
@Parameters({"url","emailId","browser"})

	public void yahooLogiTest(String emailId,String browser){
	if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='login-username']")).click();
}

@AfterMethod
public void tearDown(){
	driver.quit();
}
	
}

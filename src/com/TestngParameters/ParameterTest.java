package com.TestngParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	// we are gonna open gmail
	//enter username and password, common through out the script
@Test
@Parameters({"browser,url,emailID"})
//You can use @PARAMETER IN TESTNG or config.property file
//These are environmental variable not TESTDATA 
//EXCEL - TEST DATA
//PROPERTIES FILE / CONFIG FILE - ENVIRONEMNT VARIABLES OR TEST DATA
//TESTNG.XML-ENVIRONMENT VARIABLE
public void yahoologintest(String browser,String url, String emailID){
	if (browser.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
    driver = new ChromeDriver ();	
	}
	//else if (browser.equals("Firefox")){//same from above
	driver = new ChromeDriver();
	driver.get("url");
	driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("emailID");//enter username
	driver.findElement(By.xpath("//input[@value='Next']")).click();//click on next button
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

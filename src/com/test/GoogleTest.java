package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
WebDriver driver;	

@BeforeMethod
public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();	
	driver.get("http://google.com");
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}

@Test(priority =1,groups  = "Title")
public void googleTitleTest(){
String title = driver.getTitle();

System.out.println(title);
}

@Test(priority =2,groups = "Logo")
public void googlelogoTest(){
	boolean b = driver.findElement(By.xpath("//canvas[@height='384']")).isDisplayed();
	
}

@Test(priority =3,groups = "Homepage")
public void maillinkTest(){
	boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
}


@Test(priority =4 ,groups= "test4")
public void test1(){
	System.out.println("test 1");
}


@AfterMethod
public void teardown() throws InterruptedException{
	Thread.sleep(3000);
	driver.quit();
}
}

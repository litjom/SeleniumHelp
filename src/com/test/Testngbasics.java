package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
@BeforeSuite
public void setUp(){
	System.out.println("set up system property for chrome");
}

@BeforeClass
public void enterurl(){
	System.out.println("Enter URL");
}

@BeforeMethod()
	public void launchBrowser(){
	System.out.println("launch the chrome");
}
@BeforeTest
public void login(){
	System.out.println("login method");
	//@Before are pre condition
}
@Test
public void googleTest(){
	System.out.println("google title test");
}


@Test
public void chromeTest(){
	System.out.println("chrome title test");
}
 // @After post condition
 @AfterMethod
 public void logout(){
	 System.out.println("Log out method");
 }

@AfterTest
public void deletecookies(){
	System.out.println("Delte all cookies");
}

@AfterSuite
public void generateTestReport(){
	System.out.println("Genrete test report");
}


}

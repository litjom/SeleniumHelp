package TestngConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngBasics {

	@BeforeSuite
	public void setupmethod(){
		System.out.println("Setting up system property");
	}
	
	@BeforeClass
	public void luanchBrowser(){
		System.out.println("launch browser");
	}
	
	@BeforeMethod
	public void enterURL(){
		System.out.println("Entering url");
	}
	
	@Test
	public void googletile(){
		System.out.println("Login method");
	}
	
	@Test
	public void searchTest(){
		System.out.println("Second test case");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("Login out");
	}
	
	
	@AfterTest
	public void deletallcookies(){
		System.out.println("Delete all cookies");
	}
	
	@AfterClass  
	public void closeBrowser(){
		System.out.println("close broswer");
	}
}

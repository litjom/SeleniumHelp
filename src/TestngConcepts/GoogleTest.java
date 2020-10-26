package TestngConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleTest {

	
	WebDriver driver ;
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}		 
		@Test(priority =3,description="Health check",groups="login")
		public void Googletitletest(){
			String title = driver.getTitle();
			System.out.println("Title is "+title);
			Assert.assertEquals("Google", title,"We can add also description");
			
		}
		
		
		@Test(priority=1,description="Regression",groups="login")
		public void googlelogotest(){
		boolean b =	driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
			if(b == true){
				System.out.println("Displayed");
			}
		Assert.assertTrue(b);
		Assert.assertEquals(true, b);//Expecting true
		//So b should be true now
		// you can also write assert.equals
		}

		
		@Test(priority=2,dependsOnMethods="Googletitletest",description="Regression",groups="login")
		public void mailinktest(){
			boolean b1 = driver.findElement(By.linkText("Mail")).isDisplayed();
		}
			
			
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
//IF you have 100 classes/test cases -you have to create .xml file
}

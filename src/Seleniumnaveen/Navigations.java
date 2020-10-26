package Seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//after this you want to go facebook.com
		driver.navigate().to("https://www.facebook.com/");
		
		//to come back to google page
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//to click forward browser element
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		
		//click on back button
		driver.navigate().back();
		
		//to refresh
		driver.navigate().refresh();
		
	}

}

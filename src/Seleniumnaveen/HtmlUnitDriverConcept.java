package Seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		
		
		
		//HEADLESS BROWSER or
		//HTML DRIVER also called GHOST DRIVER :No browser launching
		//Exceuting is very fast since no launching browser
		//Disadavantages :not suitable for action class like mouse movement,double clik
		//drag and drop
		//HTML driver is not available in selnium 3 jar files
		//To download this we have to download HTMLUNIT DRIVER JAR FILES
		/*Google page write htmlunitdriver JAR download
		2.27 downlaod and save it
		now copy the JAR files > Project properties > Libraries >External jar > add> apply
		*/
		WebDriver driver =new  HtmlUnitDriver();
		
		//WebDriver driver = new ChromeDriver ();//Launch chrome
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		
		System.out.println("Before lgon title is  " + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Naveenk");
	
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
		
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	System.out.println("After login title is this " + driver.getTitle());
	}

}
/*highlight an element
Capture an screenshot with a border
scroll up and down
we can take a screenshot a like in manual testing sometime we circle the error
*/
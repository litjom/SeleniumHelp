package Seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
//implicit is dynamic wait
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		/*Suppose you are launching a heavy site na dpage is getting loaded
		 * only in 5 to 10 SECONDS to LOAD FULL PAGE
		 * 
		 */
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		//Some time application is so slow in STAGE or QA environment
		//so one WAIT is available IMPLICIT WAIT
		//FOR PAGE
		
		
		//DYNAMIC WAIT FOR PAGE
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//Global wait
		//We are giving max of 40 seconds for the page to load then it will give you error
		//wait for 40 seconds to give you error (to find element)
		//lets say page is downloded in 2 SECONDS so rest of the 
		//seconds will be ignored unlike THREAD.SLEEP
		
		
		//DYNAMIC WAIT FOR ELEMENT
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Global wait
		//IMPLICITLY WAIT - is for all the elements available in page
		//Lets say page is fully loaded but a particular button or AJAX comp 
		//(Like SUBMIT BUTTON) is coming after 5 seconds
		
		
		//HARD WAIT
		//Its going to wait will 20 seconds even if the page load within 2 seconds
		Thread.sleep(3000);
	}

}

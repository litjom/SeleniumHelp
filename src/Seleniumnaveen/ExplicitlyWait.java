package Seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//EXPLICITLY WAIT: wait for SPCIFIC ELEMENT
		driver.get("https://www.amazon.com/");
		//Suppose you wrote a command to click on SUBMIT BUTTON but the SUBMIT BUTTON
		//is loading after some. SO you have to put explicity wait meaning
		//you ware waiting for the specific element explicitly
		
		
		/*esp for AJAX component like drop down
		 * you are selecting india - maharastra - pune
		 * so the option will be changed in 3rd drop down but it take time to change 
		 * in state or city
		 */
		
		
		//static in nature so no need to create object
		clickOn(driver, driver.findElement(By.xpath("//input[@value='Go'] ")), 20);
		// 3 parameter..What is you driver... whic elemetn you want to click and how  many seconds
		
		//Create a page link click
		clickOn(driver,driver.findElement(By.xpath("//a[@class='nav-sprite nav-logo-tagline nav-prime-try']")),20);
		 
	}
	//Standard method for explicitly wait 
	//Method name is CLICKON METHOD
	//This explicti method is only for click if its dropdown another method
	public static void clickOn(WebDriver driver, WebElement locator, int timeout){
	new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
	//creating new webdriver object thru (new webdriver wait) and please ignore
	//stale element reference expection until the  expected condition (element is clickable)
	//which element? Element inside the bracket or locator
	.until(ExpectedConditions.elementToBeClickable(locator));
	//There are no of option
	//elemt to be visible
	//elemnt to be slected, clickable, presence of element, text to present
	locator.click();
}
}
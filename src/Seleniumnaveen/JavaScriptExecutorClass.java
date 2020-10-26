package Seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorClass {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		
		
		
		
		
		WebDriver driver = new ChromeDriver ();//Launch chrome
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("litjom");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
		
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	// To highlight something we use java script executor method
	
	
	//VERY IMP ******You always call the other method in main method*****
		Thread.sleep(3000);
	WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
	//This is for login button
	
	//Now calling FLASH METHOD IN  MAIN METHOD
	
	flash(loginBtn, driver);//Highlight the specific element
	//like in manual testing we mark the element and MARK THE BUG
	//MAKING THE BUG =JavascriptExecutor
	
	
	//Calling draw border method
	drawBorder(loginBtn,driver);
	
		

	}
	public static void flash(WebElement element, WebDriver driver)//flash means highlight
	{

		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//JavaScriptExecutor = to handle java script calls
		//This is called CASTING converting this driver into JAVASCRIPT DRIVER
String bgcolor =element.getCssValue("backgroundColor");
	//you taking the value by CSSValue to get background color of element and storing
	//in some String value bgcolor
for (int i = 0;i<=10;i++)//it will blink it 10 times
	//Flashing adv = we will get to know where the control is available
{
changeColor("rgb(0,200,0)" , element,driver);
		// rgb code for each and everycolor
changeColor(bgcolor,element,driver);
	}
	}
	
	public static void changeColor(String color, WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.backgroundColor = '"+color+"'",  element);
		//ExecutorScript -To execute javascript
		
		
		try{
			Thread.sleep(20);
		} catch(InterruptedException e){
			
		}
			
				
	}
	
//MARKING THE BUG
	public static void drawBorder(WebElement element,WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.border = '3px solid red'", element);
		//since its for border = style.border
	}
	
	
	
	
	
	
	
	
	
	

}

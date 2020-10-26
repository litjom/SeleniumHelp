package Seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MousemovementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*Some time you have to mouse over or hoover over menu to display
		the submenus*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//mouse over or hoover over
		//Action class object
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
   //since its taking some time when you mouse over to display options
	Thread.sleep(3000);	
		driver.findElement(By.linkText("Seat + Meal Combo")).click();
	}

}

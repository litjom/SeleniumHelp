package Seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Litjom");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Abc123");
	Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		// we dont have to return anythinf so no need to create an object
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts']")).click();
	//You will get an error UNABLE TO LOCATE ELEMENT
	//NO SUCH ELEMENT EXCEPTION why?
	//Beacuse the element is in some oher frame
	//So before click on the contact link you need use SWITCHTO().FRAME()
		
	
	
	}

}

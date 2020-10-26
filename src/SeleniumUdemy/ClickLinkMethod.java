package SeleniumUdemy;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickLinkMethod {

public static WebDriver driver;	
// object of class + .clicklink("File a Bug")
	public static void clicklink(String linkText){
		if(driver.findElements(By.linkText(linkText)).size()==1){
			driver.findElement(By.linkText(linkText)).click();
		}else if (driver.findElements(By.partialLinkText(linkText)).size()==1){
			driver.findElement(By.partialLinkText(linkText)).click();
		}else
			
		throw new NoSuchElementException("Link Text not found"+linkText);
	}
}

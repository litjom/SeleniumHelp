package SeleniumUdemy;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IfElementpresent {

	
	
	
	public static WebDriver driver;	
	// object of class + .clicklink("File a Bug")
		public static boolean isElementPresent(String locator){
			boolean status=false;
			boolean flag =false;
			if(driver.findElements(By.linkText(locator)).size()==1){
				status= true;
			}else if (driver.findElements(By.partialLinkText(locator)).size()==1){
				status= true;
			}else
				
			status=false;
			return status;
		}

	}
	


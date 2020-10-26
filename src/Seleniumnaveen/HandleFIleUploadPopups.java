package Seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFIleUploadPopups {

	public static void main(String[] args) {
		//Selenium does not handle windows popup the one come
		//after you press upload or browse mostly my document
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//thrive_headline[@class='tho_title_changed tho-viewport-triggered']//input[@type='file']")).sendKeys("C:\\Users\\LITTIN JOMON\\Documents\\");
		
	
		//Dont use .click as it is WINDOW POP UP
		//Use send key to give the PATH or LOCATION of the file
        
	}

}

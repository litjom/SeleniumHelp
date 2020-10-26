package Seleniumnaveen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		WebDriver driver;//GLOBAL VARIABLE
// we have to read the property file config.properties1
		
// we have to create the object for properties
		
Properties prop = new Properties();//properties class is already available in java

//we have to create an object for FILEINPUTSTREAM CLASS
//you have to give the path of config.properties
FileInputStream ip = new FileInputStream("C:\\Users\\LITTIN JOMON\\workspace\\selenium tutorial\\src\\Seleniumnaveen\\config.properties");

// we have on method
//load this FileInputClass
//File input Stream class is connection between your java code and config file
prop.load(ip);
//now you have loaded all the properties
//now whats left is you have to access those properties
System.out.println(prop.get("browser"));
	
String browserName =prop.getProperty("browser");

if (browserName.equals("chrome")){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
   driver = new ChromeDriver ();//Launch chrome
   //else if(broesername.equals("Firefox")){
   //driver= new FirefoxDriver(); }
   //else{ System.out.println("No driver")   }
   driver.get(prop.getProperty("URL"));
   driver.findElement(By.name(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
   driver.findElement(By.name(prop.getProperty("Login_xpath"))).click(); 
   
}
	
	
	}

}

package Seleniumnaveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	static WebDriver driver;//making it a global variable

	public static void main(String[] args) throws IOException, InterruptedException {
	//  to READ PROPERTIES we have to create object of the properties class
		
		//Create the object of PROPERTIES CLASS
		//PROPERTIES is a CLASS in JAVA
		
		Properties prop = new Properties();
		
		//Create the object for FILEINPUTCLASS
		//FILEINPUTSTREAM is a CLASS in JAVA
		FileInputStream ip = new FileInputStream("C:\\Users\\LITTIN JOMON\\workspace\\selenium tutorial\\src\\Seleniumnaveen\\config.properties");
		//we have to tell where the file input is available in quotes
		
		//Now we have to load
		prop.load(ip);
		
		//you want to print name
		//by using prop object =prop.getproperty method is there
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		
		
		//lets say you want to get the value of URL
	String url = 	prop.getProperty("URL");
	//since url is a string value
	System.out.println(url);
	
	
	//you wanna get the property of browser
	String browsername = prop.getProperty("browser");
	System.out.println(browsername);
	
	
	if (browsername.equals("chrome"))
	{
		//intialize the webdriver with chrome drive
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
  driver = new ChromeDriver ();
	}
	
	/*else if(browsername.endsWith("FF"))//firefox
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\geckodriver.exe");
	driver = new Firefox();
	}
	//else if for internet explorere same thing
	driver.get(url);
	//ADVANTAGE
	//Lets say tommoro you want to run on FIrefox.just change the values in config.properties
	*/
	driver.get(url);
	Thread.sleep(5000);
	//No more hard coded value
	driver.findElement(By.xpath(prop.getProperty("firstname_Xpath"))).sendKeys(prop.getProperty("firstName"));
	driver.findElement(By.xpath(prop.getProperty("lastname_Xpath"))).sendKeys(prop.getProperty("lastName"));
	driver.findElement(By.xpath(prop.getProperty("Email_Xpath"))).sendKeys(prop.getProperty("Email"));
	
	}	
}



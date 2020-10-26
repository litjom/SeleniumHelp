package Seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		/* ABSOLUTE XPATH -  means its the complete address of the element
		 * starting from parent node to child node.
		 * ITS A RISKY XPATH BCOZ lets say the search path moved from left to right 
		 * side of the page, then the address will change and element would not be
		 * found
		 * Its also very slow, script will be slow
		 * not reliable
		 */

		
		//CREATING OUR OWN XPATH
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		//put double (// +  find the html tag = input + [] inside square bracket
		//@+class or type or name or whatever attribute Properties
		//+ single quotes the value of class property= 'text'
		
		//Another way to customize xpath
		//driver.findElement(By.xpath("//input[contains(@text='text')]"));
		
		
		
		//dynamic id= Everytime id is getting changed attribute is (input)
		//id = test_123
		//id=test_456
		//id=test_789
		
	
		//Since it ID value changes everytime we can use CONTAINS
		//it will ignore the dynamic part
		driver.findElement(By.xpath("//input[contians(@id,'test_')]")).sendKeys("Java");
		
		
		//Another way to deal with dynamic xpath
		//This is more appropriate
		driver.findElement(By.xpath("//input[startswith(@id, 'test_')]")).sendKeys("java");
	   
	
		
		/*id = 123_test_t
		 * id = 3456_test_t
		 * id=45687_test_t
		 */
		//we can use CONTAINS but
		driver.findElement(By.xpath("//input[endswith(@id, 'test_t')]")).sendKeys("java");
	
	
	//How to create an xpath for clicking on a link
	//all the links are represented by <a> HTML TAG
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
	}

}

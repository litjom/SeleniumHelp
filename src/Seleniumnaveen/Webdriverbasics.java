package Seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Webdriverbasics {

	public static void main(String[] args) {
		//Firefox driver = gecko driver 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver (); //lounge the chrome browser
		
		//lounge the chrome browser
		
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&pageType=3984&ru=https%3A%2F%2Fmy.ebay.com%2Fws%2FeBayISAPI.dll%3FMyEbayBeta%26MyEbay%3D%26gbh%3D1%26guest%3D1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26pageType%3D3984%26ru%3Dhttps%253A%252F%252Fmy.ebay.com%252Fws%252FeBayISAPI.dll%253FMyEbayBeta%2526MyEbay%253D%2526gbh%253D1%2526guest%253D1");
		 //LOCATORS
		//xpath
		//absolute xpath shoudl not be used like div1div3
		//should only use relative xpath
		 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Littin");
		
		 
		 driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Jomon");
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("122008bell bravo@gmail.com");
		
		
		 // ID LOCATOR
		//driver.findelement(By.id("")).sendKeys("");
		 
		 //name locator
		 //driver.findElement(By.name("")).sendKeys("");
		 
		 
		 //Linktext - only for links
		 //driver.findElement(By.linkText("Help")).click();
		
		 
		 
		 //Partiallink text - not reccomended
		 // a long text is available for link
		 //no  need to complete link just partial is enough
		 driver.findElement(By.partialLinkText("")).click();
		 
		 //CSS selector
		 //if ID is there #{id}
		 //if class is there  .{class}
		 //driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("Acerpire5");
		 
		 //class
		 //driver.findElement(By.className("ml53 tx")).click();
		 
		 //to get title of this page, whatever is on the tab is title
		
		String title = driver.getTitle();
		//get title is tring function
		System.out.println(title);
		//validation point
		if (title.equals("Google")){
			System.out.println("Correct title");
		}
		else 
		{
				System.out.println("Incorrect title");
			}
		//What is the current URL
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//if you want to quit
		//driver.quit();
		
		//HANDLE DROP BOX-TO CHOOSE SPECIFIC VALUE
		// CREATE THE OBJECT OF SELECT CLASS
		// Select select =new Select(driver.findElement(By.id("State")));
		// select.selectByVisibleText("California");
		
	}
	}



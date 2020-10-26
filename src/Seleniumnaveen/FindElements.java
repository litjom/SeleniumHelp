package Seleniumnaveen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		//How may links and text are availble ein a website like ebay
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		// 1.) to get the counts of the link
		//2.) to get the text of each link
		
		
		//To get count of link
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		//you will write input or button inside tagname Bracket if you want input
		//Why 'a' becasue HTML TAG
		//we use list becasue return type is gonna be list of web element
//driver give me all the links (HTML TAG'a')
		
		//to get the size of link list
		System.out.println(linklist.size());//total no of links
	
	//to print all the text 0 use for loop
		for (int i =0; i<=linklist.size();i++){
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}
	}

}

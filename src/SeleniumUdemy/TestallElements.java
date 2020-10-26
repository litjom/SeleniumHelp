package SeleniumUdemy;

import org.openqa.selenium.WebElement;

public class TestallElements {

	//Testing all links present in webpage
	
public static	WebDriver driver;
	@Test
	public void testalllinks(){
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:link)	{
			System.out.println("Webelemt present"+ele.getText());
		System.out.println("webelement present"+ele.getAttribute("href"));
		}
	}
	
	public void testalllinks(){
		List<WebElement> link = driver.findElements(By.cssselector("a"));
		
		for(WebElement ele:link)	{
			System.out.println("Webelemt present"+ele.getText());
		System.out.println("webelement present"+ele.getAttribute("id"));
		System.out.println("webelement present"+ele.getAttribute("name"));
		System.out.println("webelement present"+ele.getAttribute("title"));
		
		}
	}
}

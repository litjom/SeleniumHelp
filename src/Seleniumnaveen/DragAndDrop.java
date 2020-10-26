package Seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		//source object - the one thats getting dragged
		//target object -the one that s getting dragged in to
		//so manual steps will be
		//click on the object you want to drag  - click and hold
		//drag to target and   -                  release
		driver.get("http://jqueryui.com/droppable/");
		//Rigth click - page source ctrl + F type Frame
		//If IFRMAE is there then theres is a frame
		driver.switchTo().frame("/resources/demos/droppable/default.html");//0 becasue only 1 frame is there\
		// Drage and drop 
		//Create action class
		Actions action =new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//head[@data-live-domain='jqueryui.com']")))
		.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		

	}

}

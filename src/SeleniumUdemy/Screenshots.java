package SeleniumUdemy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Screenshots {
public static WebDriver driver;
	@Test
	public void screenshot() throws InterruptedException{
		driver.get("https://stackoverflow.com/questions/49520858/error-occurred-during-initialization-of-boot-layer-findexception-module-not-fou");
		
		//Scrolling
		JavascriptExecutor exe =(JavascriptExecutor)driver;
		exe.executeScript("window.scrollTo(0,0)");//horizontal,veritcal at 0 index
		//First i need to check if there is a scroll bar index
		//So in order to check -Javascript
		Boolean check =(Boolean)exe.executeScript("document.documentElement.scrollHeight>documentElement.clientHeight");
//Casted it to boolean since its returning true or false
//stored in a boolean data type
	Long scrollH =(Long)exe.executeScript("return document.documentElement.scrollHeight");	
	//height if current webpage visible
	Long clientH =(Long)exe.executeScript("return document.documentElement.clientHeight");	
	int index=1;
	if(check.booleanValue()){
		//If this is true (Meaning scroll is there) we perform the method or else screenshot
	while(scrollH.intValue()>0){
		Screenshot.takescrenshot("Screen "+index);
		exe.executeScript("window.scrollTo(0",+ clientH*index+")");
	
		
		scrollH=scrollH-clientH;//Subtracting the scrool height which already performed
		
		//to get the scrool effect
	
		Thread.sleep(2000);
		index++;
	
	}
	}
	
	}
	
}

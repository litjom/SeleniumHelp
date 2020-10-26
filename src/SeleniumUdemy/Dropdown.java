package SeleniumUdemy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
	public void dropdown(WebElement locator,int index){
		Select sel = new Select(locator);
		sel.selectByIndex(index);
	}
	
	public void dropdown2(WebElement locator,String value){
		Select sel = new Select(locator);
		sel.selectByValue(value);
	}
	
	public void dropdown3(WebElement locator,String value){
		Select sel = new Select(locator);
		sel.selectByVisibleText(value);
	}
}

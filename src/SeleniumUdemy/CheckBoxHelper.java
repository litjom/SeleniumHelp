package SeleniumUdemy;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxHelper {
public static WebDriver driver;
	public static WebElement getElement(String locator){
		if(driver.findElements(By.id(locator)).size()==1){
			return driver.findElement(By.id(locator));
		}else if(driver.findElements(By.className(locator)).size()==1){
			return driver.findElement(By.className(locator));
		}else
			//Keep doing it 
			throw new NoSuchElementException("No Elment"+locator);
		
	}
	
	public static void clickCheckBox(String locator){
		WebElement ele = getElement(locator);
		ele.click();
	}
	public static boolean isChecked(String locator){
		WebElement ele = getElement(locator);
		return ele.isSelected();
		//Using it static use class name +method
		//
	}
	
	//ClickButton
	public static void clickButton(String locator){
		WebElement ele = getElement(locator);
		ele.click();
	}
	
	
	
}

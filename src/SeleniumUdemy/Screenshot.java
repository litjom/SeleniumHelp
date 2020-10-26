package SeleniumUdemy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import Seleniumnaveen.TakeScreenshot;

public class Screenshot {
public static void takescrenshot(String filename){
	try{
		File src = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src, new File("My jpg\\"+filename+"jpg"));
	}catch(IOException e){
		e.printStackTrace();
	}
}
	
	//Inside the text to use it
try{
	throw new FileNotFoundException();
}catch(FileNotFoundException e){
	Screenshot.takescreenshot(this.getClass().toString());
	//gettting the method using class name
	//then in the method we are either hardocding the class
	//or getting the class name
}







	
	public  static WebDriver driver;
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File src = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
try{
		FileUtils.copyDirectory(src, new File("My jpg"));
}	catch(IOException e){
	e.printStackTrace();
}
}
	
	

}

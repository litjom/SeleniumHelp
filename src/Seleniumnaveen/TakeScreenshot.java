package Seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.entity.mime.content.FileBody;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.util.jar.pack.Package.File;

import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// you want to take screen shot
		File src = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//interview - yes you can take screenshot by using .GETSCREENSHOTAS
		//now copy the screenshot to desired location
		FileUtils.copyFile(src, new FileBody("C:\\Users\\LITTIN JOMON\\workspace\\selenium tutorial\\src\\Seleniumnaveen"));
		// To check screenshot
		//Refresh the package you are in
		
	}

	public java.io.File getScreenshotAs(OutputType<java.io.File> file) {
		// TODO Auto-generated method stub
		return null;
	}

}

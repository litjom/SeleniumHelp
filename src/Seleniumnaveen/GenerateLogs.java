package Seleniumnaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.istack.internal.logging.Logger;


public class GenerateLogs {

	public static void main(String[] args) {
		//We have one class = Logger.getLogger
		Logger log = Logger.getLogger(GenerateLogs.class);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		log.info("launch browser");
		
		driver.get("http://www.google.com");
		log.info("google url has been launched");
		
		String title = driver.getTitle();
		System.out.println("title value is:" +title);//generate in console
	
		//this will generate value in log
		log.info("title value is:" +title);
		if (title.equals("Google")){
			System.out.println("correct title is Google");
			log.info("correct title is goog le and test case is paased");
		}else{
			System.out.println("correct title is not Google");
			log.info("correct title is not google and test case is Failed");
		}
		
		driver.quit();
		log.info("browser is closed");
	}

}

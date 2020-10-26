package Seleniumnaveen;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
//like are you sure you want to cancael it
//Are you sure you want to delete it = popups or ALERT orJAVASCript pop up
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LITTIN JOMON\\Downloads\\exe\\chromedriver.exe");
WebDriver driver = new ChromeDriver ();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.name("proceed")).click();
// we have to do two things to the POP UPS
//1.) WE have to get the text of the pop up
//2.) We have to click OK on the pop up



//to make you script wait for 5 seconds
Thread.sleep(5000);


//Right now we have to switch to the POP UP screen
 Alert alert =driver.switchTo().alert();
 //alert is object reference
 System.out.println(alert.getText());
 
 

 String text = alert.getText();
 if (text.equals("Please enter a valid user name")){
 System.out.println("That is the right message");
 }
 else{
	 System.out.println("That is the wrong message");
	 alert.accept();//click on OK btn
	 //alert.dismiss(); to cancel the alert pop up
 }
	}}

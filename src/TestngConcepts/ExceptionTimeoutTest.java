package TestngConcepts;

import java.text.NumberFormat;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
	//Timeout - means it should not take more than specified time
	//here 2 seconds
	public void infinteloop(){
		int i =1;
		while(i==1){
			System.out.println(i);
		}
	}
	
}

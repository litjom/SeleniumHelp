package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 10)//invocation count is used to execute the test no of time
	//in this this TESTCASE  will EXECUTE 10 TIMES
	public void sum(){
		int a = 10;
		int b= 20;
		int c=a+b;
		System.out.println("The sum is..."+c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

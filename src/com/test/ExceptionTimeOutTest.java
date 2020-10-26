package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	
@Test(invocationTimeOut=2,expectedExceptions="NumberFormatException")
//EXPECTED EXCEPTION is the exception that is expected so you are telling basically
//So please dont mark the test case as failed


//If theres an infinite loop, since TIMEOUT ANNOTATION is added, it will be given 2 millisecon
//in this case
public void infintieloopTest(){
	int i =1;
	while(i==1){
		System.out.println(i);//It will generate an infinite loop
		//because we are not increasing the value of 'i'
	}
}

@Test(expectedExceptions=NumberFormatException.class)
public void test1(){
	String x ="100A";//cannot convert 100a in to integer
	Integer.parseInt(x);
}












}

package com.test;

import org.testng.annotations.Test;

public class TestngFeatures {
@Test
public void login(){
	System.out.println("Login test");
}
//If login is failed the homepage will be skipped
@Test(dependsOnMethods="Login")
public void HomePageTest(){
	System.out.println("Home Page test");
}


@Test(dependsOnMethods = "Login")
public void Searchpage(){
	System.out.println("Search test");
}

@Test(dependsOnMethods = "Login")
public void RegistrationPage(){
	System.out.println("Registration test");
}












}

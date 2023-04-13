package com.edureka.testPackage;
	
	
	import org.testng.annotations.Test;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	 
	import com.edureka.frameworkPackage.BrowserFactory1;
	import com.edureka.frameworkPackage.CaptureScreenShot;

	import edureka.uiPackage.BookFlightPage;
	import edureka.uiPackage.FlightConfirmationPage;
	import edureka.uiPackage.FlightFinderPage;
	import edureka.uiPackage.LoginPage;
	import edureka.uiPackage.SelectFlightPage;

	 
	public class TestCaseClass extends BrowserFactory1 {
	 
	
	public TestCaseClass(){
	
	}
	
	@Test
	public void returnTicket() {
	try {
	System.out.println("in returnTicket");
	driver.get("https://demo.guru99.com/test/newtours");
	LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
	LoginPage.loginWordPress("neha", "mercury");
	FlightFinderPage FlightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
	FlightFinderPage.continueWordPress("1","Zurich","July","12","Frankfurt","September","15","Business Class","Unified Airlines");
	SelectFlightPage SelectFlightPage = PageFactory.initElements(driver, SelectFlightPage.class);
	SelectFlightPage.departAirlineWordPress("Pangaea Airlines 362");
	SelectFlightPage.returnAirlineWordPress("Unified Airlines 363");
	SelectFlightPage.continu();
	BookFlightPage BookFlightPage = PageFactory.initElements(driver, BookFlightPage.class);
	BookFlightPage.purchasePress("Anirudh", "AS", "Vegetarian", "MasterCard", "12345678", "12", "2008", "Anirudh", "A", "S");
	FlightConfirmationPage FlightConfirmationPage = PageFactory.initElements(driver, FlightConfirmationPage.class);
	
	FlightConfirmationPage.logoutPress();
	} 
	catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
		
	}
		
	@Test(priority = 4)
	public void verifyCookiesHandle() throws InterruptedException, IOException {
		
	}
	@Test(priority = 5)
	public void verifyMouseHover() throws InterruptedException, IOException {
		
		
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	}
	
	
	
	

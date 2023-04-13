package com.edureka.frameworkPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory1 {
	
		
		public static WebDriver driver;
		 
		
		public static void main(String[] args) throws InterruptedException {
			
			//To load your driver file  
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
					//To establish network connection from remote
					
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");
					//creating object for chrome driver
					
					WebDriver driver = new ChromeDriver(options);
					//WebDriver driver=new ChromeDriver();
					
					//To open and maximize the window.
					driver.manage().window().maximize();
					//To open a url 
					driver.get("https://demo.guru99.com/test/newtours");
					//To print the title of web page
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
					driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
					Thread.sleep(2000);
		}
		
		public static WebDriver getDriver(String browserName){
			if(driver==null){
			
			if(browserName.equalsIgnoreCase("chrome")){
			System.out.println("in chrome");
			}
		
			}
			return driver;	
		}
		
}
